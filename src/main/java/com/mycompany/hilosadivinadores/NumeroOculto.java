/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilosadivinadores;

/**
 *
 * @author airam
 */
import java.util.Random;

public class NumeroOculto {
    private int numero;
    private boolean juegoTerminado;

    public NumeroOculto() {
        Random rand = new Random();
        this.numero = rand.nextInt(101);
        this.juegoTerminado = false;
    }

    public synchronized int propuestaNumero(int num) {
        if (juegoTerminado) {
            return -1; 
        }
        if (num == numero) {
            juegoTerminado = true; 
            return 1; 
        }
        return 0; 
    }
}
