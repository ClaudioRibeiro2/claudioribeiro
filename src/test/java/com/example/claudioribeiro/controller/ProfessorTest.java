package com.example.claudioribeiro.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {
    private final Professor p1 = new Professor(1500);
    @Test
    void test(){
        System.out.println(p1.toString());
        p1.setSalario(1500);
        System.out.println(p1.toString());
    }
}
