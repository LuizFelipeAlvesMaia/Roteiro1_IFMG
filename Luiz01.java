/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz01 {public static void main(String[] args) {
        int num1, num2, num3, soma;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor para o primeiro número");
        num1 = teclado.nextInt();
        
         System.out.println("Digite um valor para o segundo número");
        num2 = teclado.nextInt();
        
         System.out.println("Digite um valor para o terceiro número");
        num3 = teclado.nextInt();
        
        soma = num1 + num2 + num3;
        
        media = soma / 3;
        
        System.out.println("O valor da soma dos três números é:" +soma);
        System.out.println("O valor da média dos três números é:" +media);
         
       
        
    }
    
}
