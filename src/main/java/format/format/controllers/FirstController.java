package format.format.controllers;


import format.format.service.ForChangeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.tags.Param;

@Controller
@RequestMapping()
public class FirstController {

    ForChangeService forChangeService;

    public FirstController(ForChangeService forChangeService) {
        this.forChangeService = forChangeService;
    }


    @GetMapping("/index")
    public String info(Model model,@RequestParam(name="searchString", required=false, defaultValue="World") String searchString){
        if(searchString != null){
            String changeResult = forChangeService.change(searchString);
            model.addAttribute("changeResult", changeResult);
        }
        return "index";
    }


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        model.addAttribute("name", name);
        return "greeting";
    }
}
