package com.example.zaliczeniewykladu.Service;

import com.example.zaliczeniewykladu.Dao.Doctor;
import com.example.zaliczeniewykladu.Dao.Patient;
import com.example.zaliczeniewykladu.Dao.Specialization;
import com.example.zaliczeniewykladu.Dao.Visit;
import com.example.zaliczeniewykladu.Repository.DoctorRepository;
import com.example.zaliczeniewykladu.Repository.PatientRepository;
import com.example.zaliczeniewykladu.Repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class HospitalService {

    @Autowired DoctorRepository doctorRepository;
    @Autowired PatientRepository patientRepository;
    @Autowired VisitRepository visitRepository;

    SimpleDateFormat sdfIn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @PostConstruct
    @Transactional
    void initvalues() throws ParseException {

        Doctor doctor_1 = new Doctor(0L,"Adam","Szymański", Specialization.cardiologist);
        Doctor doctor_2 = new Doctor(0L,"Anna","Zajac", Specialization.dentist);
        Doctor doctor_3 = new Doctor(0L,"Marcin","Barcin", Specialization.familyDoctor);
        Doctor doctor_4 = new Doctor(0L,"Szymon","Zajac", Specialization.radiologist);
        doctorRepository.save(doctor_1);
        doctorRepository.save(doctor_2);
        doctorRepository.save(doctor_3);
        doctorRepository.save(doctor_4);

        Visit visit_1 = new Visit(0L,sdfIn.parse("2014-03-09 20:18:38"),"Szpital w Bydgoszczy",true,doctor_2);
        Visit visit_2 = new Visit(0L,sdfIn.parse("2018-12-19 12:20:38"),"Przychodznia lekarska Wyszyńskiego",false,doctor_1);
        Visit visit_3 = new Visit(0L,sdfIn.parse("2022-10-20 18:18:38"),"Wojskowy Szpital w Rzeszowie",true,doctor_4);

        Patient patient_1 = new Patient(0L,"Remigiusz" , "Wyciszkiewicz" , 30, "4124141" , visit_1);
        Patient patient_2 = new Patient(0L,"Sebastian" , "Kulig" , 11, "4154141" , visit_2);
        Patient patient_3 = new Patient(0L,"katarzyna" , "Lipinska" , 30, "5426362" , visit_3);

        patientRepository.save(patient_1);
        patientRepository.save(patient_2);
        patientRepository.save(patient_3);




    }


}
