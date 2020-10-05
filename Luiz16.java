/**
 *Faça um algoritmo que receba uma quantidade qualquer em minutos e converta em horas e minutos (utilize
    divisão inteira e resto da divisão inteira).
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz16 {
     public static void main(String[] args){
        double horasTotal, minutosDigitados, minutos;
        int horas;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quanditade de minutos que deseja converter:");
        minutosDigitados = teclado.nextDouble();
        
       
        minutos = minutosDigitados % 60;
        horas = (int) ((minutosDigitados - minutos ) / 60);
         
        System.out.println("O valor em horas é de:" +horas+ "horas e" +minutos+"minutos");
               
    }
}
