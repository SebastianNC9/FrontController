package org.example.frontcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class FrontController {

    @GetMapping("/inicio")
    public String principal(@RequestParam(name = "opcion", required = false, defaultValue = "1") String opcion, Model model) {
        model.addAttribute("opcion", opcion);
        return "inicio";
    }
}
