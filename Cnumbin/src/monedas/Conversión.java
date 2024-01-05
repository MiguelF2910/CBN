/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monedas;

/**
 *
 * @author migue
 */
public class Conversión {
    public static void main(String []args){
    int numeroDecimal = 23; // Ingresa el número decimal que quieres convertir

        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        System.out.println("El numero binario equivalente a " + numeroDecimal + " es: " + numeroBinario);
}
}
