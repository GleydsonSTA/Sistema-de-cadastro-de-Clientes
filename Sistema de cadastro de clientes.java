/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package certificado;

import java.util.Scanner;

/**
 *
 * @author GLEYDSON
 */
public class CERTIFICADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String n1,n2,n3;
        int i1=0,i2 =0,i3=0;
        
        System.out.println("============Cadastro de Clientes==============\n");
        
        System.out.printf("Informe o nome do primeiro cliente? ");
        n1 = teclado.next();
        System.out.printf("Informe a sua idade? ");
        i1 = teclado.nextInt();
        
        System.out.printf("Informe o nome do segundo cliente? ");
        n2 = teclado.next();
        System.out.printf("Informe a sua idade? ");
        i2 = teclado.nextInt();
        
        System.out.printf("Informe o nome do terceiro cliente? ");
        n3 = teclado.next();
        System.out.printf("Informe a sua idade? ");
        i3 = teclado.nextInt();
        
        System.out.println("============Relatorio de Clientes==============");
        System.out.printf("\nNome:%s -> Idade:%d",n1,i1);
        System.out.printf("\nNome:%s -> Idade:%d",n2,i2);
        System.out.printf("\nNome:%s -> Idade:%d\n",n3,i3);
        
        
        
        
 
    }
    
}
