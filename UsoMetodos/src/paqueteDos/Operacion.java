/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;

/**
 *
 * @author Granda
 */
public class Operacion {
    public static void presentarTabla(int a, int limite){
        
        int op;
        String cadena = String.format("Tabla del %d\n", a);
        for (int i=1; i<=limite; i++){
            op = a * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, a, i , op);
            
        }
        System.out.printf("%s\n", cadena);
    }
    
}
