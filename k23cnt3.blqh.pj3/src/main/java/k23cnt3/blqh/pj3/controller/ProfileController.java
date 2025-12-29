package k23cnt3.blqh.pj3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import k23cnt3.blqh.pj3.repository.ProductRepository;

@Controller
public class ProfileController {

    @GetMapping("/Profile")
    public String index(Model model) {

        return "HTML/Profile";
    }
}
