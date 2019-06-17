package com.example.zaliczeniewykladu.Service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
public class FryzjerService {



    SimpleDateFormat sdfIn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @PostConstruct
    @Transactional
    void initvalues() throws ParseException {


    }


}
