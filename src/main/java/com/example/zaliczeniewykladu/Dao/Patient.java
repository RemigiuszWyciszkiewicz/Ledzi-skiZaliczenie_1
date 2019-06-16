package com.example.zaliczeniewykladu.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstname;
    private String surename;
    private int age;
    private String telNumber;

    @OneToOne
    //@JoinColumn(name = "visit_id")
    private Visit visit;
}
/*
    CREATE TABLE `patient` (
        `id` bigint(20) NOT NULL AUTO_INCREMENT,
        `firstname` varchar(50) DEFAULT NULL,
        `surename` varchar(60) DEFAULT NULL,
        `age` int(10) DEFAULT NULL,
        `telNumber` varchar(50) DEFAULT NULL,
        `visit_id` bigint(20) DEFAULT NULL,
        PRIMARY KEY (`id`),
        KEY `visit_id` (`visit_id`),
        CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`visit_id`) REFERENCES `visit` (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci*/
