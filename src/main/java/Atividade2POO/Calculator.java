package Atividade2POO;

import java.util.Scanner;

public class Calculator {
    
    public static void main (String[] args){
       
       Scanner entrada = new Scanner(System.in);
       
       int soma = 0;
       
       System.out.println("Vamos calcular uma soma :D ");
       System.out.println();
       System.out.print("Digite o primeiro numero: ");
       int soma1 = entrada.nextInt();
       System.out.print("Digite o segundo numero ");
       int soma2 = entrada.nextInt();
       
       soma = soma1 + soma2;
       
       System.out.printf("A soma e: %d\n", soma );
       
       Scanner entrada1 = new Scanner(System.in);
       int sub;
       
       System.out.println();
       System.out.println("Vamos calcular uma subtracao :D ");
       System.out.println();
       System.out.print("Digite o primeiro numero: ");
       int sub1 = entrada1.nextInt();
       System.out.print("Digite o segundo numero ");
       int sub2 = entrada1.nextInt();
       
       sub = sub1 - sub2;
       
       System.out.printf("A subtracao e: %d\n", sub );
       
       Scanner entrada2 = new Scanner(System.in);
       int mult;
       
       System.out.println();
       System.out.println("Vamos calcular uma multiplicacao :D ");
       System.out.println();
       System.out.print("Digite o primeiro numero: ");
       int mult1  = entrada2.nextInt();
       System.out.print("Digite o segundo numero ");
       int mult2 = entrada2.nextInt();
       
       mult = mult1 * mult2;
       
       System.out.printf("A multiplicacao e: %d\n", mult );
       
       Scanner entrada3 = new Scanner(System.in);
       float divisao;
       
       System.out.println();
       System.out.println("Vamos calcular uma divisao :D ");
       System.out.println();
       System.out.print("Digite o primeiro numero: ");
       float divisao1  = entrada3.nextInt();
       System.out.print("Digite o segundo numero: ");
       float divisao2 = entrada3.nextInt();
       
       divisao = divisao1 / divisao2;
       
       System.out.printf("A divisao e: %s\n", divisao );
       
       Scanner entrada4 = new Scanner(System.in);
       double raiz;
       
       System.out.println();
       System.out.println("Vamos calcular uma raiz quadrada :D ");
       System.out.println();
       System.out.print("Digite um numero: ");
       double raizq  = entrada4.nextInt();
       
       System.out.println("A raiz quadrada e: " + Math.sqrt(raizq));
       
       Scanner entrada5 = new Scanner(System.in);
       double porc;
       
       System.out.println();
       System.out.println("Vamos calcular uma porcentagem :D ");
       System.out.println();
       System.out.print("Digite um numero: ");
       double porcentagem = entrada5.nextInt();
       
       System.out.println("A porcentagem e: " + (porcentagem/100) * 2);
       
}
}
    
