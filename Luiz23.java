/**
 *Num dado momento, 3 canais de TV tinham, em sua programação, novelas em seu horário nobre: canal A,
    novela A, canal B, novela B, canal C novela C. Numa pesquisa com 3000 pessoas, perguntou-se quais
    novela agradavam. A tabela a seguir mostra o resultado da pesquisa:
    * Implemente um algoritmo que encontre o número de telespectadores que nenhuma das novelas os agradam.
    Receba as informações de preferências na entrada de dados e utilize as fórmulas de teoria dos conjuntos.
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz23 {
     public static void main(String[] args){
        int  canalA, canalB , canalC , canalAB, canalAC, canalBC, abc, totalDeEspectadores;
        int A, B,C, AB, AC, BC, pessoasQueNaoAssitemNovelas;
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Digite o numero total de espectadores:");;
        totalDeEspectadores=teclado.nextInt();
        
        System.out.println("Digite o numero de espectadores da novela A:");
        canalA=teclado.nextInt();
        
        System.out.println("Digite o numero de espectadores da novela B:");
        canalB=teclado.nextInt();
        
        System.out.println("Digite o numero de espectadores da novela C:");
        canalC=teclado.nextInt();
        
        System.out.println("Digite o numero de espectadores das novelas AB:");
        canalAB=teclado.nextInt();
        
        System.out.println("Digite o numero de espectadores das novelas AC :");
        canalAC=teclado.nextInt();
        
        System.out.println("Digite o numero de espectadores das novelas BC:");
        canalBC=teclado.nextInt();
        
        System.out.println("Digite o numero de espectadores das novelas abc:");
        abc=teclado.nextInt();
        
        AB = canalAB - abc;
        AC = canalAC - abc;
        BC = canalBC - abc;
        A = canalA - AB - abc - AC;
        B = canalB - AB - abc - BC;
        C = canalC - AC-  abc - BC;
        pessoasQueNaoAssitemNovelas = totalDeEspectadores - (A + B + C);
        
        System.out.println("O número de pessoas que não assistem nenhuma das novelas é de:"+pessoasQueNaoAssitemNovelas);
        
        
        
        
        
    }
}
