package ru.spvrent.springHustonMVC.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/api")  // все методы будут относиться к этому контроллеру
public class PupilController1 {
    @RequestMapping(value = "/showPupilForm1", method = RequestMethod.GET) // можно указать какой метод использовать, можно просто указать @GetMapping("/showPupilForm")
    public String showPupilForm() {
        log.info("Successfully completed showPupilForm()");
        return "pupilForm1";
    }

    @GetMapping("/processPupilForm1") // конкретно указали что будет использоваться метод GET
    public String processPupilForm(@RequestParam("pupilName") String pupilName, Model model) {               //вместо этого(HttpServletRequest request, Model model)----> @RequestParam("pupilName") String pupilName
       // String oldName = request.getParameter("pupilName");             // получаем имя из формы, оно может быть не корректным
        String oldName = pupilName;
        oldName.toLowerCase();                                           // приводим имя к нижнему регистру
        String correctName = "";
        String[] words = oldName.split(" ");                             // разбиваем имя на слова
        for (String word : words) {
            correctName += word.substring(0, 1).toUpperCase() + word.substring(1) + " "; // делаем первую букву каждого слова заглавной
        }
        correctName = correctName.trim(); // удаляем пробелы в начале и в конце строки

        model.addAttribute("oldName", oldName);
        model.addAttribute("correctName", correctName);

        log.info("Successfully completed processPupilForm()");
        return "pupil-info1";
    }

}
