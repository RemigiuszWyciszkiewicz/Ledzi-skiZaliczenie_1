package com.example.zaliczeniewykladu.Service;

import com.example.zaliczeniewykladu.Dao.Fryzjer;
import com.example.zaliczeniewykladu.Dao.Grafik;
import com.example.zaliczeniewykladu.Dao.Usługi;
import com.example.zaliczeniewykladu.Repository.FryzjerRepo;
import com.example.zaliczeniewykladu.Repository.GrafikRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ZakladFryzjerskiService {

    @Autowired
    FryzjerRepo fryzjerRepo;

    @Autowired
    GrafikRepo grafikRepo;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Transactional
    public List<Fryzjer> pobierzListeFryzjerow()
    {
        return this.fryzjerRepo.findAll();
    }
    @Transactional
    public List<Grafik> pobierzGrafik()
    {
        return this.grafikRepo.findAll();
    }


    @PostConstruct
    @Transactional
    void initvalues() throws ParseException {

        Fryzjer fryzjer_1 = new Fryzjer("Adam","Szymanski",2);
        Fryzjer fryzjer_2 = new Fryzjer("Karolina","Chajdarowska",20);
        Fryzjer fryzjer_3 = new Fryzjer("Aneta","Kruk",8);

      //  String now = "2016-11-09 10:30";

        Grafik grafik_1 = new Grafik(0L, Usługi.USŁGA_30MINUT , LocalDateTime.of(2019,10,21,11,00),fryzjer_1);
        Grafik grafik_2 = new Grafik(0L, Usługi.USŁGA_60MINUT , LocalDateTime.of(2019,10,21,11,15),fryzjer_2);
        Grafik grafik_3 = new Grafik(0L, Usługi.USŁGA_30MINUT , LocalDateTime.of(2019,10,21,13,30),fryzjer_1);
        Grafik grafik_4 = new Grafik(0L, Usługi.USŁGA_60MINUT , LocalDateTime.of(2019,10,22,14,45),fryzjer_1);
        Grafik grafik_5 = new Grafik(0L, Usługi.USŁGA_15MINUT , LocalDateTime.of(2019,10,22,15,00),fryzjer_3);

        fryzjerRepo.save(fryzjer_1);
        fryzjerRepo.save(fryzjer_2);
        fryzjerRepo.save(fryzjer_3);

        grafikRepo.save(grafik_1);
        grafikRepo.save(grafik_2);
        grafikRepo.save(grafik_3);
        grafikRepo.save(grafik_4);
        grafikRepo.save(grafik_5);

    }


}
