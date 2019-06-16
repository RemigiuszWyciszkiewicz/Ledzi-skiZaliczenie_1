package com.example.zaliczeniewykladu.Controller;

import com.example.zaliczeniewykladu.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HospitalControlaer {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/")
    String getData()
    {
        return "firstPage";
    }


}
