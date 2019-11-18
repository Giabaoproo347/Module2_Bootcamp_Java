package Controller;
import Model.TuDien;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("index")
    public String index() {
        return "index";
    }

    @PostMapping("translate")
    public String translate(@RequestParam String word, Model model) {
        model.addAttribute("word", word);
        if (TuDien.dictionary.containsKey(word)) {
            model.addAttribute("translate",TuDien.dictionary.get(word));
        } else {
            model.addAttribute("translate", "Not found");
        }
        return "translate";
    }
}

