/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz09 {
    public static void main( String[] args){
    int lados, ND;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a quantidade de lados do seu poligono");
    lados = teclado.nextInt();
    
    ND = (lados*(lados - 2))/ 2;
    
    System.out.println("O numero de diagonais do poligono são:" +ND);
}    
}
