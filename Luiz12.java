/**
 *Dona Maria das Couve é uma mulher muito preocupada com sua saúde e busca a prática de exercícios
    físicos constantes. Devido a crise financeira, Dona Maria está sem dinheiro para pagar academia, e teve
    como alternativa fazer caminhada diária ao redor do quarteirão de sua casa. O quarteirão da casa dela
    possui formato de um triângulo retângulo (figura abaixo), sabendo que ela deve caminhar um valor fixo de
    km por dia e dadas as medidas das ruas A e B (em metros) da figura abaixo, calcule e mostre quantas
    voltas Dona Maria precisa fazer no quarteirão para que ela atinja sua meta.
    * 
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
