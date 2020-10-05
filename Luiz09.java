/**
 *Implemente um algoritmo que receba o número de lados de um polígono convexo regular, calcule e mostre
    o número de diagonais desse polígono. Sabe-se que ND = N*(N – 3)/2, em que N representa o número de
    lados do polígono.
    * 
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
