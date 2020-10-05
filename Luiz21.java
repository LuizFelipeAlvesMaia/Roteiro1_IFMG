/**
    Faça um programa que receba a medida do ângulo formado por uma escada apoiada e a altura da parede.
    Calcule e mostre a medida da escada para que a ponta da parede possa ser alcançada. *
    * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;

public class Luiz21 {
    public static void main(String[] args){
        double catetoOposto, hipotenusa,anguloAlfa;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor do angulo formado:");
        anguloAlfa= teclado.nextDouble();
        
        System.out.println("Digite a altura da parede:");
        catetoOposto=teclado.nextDouble();
        anguloAlfa = Math.toRadians(anguloAlfa);
        
        hipotenusa = catetoOposto / (Math.sin(anguloAlfa));
        
        System.out.println("A medida da escada é de:" +hipotenusa);
        
        
    }
}
