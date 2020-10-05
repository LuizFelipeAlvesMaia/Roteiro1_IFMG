/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz04 {
     public static void main(String[] args){
        int nota1,nota2, nota3;
        int peso1, peso2, peso3;
        double mediaPond;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite a nota 1:");
        nota1 = teclado.nextInt();
        System.out.println("Digite o valor do peso da primeira nota");
        peso1 = teclado.nextInt();
        
        System.out.println("Digite a nota 2:");
        nota2 = teclado.nextInt();
        System.out.println("Digite o valor do peso da segunda nota");
        peso2 = teclado.nextInt();
        
        System.out.println("Digite a nota 3:");
        nota3 = teclado.nextInt();
        System.out.println("Digite o valor do peso da terceira nota");
        peso3 = teclado.nextInt();
        
        mediaPond = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))/(peso1 + peso2 + peso3);
        
        System.out.println("A média ponderada das notas é:" +mediaPond);
        
    }
}
