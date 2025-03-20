package org.codenova.studymate.controller;


import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.codenova.studymate.model.entity.LoginLog;
import org.codenova.studymate.model.entity.User;
import org.codenova.studymate.repository.LoginLogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
@AllArgsConstructor
public class MyController {
    private LoginLogRepository loginLogRepository;

    @RequestMapping("/profile")
    public String profileHandle(Model model, HttpSession session) {
        User user =(User)session.getAttribute("user");

        model.addAttribute("user",user);
        model.addAttribute("hiddenId",user.getId().substring(0,2)+"*****");
        LoginLog latestLog =loginLogRepository.findLatestByUserId(user.getId());
        model.addAttribute("latestLog",latestLog);

        return "my/profile";
    }
}
