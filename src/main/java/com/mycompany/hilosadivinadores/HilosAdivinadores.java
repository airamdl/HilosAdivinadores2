/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hilosadivinadores;

/**
 *
 * @author airam
 */
public class HilosAdivinadores {

    public static void main(String[] args) {
        NumeroOculto numeroOculto = new NumeroOculto();

        for (int i = 1; i <= 10; i++) {
            Adivinador adivinador = new Adivinador(numeroOculto, "Hilo " + i);
            adivinador.start();
        }
    }
}
