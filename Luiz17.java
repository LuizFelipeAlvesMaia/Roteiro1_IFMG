/**
 *Faça um programa que receba de entrada um número real, encontre e mostre:
    a. A parte inteira desse número;
    b. A parte fracionária desse número.
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz17 {
    public static void main(String[] args){
        double numero, parteFracionada;
        int parteInteira;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero real qualquer:");
        numero = teclado.nextDouble();
        
        parteFracionada = (double)(numero - (int)numero);
        
        parteInteira = (int) (numero - (double)parteFracionada);
        
        System.out.println("A parte fracionada do seu número é:" +parteFracionada);
        System.out.println("A parte inteira do seu número é:" +parteInteira);

    }
}
