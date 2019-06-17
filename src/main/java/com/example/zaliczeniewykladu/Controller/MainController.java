package com.example.zaliczeniewykladu.Controller;

import com.example.zaliczeniewykladu.Service.ZakladFryzjerskiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    ZakladFryzjerskiService zakladFryzjerskiService;




    @GetMapping("/")
    public String getData(Model model)
    {
        model.addAttribute("fryzjerzy",zakladFryzjerskiService.pobierzListeFryzjerow());
        return "firstPage";
    }




}
