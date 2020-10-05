/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz03 {
    public static void main(String[] args){
        int num1, num2, num3, aux, resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor para o primeiro número");
        num1 = teclado.nextInt();
        
        System.out.println("Digite um valor para o segundo número");
        num2 = teclado.nextInt();
        
        System.out.println("Digite um valor para o terceiro número");
        num3 = teclado.nextInt();
        
        aux = num1 * num2;
        resultado = aux / num3;
        
        
        if( num3 == 0){
            System.out.print("O valor para o terceiro número deve ser diferente de 0, digite um valor válido");
            
        }else{
            
           System.out.println("O resultado para os valores digitado é:" +resultado);
        }
    }
}
