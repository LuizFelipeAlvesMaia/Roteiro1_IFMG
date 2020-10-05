/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;

public class Luiz08 {
    public static void main(String[] args){
        int baseMenor, BaseMaior, altura, area, valorDoMetroQuadrado, valorDaAreaTotal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da baseMenor:");
        baseMenor = teclado.nextInt();
        
        System.out.println("Digite o tamnho da BaseMaior:");
        BaseMaior =  teclado.nextInt();
        
        System.out.println("Digite o valor da altura:");
        altura = teclado.nextInt();
        
        System.out.println("Digite o valor a ser pago por metro quadrado");
        valorDoMetroQuadrado = teclado.nextInt();
        
        area = ((baseMenor + BaseMaior) * altura)/2;
        
        valorDaAreaTotal = valorDoMetroQuadrado * area;
        
        System.out.println("O total da area é de:\n" +area+ "\n E o valor da area é de:\n" +valorDaAreaTotal);
        
        
    }
}
