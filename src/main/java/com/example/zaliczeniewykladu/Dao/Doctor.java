package com.example.zaliczeniewykladu.Dao;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstname;
    private String surename;

    @Enumerated(EnumType.STRING)
    private Specialization specialization;

}

/*
    CREATE TABLE `doctor` (
        `id` bigint(20) NOT NULL AUTO_INCREMENT,
        `firstname` varchar(50) DEFAULT NULL,
        `surename` varchar(60) DEFAULT NULL,
        `specialization` varchar(50) DEFAULT NULL,
        PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
*/
