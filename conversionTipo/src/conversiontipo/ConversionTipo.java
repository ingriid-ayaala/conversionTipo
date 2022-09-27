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
        int num1 = 5;
        
        System.out.println("\nIntroduce un numero: \n");
        String cad = dato.next();
        int num = Integer.parseInt(cad);
        System.out.println(cad);
        System.out.println("la suma es"+(num1+num));
        
        //String cad="10",guardoEnt; 
        //dato = Integer.parseInt(cad); // ya convertimos en entero la cadena
        //System.out.println("Valores de las variables\n" + "ent=" +ent+"\nguardoCad="+guardoCad);
        //System.out.println("Test---->"+(guardoCad+ent));
        
    }
    
}
