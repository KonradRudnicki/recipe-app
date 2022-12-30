package konradrudnicki.springframework.controllers;


import konradrudnicki.springframework.domain.Category;
import konradrudnicki.springframework.domain.UnitOfMeasure;
import konradrudnicki.springframework.repositories.CategoryRepository;
import konradrudnicki.springframework.repositories.UnitOfMeasureRepository;
import konradrudnicki.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
