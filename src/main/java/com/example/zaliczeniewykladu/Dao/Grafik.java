package com.example.zaliczeniewykladu.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "grafik")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grafik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Usługi usługi;

    private Date data;


}


/*
    create table `grafik` (
        `id` bigint not null auto_increment,
        `data` date,
        `rodzaj_uslugi` varchar(50),
        primary key(`id`))
*/
