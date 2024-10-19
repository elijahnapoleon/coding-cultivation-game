package tallydev.codetivation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @GetMapping("/")
    public String showMainMenu(Model model) {
        model.addAttribute("options", getMainMenuOptions());
        return "main-menu";
    }
    private List<String> getMainMenuOptions() {
        List<String> options = new ArrayList<>();
        options.add("Start New Game");
        options.add("Load Game");
        options.add("Settings");
        options.add("Credits");
        return options;
    }
    @GetMapping("/new-game")
    public String startNewGame() {
        return "new-game";
    }
    @GetMapping("/load-game")
    public String loadGame() {
        return "load-game";
    }
    @GetMapping("/settings")
    public String showSettings() {
        return "settings";
    }
}