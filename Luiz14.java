/**
 *Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m2, deve-se usar 18 W de
    potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e
    mostre a área de mesmo (em m2) e a potência de iluminação necessária para iluminar corretamente o
    cômodo.
    * 
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
