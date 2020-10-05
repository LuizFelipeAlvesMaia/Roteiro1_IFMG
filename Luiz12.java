/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz12 {
     public static void main(String[] args){
        int distanciaQueVaiPercorrer;
        double ruaC,ruaA, ruaB, perimetro, voltas; 
        Scanner teclado = new Scanner(System.in);
        //para a distancia de uma volta completa precisamos de saber o perimetro do triangulo
        //Logo precisamos saber todos os 3 lados, antes disso vamos precisar usar pitagoras e descobrir a distancia da ruaC
         System.out.println("Diite a distancia da rua A:");
         ruaA = teclado.nextInt();
         
         System.out.println("Digite o valor para rua B:");
         ruaB = teclado.nextInt();
         
         System.out.println("Digite a disntancia que você pretende percorrer:");
         distanciaQueVaiPercorrer = teclado.nextInt();
         
         ruaC = Math.sqrt((Math.pow(ruaB, 2)) + (Math.pow(ruaA, 2)));
         
         perimetro = ruaC + ruaA  + ruaB;
         
         voltas =  (distanciaQueVaiPercorrer / perimetro);
         
         System.out.println("O numero de voltas que você vai percorrer:\n" +voltas);
         
    }

}
