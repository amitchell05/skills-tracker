package com.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value = "")
public class SkillsController {

    @GetMapping
    public String starterList() {
        String html =
                "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    public String skillsTrackerForm() {
        String html = "<form method='post'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' name='name' /><br>" +
                "<label for='firstFav'>My favorite language:</label><br>" +
                "<select name='firstFav' id='firstFav'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<label for='secondFav'>My second favorite language:</label><br>" +
                "<select name='secondFav' id='secondFav'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<label for='thirdFav'>My third favorite language:</label><br>" +
                "<select name='thirdFav' id='thirdFav'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' />" +
                "</form>";
        return html;
    }

    @PostMapping("form")
    public String skillsTrackerList(@RequestParam String name, @RequestParam String firstFav, @RequestParam String secondFav, @RequestParam String thirdFav) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstFav + "</li>" +
                "<li>" + secondFav + "</li>" +
                "<li>" + thirdFav + "</li>" +
                "</ol>";
        return html;
    }

}
