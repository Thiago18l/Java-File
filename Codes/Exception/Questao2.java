import java.util.*;

public class Questao2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Eu sei dividir");
        System.out.println("Informe o primeiro valor:");
        int x = entrada.nextInt();
        System.out.println("Informe o segundo valor:");
        int y = entrada.nextInt();
        try {
            double r = (x/y);
            }
            catch (ArithmeticException e) {
            System.out.println("Você não pode dividir um numero por 0");
            System.out.println("Informe o Primeiro valor novamente:");
            x = entrada.nextInt();
            System.out.println("Informe o segundo valor novamente:");
            y = entrada.nextInt();
            
            r = (x/y);
            
        } 
        finally{
            System.out.println("O resultado da divisão é:" + r);    
        }
           
        

        entrada.close();

    }
}