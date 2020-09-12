package my.words.web;

import my.words.dao.Dao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class WordsController {
    private Dao dao;

    public WordsController(Dao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/", method = GET)
    public String home(Model model) {
        PartForm partForm = new PartForm();
        model.addAttribute(partForm);
        return "main";
    }

    @RequestMapping(value = "/list", method = POST)
    public String showList(Model model, PartForm partForm) {
        System.out.println(partForm.getPart());
        return "wordList";
    }
}


