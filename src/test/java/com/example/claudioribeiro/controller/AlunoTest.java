package com.example.claudioribeiro.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    private final Aluno a1 = new Aluno(102425);
    @Test
    void test(){
        System.out.println(a1.toString());
        a1.setMatricula(102425);
        System.out.println(a1.toString());
    }
}
