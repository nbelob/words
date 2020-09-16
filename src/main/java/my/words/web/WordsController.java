package my.words.web;

import my.words.dao.Dao;
import my.words.domain.WordObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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

    @RequestMapping(value = "/list", method = GET)
    public String showList(@RequestParam(name = "part") int part, Model model) {
        String partS = "";
        if (part == 1)
            partS = "Существительные";
        else if (part == 2)
            partS = "Глаголы";
        else partS = "Прилагательные";
        List<WordObject> words;
        words = dao.findWords(part);
        model.addAttribute("part", part);
        model.addAttribute("partS", partS);
        model.addAttribute(words);
        return "wordList";
    }

    @RequestMapping(value = "/add", method = POST, params = "add")
    public String addWord(@RequestParam(name = "part") int part, Model model) {
        EditForm editForm = new EditForm(part, "", "");
        model.addAttribute(editForm);
        return "editWord";
    }

    @RequestMapping(value = "/add", method = POST, params = "ok")
    public String additionWord(Model model, EditForm editForm) {
        if (editForm.getWord().isBlank() || editForm.getWord().isEmpty() ||
                editForm.getTrans().isBlank() || editForm.getTrans().isEmpty()) {
            model.addAttribute(editForm);
            return "editWord";
        } else {
            dao.addWord(editForm.getTypeWord(), editForm.getWord(), editForm.getTrans());
            return "redirect:/list/?part=" + String.valueOf(editForm.getTypeWord());
        }
    }

    @RequestMapping(value = "/edit", method = POST)
    public String editWord(@RequestParam(name = "id") int id) {
        System.out.println(id);
        return "editWord";
    }

    @RequestMapping(value = "/del", method = POST)
    public String delWord(@RequestParam(name = "id") int id, @RequestParam(name = "typeWord") int typeWord) {
        dao.delWord(id);
        return "redirect:/list/?part=" + String.valueOf(typeWord);
    }
}
