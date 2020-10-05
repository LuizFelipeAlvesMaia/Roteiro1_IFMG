/**
 *Uma pessoa depositou R$2000,00 em um fundo de investimento que rende 0.5% ao mês. Essa pessoa
    gostaria de saber qual o total acumulado após 2 anos. Faça um programa que forneça tais informações.
    (Obs. desconsidere correção monetária e utilize a fórmula de juros compostos).
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;


public class Luiz10 {
     public static void main( String[] args){
        int capital = 2000, tempo = 24;
        double montante;
        
        montante = capital * (Math.pow((1 + 0.005), tempo));
        
        System.out.println("O valor final do seu montante será de:"+montante);
     
    }
}
