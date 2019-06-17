package com.example.zaliczeniewykladu.Dao;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "fryzjer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fryzjer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String imie;
    private String nazwisko;

    private int staz_pracy;


}

