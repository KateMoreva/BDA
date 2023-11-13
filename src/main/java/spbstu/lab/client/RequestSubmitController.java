package spbstu.lab.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RequestSubmitController {

    @RequestMapping(value = "/submitLoadThisMonthTask", method = RequestMethod.POST)
    public String submitLoadThisMonthTask(Model model, RedirectAttributes redirectAttributes) {
        return "";
    }
}
