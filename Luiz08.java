/**
 *Zé Borba Gato é dono de um terreno na cidade de Sabará e deseja saber qual seria o preço médio de venda
    desse terreno. Conforme visto na planta do mesmo, nota-se que o lote possui um formato de trapézio
    (Figura abaixo).
    * 
    * Assim sendo, dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e
    sabendo o valor médio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a área
    total e o valor médio de venda (R$) que Zé Borba Gato pode pedir pelo terreno.
    * 
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
