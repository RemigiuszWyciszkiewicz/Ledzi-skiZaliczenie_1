package com.example.zaliczeniewykladu.Service;

import com.example.zaliczeniewykladu.Dao.Fryzjer;
import com.example.zaliczeniewykladu.Repository.FryzjerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
public class FryzjerService {

    @Autowired
    FryzjerRepo fryzjerRepo;

    //SimpleDateFormat sdfIn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @PostConstruct
    @Transactional
    void initvalues() throws ParseException {

        Fryzjer fryzjer_1 = new Fryzjer("Adam","Szymanski",2);
        Fryzjer fryzjer_2 = new Fryzjer("Karolina","Chajdarowska",20);
        Fryzjer fryzjer_3 = new Fryzjer("Aneta","Kruk",8);

        fryzjerRepo.save(fryzjer_1);
        fryzjerRepo.save(fryzjer_2);
        fryzjerRepo.save(fryzjer_3);

    }


}
