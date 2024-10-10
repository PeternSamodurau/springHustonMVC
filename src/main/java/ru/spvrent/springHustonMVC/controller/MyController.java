package ru.spvrent.springHustonMVC.controller;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.spvrent.springHustonMVC.exceptions.CustomException;

import java.util.Date;

@Slf4j
@Controller
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello")
    public String hello(Model model) {
        try {
            model.addAttribute("message", "Hello, Spring MVC!");
            model.addAttribute("dateToday", new Date());
            log.info("Successfully completed hello()");
            return "helloworld";
        } catch (Exception e) {
            log.error("Error in hello()", e);
            throw new CustomException("Failed to load the hello page");
        }
    }
}
