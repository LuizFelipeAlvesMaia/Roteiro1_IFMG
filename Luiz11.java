/**
 *João recebeu seu salário e precisa pagar 2 contas atrasadas. Em razão do atraso, ele deverá pagar multa de
    2% sobre cada conta. Faça um programa que receba o salário do João e o valor de cada conta, calcule e
    mostre quanto restará de salário após o pagamento das duas contas.
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz11 {
    public static void main(String[] args){
        int salarioDeJoao, valorDaConta1, valorDaConta2;
        double multa, salarioRestante;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor do salario:");
        salarioDeJoao = teclado.nextInt();
        
        System.out.println("Digite o valor da primeira conta");
        valorDaConta1 = teclado.nextInt();
        
        System.out.println("Digite o valor da segunda conta");
        valorDaConta2 = teclado.nextInt();
        
        multa = ((valorDaConta1 * 1.02) + ( valorDaConta2 * 1.02));
        
        salarioRestante = salarioDeJoao - multa;
        
        System.out.println("O valor do que restara do salario de João será de: \n" +salarioRestante);
        
        
        
    }
}
