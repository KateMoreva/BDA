package spbstu.lab;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

@Controller
@RequestMapping(path = "/search")
public class ESearchController {

    @PostMapping("/foo")
    public String showPage(Model model, @ModelAttribute("queryRequest") QueryRequest bean) {
        System.out.println("Date planted: " + bean.getQuery()); //in reality, you'd use a logger instead :)
        HHDataResords resords = get(bean.getQuery());
        model.addAttribute("hHDataResords", resords);
        return "fullresponce";
    }

//
//
//    public String showPage(Model model) {
//        QueryRequest bean = (QueryRequest) model.getAttribute("queryRequest");
//        System.out.println("Date planted: " + bean.getQuery()); //in reality, you'd use a logger instead :)
//        HHDataResords resords = get(bean.getQuery());
//        model.addAttribute("hHDataResords", resords);
//        return "fullresponce";


    //   city:Москва"
//    }


    public HHDataResords get(String query) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://elastic-container:9200/train/_search?q=" + query))
                    .GET()
                    .header("accept", "application/json")
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            DataResponce vacancy = gson.fromJson(response.body(), DataResponce.class);
            JSONObject jsonObject = new JSONObject(response.body());
//        Object resords =  jsonObject.get("hits");
//        Object eData =  jsonObject.getJSONObject("hits").getJSONArray("hits").get(0);
//        Object rew =  jsonObject.getJSONObject("hits").getJSONArray("hits").getJSONObject(0).getJSONObject("_source").get("review_id");
//        HHData hh = gson.fromJson(jsonObject.getJSONObject("hits").getJSONArray("hits").getJSONObject(0).getJSONObject("_source").toString(), HHData.class);
            HHDataResords hhdr = gson.fromJson(jsonObject.get("hits").toString(), HHDataResords.class);
            return hhdr;
        } catch (IOException | InterruptedException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
