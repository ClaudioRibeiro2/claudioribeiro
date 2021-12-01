package com.example.claudioribeiro.controller;

public class Aluno {
    public int matricula;
    public int media;

    public Aluno(int matricula) {
        this.matricula= matricula;
    }

    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public int getMedia() {return media;}
    public void setMedia(int media) {this.media = media;}

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}
