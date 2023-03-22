/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */

package com.mycompany.excepcionesej5;

import static java.lang.Math.random;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ExcepcionesEj5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        int random = (int) (Math.random() * 500 + 1);
        int respuesta = 0;
        int contador = 0;
        
        
        System.out.println(random);
        
        
        do{
        contador++;
        respuesta = adivinar(random);
            if ( respuesta > random){
            System.out.println("El número es menor a " + respuesta);            
            }
            if (respuesta < random){
            System.out.println("El numero es mayor a " + respuesta);
            }        
        }while(respuesta != random);            
        
        System.out.println("Adivinaste! Cantidad de intentos: " + contador);       
        
    }
    
    public static int adivinar(int random){
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el numero");               
        int respuesta = 0;
        
            try{                
            respuesta = leer.nextInt();        
            }catch(InputMismatchException e){
            System.out.println("Error: valor ingresado incorrecto");           
            }
            
        return respuesta;
    }
}


