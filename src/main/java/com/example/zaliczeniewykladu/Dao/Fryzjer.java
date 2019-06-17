package com.example.zaliczeniewykladu.Dao;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "fryzjer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fryzjer {

    public Fryzjer(String imie, String nazwisko, int staz_pracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.staz_pracy = staz_pracy;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String imie;
    private String nazwisko;

    private int staz_pracy;

    @OneToMany(mappedBy = "fryzjer")
    List<Grafik> grafikList = new ArrayList<>();

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}

