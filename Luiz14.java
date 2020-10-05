/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz14 {
     public static void main(String[] args){
        int largura, comprimento, area, luminosidade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da largura do seu comodo em metros:");
        largura = teclado.nextInt();
        
        System.out.println("Digite o valor do comprimento do seu comodo em metros:");
        comprimento = teclado.nextInt();
        
        area = largura * comprimento;
        
        luminosidade = area * 18; 
        //se cada lampada for 18w podemos dividir a luminosidade pelo valor da potencia e descobria aquantidade de lampadas
        
        System.out.println("O valor da área do comodo é de \n:" +area+"m^2");
        System.out.println("O valor da aréa de luminosidade é de: \n:" +luminosidade+"W");

        
        
        
        
    }
}
