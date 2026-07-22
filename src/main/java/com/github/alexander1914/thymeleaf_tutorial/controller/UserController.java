package com.github.alexander1914.thymeleaf_tutorial.controller;

import com.github.alexander1914.thymeleaf_tutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    /// Handler method to handle variable-expression request
    // http://localhost:8080/variable-expression
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Alexander", "alexander.oliveira99@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    /// Handler method to handle selection expression
    // http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Alexander", "alexander.oliveira99@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    /// Handler method to handle message expressions request
    // http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    /// Handler method to handle link expressions
    // http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id", 1);
        return "link-expression";
    }

    //
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }
}
