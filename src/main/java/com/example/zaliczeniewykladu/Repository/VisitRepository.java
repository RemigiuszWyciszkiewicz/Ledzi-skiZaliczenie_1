package com.example.zaliczeniewykladu.Repository;

import com.example.zaliczeniewykladu.Dao.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VisitRepository extends JpaRepository<Visit,Long> {
}
