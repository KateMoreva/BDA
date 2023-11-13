package spbstu.lab.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/analyse-hh")
public class ClientController {
    @GetMapping(path = "/general")
    public String getWelcomePage(Model model) {
        return "general";
    }


}