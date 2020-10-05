/**
    Faça um algoritmo que leia dois valores numéricos e armazene nas variáveis A e B, após isso, efetue a
    troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. Imprima os
    valores após troca. 
    * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;

public class Luiz22 {
    public static void main(String[] args){
        int num1, num2;
        int A,B;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o valor para A:");
        num1=teclado.nextInt();
        
        System.out.println("Digite o valor para B");
        num2 = teclado.nextInt();
        
       B = num1;
       A = num2;
       
       System.out.println("O valor para A e B respectivamente:\n"+A+"\n"+B);
        
        
    }
}
