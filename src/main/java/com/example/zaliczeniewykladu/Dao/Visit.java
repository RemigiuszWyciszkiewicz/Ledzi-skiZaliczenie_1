package com.example.zaliczeniewykladu.Dao;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date date;
    private String place;
    private boolean isRefunded;

    @ManyToOne
    //@JoinColumn(name = "doctor_id")
    private Doctor doctor;
}

 /*   CREATE TABLE `visit` (
        `id` bigint(20) NOT NULL AUTO_INCREMENT,
        `date` date DEFAULT NULL,
        `place` varchar(60) DEFAULT NULL,
        `isRefunded` tinyint(1) DEFAULT NULL,
        `doctor_id` bigint(20) DEFAULT NULL,
        PRIMARY KEY (`id`),
        KEY `doctor_id` (`doctor_id`),
        CONSTRAINT `visit_ibfk_1` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci*/