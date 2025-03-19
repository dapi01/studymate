package org.codenova.studymate.controller;

import org.codenova.studymate.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my")
public class MyController {

    @RequestMapping("/profile")
    public String MyHandle(@ModelAttribute User user, Model model){

        return "my/view";
    }

}
