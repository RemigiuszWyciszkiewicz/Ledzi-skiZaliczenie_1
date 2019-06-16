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
    @JoinColumn(name = "visit_id")
    private Visit visit;
}
