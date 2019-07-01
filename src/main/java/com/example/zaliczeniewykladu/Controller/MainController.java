package com.example.zaliczeniewykladu.Controller;

import com.example.zaliczeniewykladu.Dao.Grafik;
import com.example.zaliczeniewykladu.Service.ZakladFryzjerskiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

    @Autowired
    ZakladFryzjerskiService zakladFryzjerskiService;





    @GetMapping("/")
    public String getData(Model model)
    {
        model.addAttribute("fryzjerzy",zakladFryzjerskiService.pobierzListeFryzjerow());
        model.addAttribute("grafik",zakladFryzjerskiService.pobierzGrafik());
        model.addAttribute("grafikDlaFryzjera",new InputFromUser());


        return "firstPage";
    }

    @PostMapping("/grafik")
    public String pobierzGrafikDlaOkreslonegoFryzjeraWOkreslonymDniu(Model model,@ModelAttribute("grafikDlaFryzjera") InputFromUser daneOdUsera) {



        List<Grafik> grafiks=zakladFryzjerskiService.pobierzGrafik().stream()
                .filter(grafik -> grafik.getData().getDayOfMonth() == daneOdUsera.getDzien() )
                .filter(grafik -> grafik.getFryzjer().getImie().equals(daneOdUsera.getImieFryzjera()) )
                .filter(grafik -> grafik.getFryzjer().getNazwisko().equals(daneOdUsera.getNazwiskoFryzjera()))
                .collect(Collectors.toList());


        model.addAttribute("grafikDlaFryzjera" , grafiks);
        return "grafik";
    }

//CA

}
