/**
 *Funcionários da IFVende tem como benefício a receber ao final de cada mês um salário fixo mais 4% de
    comissão sobre as vendas realizadas pelo mesmo. Assim, faça um algoritmo que receba o salário fixo e o
    valor de vendas realizadas por um funcionário, calcule e mostre o benefício a ser recebido pelo mesmo.
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz06 {
    public static void main(String[] args){
        int salarioBaseFunc,numeroDeVendas, comicao,salarioFinal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor base do salario do funcionario:");
        salarioBaseFunc = teclado.nextInt();
        
         System.out.println("Digite o numero de vendas do funcionario:");
        numeroDeVendas = teclado.nextInt();
        
        comicao= (int) (salarioBaseFunc * (0.04 *numeroDeVendas ));
        salarioFinal= comicao + salarioBaseFunc;
        
        System.out.println("O valor da comição do funcionario é:" +comicao);
        System.out.println("O valor do sálario do funcionario é:" +salarioFinal);
        
    }
}
