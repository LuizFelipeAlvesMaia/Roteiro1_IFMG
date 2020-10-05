/**
 *Considere uma equação do segundo grau na forma genérica (ax2 + bx + c) e calcule o valor das raízes da
    mesma. Sabe-se que os coeficientes a, b, e c devem ser fornecidos pelo usuário. Utilize as equações abaixo
    como teste. Teste também para alguns valores aleatórios de coeficientes (exemplo a = 3, b = 2 e c =4) e
    veja que em alguns casos não se retornam as raízes de forma correta. Identifique o porquê desse problema e
    indique uma possível solução.
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlistabsi;

import java.util.Scanner;


public class Luiz24 {
    public static void main(String[] args){
        int varA, varB, varC; 
        double delta, x1, x2;
        
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Digite o valor da variavel A:");
        varA = teclado.nextInt();
        
        System.out.println("Digite o valor da variavel B:");
        varB = teclado.nextInt();
        
        System.out.println("Digite o valor da variavel C:");
        varC = teclado.nextInt();
      
                if(varA == 0){
                        System.out.println("Quando a é exatamente igual a 0 a equação não é do segundo grau!");
                                }else{
                                delta = Math.pow(varB, 2) - 4*(varA * varC);
                                    
                                    if (delta <0){
                                        System.out.println("O valor de delta menor que zero não tem resultado real");
                                           

            
            
                                                }else if(delta == 0){ 
            
                                                        x1 =  (-varB + Math.sqrt (delta))  / ( 2*varA ); //equação do x1

                                                        x2 =   (-varB - Math.sqrt (delta)) / ( 2*varA ) ;//equação do x2
                                                        
                                                            System.out.println("Quando o delta é exatamente igual a 0 temos duas raizes extamente iiguais");
                                                            System.out.println("X1:" +x1+ "\n" + "X2:"+x2); 
        
        
                                                                    }else if(delta > 0 ){
                                                                    x1 =  (-varB + Math.sqrt (delta))  / ( 2*varA ); //equação do x1

                                                                    x2 =   (-varB - Math.sqrt (delta)) / ( 2*varA ) ;//equação do x2 
                                                                        
                                                                    
                                                                    System.out.println("Quando o delta é maior que 0 temos duas raizes reais distintas");
                                                                    System.out.println("X1:"+x1+"\n"+ "X2:"+x2); 
                                                                                        }
        
        
        
       
                
                
       }  
       
       
       
       
    }
}
