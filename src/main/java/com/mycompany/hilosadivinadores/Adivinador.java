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

public class Adivinador extends Thread {
    private NumeroOculto numeroOculto;
    private String nombre;

    public Adivinador(NumeroOculto numeroOculto, String nombre) {
        this.numeroOculto = numeroOculto;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random rand = new Random();

        while (true) {
            int propuesta = rand.nextInt(101);
            int resultado = numeroOculto.propuestaNumero(propuesta);

            if (resultado == -1) {
                System.out.println(nombre + ": El juego finalizó");
                break;
            } else if (resultado == 1) {
                System.out.println(nombre + ": Número adivinado, era " + propuesta);
                break;
            } else {
                System.out.println(nombre + ": No he acertado. Mi propuesta fue " + propuesta);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
