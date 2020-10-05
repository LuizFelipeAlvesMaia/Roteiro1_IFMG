/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
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
