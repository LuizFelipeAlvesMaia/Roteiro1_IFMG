/**
 *Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o número de
    horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as seguintes regras:
    a) O valor a ser pago por hora trabalhada é 0.125 do salário mínimo;
    b) O valor a ser pago por hora extra vale 0.25 do salário mínimo;
    c) o salário bruto equivale ao número de horas trabalhadas vezes o valor pago por hora;
    d) a quantia a receber por horas extras equivale à horas extras realizadas multiplicado pelo valor pago
    por hora extra;
    e) o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.
    * 
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
