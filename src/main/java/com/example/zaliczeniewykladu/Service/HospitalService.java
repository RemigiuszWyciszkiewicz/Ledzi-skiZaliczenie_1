package com.example.zaliczeniewykladu.Service;

import com.example.zaliczeniewykladu.Dao.Doctor;
import com.example.zaliczeniewykladu.Dao.Specialization;
import com.example.zaliczeniewykladu.Repository.DoctorRepository;
import com.example.zaliczeniewykladu.Repository.PatientRepository;
import com.example.zaliczeniewykladu.Repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;

@Service
public class HospitalService {

    @Autowired DoctorRepository doctorRepository;
    @Autowired PatientRepository patientRepository;
    @Autowired VisitRepository visitRepository;

    @PostConstruct
    @Transactional
    void initvalues()
    {
        Doctor doctor_1 = new Doctor(0L,"Adam","Szymański", Specialization.cardiologist);
        Doctor doctor_2 = new Doctor(0L,"Anna","Zajac", Specialization.dentist);
        Doctor doctor_3 = new Doctor(0L,"Marcin","Barcin", Specialization.familyDoctor);
        Doctor doctor_4 = new Doctor(0L,"Szymon","Zajac", Specialization.radiologist);
        doctorRepository.save(doctor_1);
        doctorRepository.save(doctor_2);
        doctorRepository.save(doctor_3);
        doctorRepository.save(doctor_4);
    }


}
