/**
 * Implemente um algoritmo que leia um número inteiro e imprima seu antecessor e seu sucessor.
 * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz02 {
     public static void main(String[] args){
        int numero, antecessor, sucessor;
        Scanner teclado =  new Scanner(System.in);
       
        System.out.println("Digite um número inteiro");
        numero = teclado.nextInt();
        
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        System.out.println("O sucessor do número digitado é:" +sucessor);
        System.out.println("O antecessor do número digitado é:" +antecessor);
        
    }
}
