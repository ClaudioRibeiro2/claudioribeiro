package com.example.claudioribeiro.controller;

public class Professor {
    public int salario;

    public Professor(int salario){
        this.salario = salario;
    }

    public int getSalario() {return salario;}
    public void setSalario(int salario) {this.salario = salario;}

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                '}';
    }
}
