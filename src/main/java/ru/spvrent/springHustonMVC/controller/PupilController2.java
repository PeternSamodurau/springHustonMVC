package ru.spvrent.springHustonMVC.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.spvrent.springHustonMVC.model.Pupil;

@Slf4j
@Controller
@RequestMapping("/api")
public class PupilController2 {
    @GetMapping("/showPupilForm2")
    public String showPupilForm2(Model model) {
        Pupil pupil = new Pupil();
        model.addAttribute("pupil", pupil);
        log.info("=== Successfully completed showPupilForm()",pupil);
        return "pupilForm2";
    }
    @PostMapping("/processPupilForm2")
    public String processPupilForm2(@ModelAttribute("pupil") Pupil pupil) {

        System.out.println("Pupil = " + pupil);

        log.info("=== Successfully completed processPupilForm()",pupil);

        return "pupil-info2";
    }
}
