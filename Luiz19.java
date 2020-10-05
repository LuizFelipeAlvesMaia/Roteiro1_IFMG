/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz19 {
    public static void main(String[] args){
        int numero,numeroAoQuadrado, numeroAoCubo;
        double raizQuadradaDoNumero, raizCubicaDoNumero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero positivo qualquer:");
             numero = teclado.nextInt();
            if(numero <0 ){
             System.out.print("O valor digitado não é valido, tente novamente!");
            }else{
             
             
             numeroAoQuadrado = (int) Math.pow(numero, 2);
             numeroAoCubo = (int) Math.pow(numero, 3);
             
             raizQuadradaDoNumero = (double) Math.sqrt(numero);
             raizCubicaDoNumero = (double) Math.cbrt(numero);
             
             
             System.out.println("O valor do numero elevado ao quadrado é de:\n"+numeroAoQuadrado);
             System.out.println("O valor do numero elevado ao cubo é de:\n"+numeroAoCubo);
             System.out.println("O valor da raiz quadrada do numero é de:\n"+raizQuadradaDoNumero);
             System.out.println("O valor da raiz cubica do numero é de:\n"+raizCubicaDoNumero);
         }
        
        
    }
}
