/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
