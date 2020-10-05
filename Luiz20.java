/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;

public class Luiz20 {
    public static void main(String[] args){
        double horasTrabalhadas, valorDeHorasTrab, horasExtras, valorDeHorasExtras, salarioBruto,salarioMaisHorasExtras, salarioMinimo, salarioAReceber;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = teclado.nextDouble();
        
        System.out.println("Digite o valor do salario minimo: ");
        salarioMinimo = teclado.nextDouble();
        
        System.out.println("Digite as horas extras trabalhadas: ");
        horasExtras = teclado.nextDouble();
        
        valorDeHorasTrab =  (salarioMinimo * 0.125);
        
        valorDeHorasExtras = salarioMinimo * 0.25;
        
        salarioBruto = salarioMinimo + valorDeHorasTrab;
        
        salarioAReceber = salarioMinimo + valorDeHorasTrab + valorDeHorasExtras; 
        
        System.out.println("O valor do salario a receber é de:" + salarioAReceber);
                System.out.println("O valor do salario bruto é de:" + salarioBruto);

        
        
        
        
        
        
    }
}
