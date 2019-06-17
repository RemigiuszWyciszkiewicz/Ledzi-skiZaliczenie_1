package com.example.zaliczeniewykladu.Dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private Usługi rodzaj_uslugi;

    private LocalDateTime data;


    @ManyToOne
    private Fryzjer fryzjer;




}


