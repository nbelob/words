package my.words.web;

import my.words.dao.Dao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class WordsController {
    private Dao dao;

    public WordsController(Dao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/", method = GET)
    public String home() {
        return "main";
    }
}


