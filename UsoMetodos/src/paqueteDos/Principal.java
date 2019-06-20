/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;

import java.util.Scanner;

/**
 *
 * @author Granda
 */
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el valor de la tabla:");
        int valorA = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla:");
        int valorB = entrada.nextInt();
        Operacion.presentarTabla(valorB, valorB);
    }
    
}
