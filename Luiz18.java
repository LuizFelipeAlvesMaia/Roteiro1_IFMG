/**
 Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do salário mínimo. Faça um
    algoritmo que receba o valor atual do salário mínimo e a quantidade de quilowatt consumida em uma
    residência, calcule e mostre:
    a. O valor pago por quilowatt;
    b. O valor a ser pago pelo consumo nessa residência;
    c. O valor a ser pago considerando um desconto de 15%. * 
    * 
    * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz18 {
    public static void main(String[] args){
        int salarioMinimo, quilowattConsumido, valorSerPagoDeConsumo;
        double valorDoQuilowatt, descontoDaConta;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor do salario mínimo:");
        salarioMinimo = teclado.nextInt();
        
        System.out.println("Digite o valor de quilowatt consumidos na residencia:");
        quilowattConsumido = teclado.nextInt();

         
        valorDoQuilowatt = salarioMinimo / 5;
        
        valorSerPagoDeConsumo =  (int) (valorDoQuilowatt * quilowattConsumido);
        
        descontoDaConta = valorSerPagoDeConsumo * 0.85;
        
        System.out.print("O valor de quilowatt é de:\n" +valorDoQuilowatt);
        System.out.print("O valor a ser pago pelo consumo de quilowatt e de:\n" +valorSerPagoDeConsumo);
        System.out.print("O valora ser pago pelo consumo de quilowatt com desconto [e de:\n" +descontoDaConta);
        
    }
}
