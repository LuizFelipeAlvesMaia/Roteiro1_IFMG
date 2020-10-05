/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
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
