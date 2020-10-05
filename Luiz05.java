/**
 *Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
    sabendo que esse funcionário possui uma gratificação de 10% sobre o salário base e paga 5% de imposto
    sobre o valor acumulado (salário base + gratificação).
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz05 {
     public static void main(String[] args){
        double salarioBase, gratificacao, imposto;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o salario base do funcionario:");
        salarioBase = teclado.nextInt();
        
         gratificacao = salarioBase * 1.10;
         imposto = gratificacao* 0.95;
         
         System.out.println("O valor da gratificação do salario do funcionario é:" + Math.round(gratificacao));
         System.out.println("O valor dos impostos pagos pelo funcionario é de:" +Math.round(imposto));
        
        
        
        
        
    }
}
