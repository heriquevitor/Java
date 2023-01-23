
package br.com.herique.ForWhile;
import java.util.Locale;
import java.util.Scanner;
public class MultiplicationTables {
    public  static void main (String arg[]){
        Scanner rd = new Scanner(System.in);
        System.out.println("Você quer gerar uma tabuada");
        String resposta = rd.next();


        while (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Digite o número");
            int num = rd.nextInt();
            for (int i = 0; i <=10; i++){
                System.out.println(num + "x" + i + "="+ num*i);
            }
        }


    }
}

