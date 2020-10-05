/**
 *Faça um algoritmo que calcule a área e o perímetro de um retângulo recebendo de entrada os valores dos
    lados.
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;

public class Luiz07 {
    public static void main(String[] args){
        int altura, comprimento, area;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor para a altura do seuy rentagulo:");
        altura= teclado.nextInt();
        System.out.println("Digite o valor para o comprimento do seu rentangulo:");
        comprimento= teclado.nextInt();
        
        area = altura * comprimento;
        
        System.out.println("O valor da area do seu retangulo é de:" +area);
        
    }
}
