/**
    Faça um algoritmo que calcule a área de uma circunferência, recebendo o valor do raio. Obs.: Defina PI
    como constante de valor 3.1416. 
    
    * @author Luiz Felipe Alves Maia
    * 
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz15 {
    public static void main(String[] args){
        int raio;
        double pi = 3.1416, area;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio da sua circunferência:");
        raio = teclado.nextInt();
        
        area =  (pi * (Math.pow(raio,2)));
        
        System.out.println("O valor da área da sua circunferência é de:" +area);
        
        
    }
}
