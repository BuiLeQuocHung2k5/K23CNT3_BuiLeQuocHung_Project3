package k23cnt3.blqh.pj3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import k23cnt3.blqh.pj3.repository.ProductRepository;

@Controller
public class HomeController {
    private final ProductRepository productRepository;

    public HomeController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/HomePage")
    public String home(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "HTML/HomePage";
    }

}
