
package com.mycompany.maiorde2;

import java.util.Scanner;

public class MaiorDe2 {

    public static void main(String[] args) {
        
        Scanner maior = new Scanner(System.in);
        
        int numero;
                
        System.out.println("Digite seu número");
        numero = maior.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("Número 1");
                if (numero < 2) {
                System.out.println("é menor que 2"); }
            break;
                
            case 2:
                System.out.println("Número 2");
                if (numero == 2) {
                System.out.println("é 2 irmão"); }
            break;
            
            case 3:
                System.out.println("Número 3");
                if (numero > 2) {
                 System.out.println("é maior que 2"); }
            break;
            
            default:
                System.out.println("Número não é 1, 2 ou 3");
                
        
        }        
                
        }
        
  
    }

