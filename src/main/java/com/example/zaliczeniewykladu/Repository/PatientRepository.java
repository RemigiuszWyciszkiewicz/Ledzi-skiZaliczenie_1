package com.example.zaliczeniewykladu.Repository;

import com.example.zaliczeniewykladu.Dao.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
