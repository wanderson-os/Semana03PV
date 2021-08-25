package com.mycompany.calculadorasemana3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wanderson
 */
public class GerenciaCalculos {

    double n1 = 0, n2 = 0;
    String sinal;

    public GerenciaCalculos() {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public double raiz(double n) {
        double resultado = 0;
        resultado = Math.sqrt(n);
        return resultado;
    }

    public double adicao(double n1, double n2) {
        double resultado = n1 + n2;
        return resultado;
    }

    public double subtracao(double n1, double n2) {
        double resultado = n1 - n2;
        return resultado;

    }

    public double multiplicacao(double n1, double n2) {
        double resultado = n1 * n2;
        return resultado;
    }

    public double divisao(double n1, double n2) {
        double resultado = n1 / n2;
        return resultado;
    }

    public double potencia(double n1, double n2) {
        double resultado =  Math.pow(n1, n2);
        return resultado;

    }
    

}
