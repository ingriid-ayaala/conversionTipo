/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiontipo;

import java.util.Scanner;


public class ConversionTipo {
static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println("Ejercicio convertir un String en un Intiger "
                +"\nPara comprobar que el cambio se hace correctamente, "
                + "realizaremos una suma,5 sera el numero sobre el que haremos la suma"
                +"\n_______________________________________________________________");
        int num1 = 5;//sera el numero sobre el que haremos la suma
        System.out.println("\nIntroduce un numero, que se guardara en un String : ");
        String cad = dato.next();
        int num = Integer.parseInt(cad);
        System.out.println("\nConvertimos un String en un Intiger: ");
        System.out.println("La suma es 5 + "+ num + " = "+(num1+num));
        
        /*en funcion de una nota quiero saber si el alumno esta 
        suspenso 
        
        */
        
        
        
        
        
        
        
        
        
        
        
        /*transformar un entero en un string -> String.valueOf(...),String.copyValueOf(data)-> recibe un arrays de caracteres 
        operadores =++x (suma y modifica el valor de la ex)
        x ++ lee el valor de la variable e incrementa
        = --x decrementa
        = xp-- posdrementa
         */
        //String cad="10",guardoEnt; 
        //dato = Integer.parseInt(cad); // ya convertimos en entero la cadena
        //System.out.println("Valores de las variables\n" + "ent=" +ent+"\nguardoCad="+guardoCad);
        //System.out.println("Test---->"+(guardoCad+ent));
        
    }
    
}
