/**
 *A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
    desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
    realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano
    atual calcule o número de copas já realizadas e exiba o resultado ao usuário.
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz13 {
   public static void main( String[] args){
         Scanner teclado = new Scanner(System.in);   
     Double anos, copa, anoDigitado;
     System.out.println("Digite o ano de interesse para calcular a quantidade de copas realizadas:");
     anoDigitado = teclado.nextDouble();
     
     anos = anoDigitado - 1930;
     copa = (anos / 4) -2;
     
     if (anos < 1940){
         copa = (anos/4);
     }
     
     System.out.println("Ate agora tivemos um total de:" + Math.ceil(copa));
     
        
     
    } 
}
