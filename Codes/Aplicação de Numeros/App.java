import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        // classe de aplicação.

        //Objetos.
        Scanner entrada = new Scanner(System.in);
        MaiorNumero n = new MaiorNumero();
        NumeroDecrescente d = new NumeroDecrescente();
        
        System.out.println("Digite o primeiro numero:");
        int num = entrada.nextInt();
        n.setNum1(num);
        
        
        System.out.println("Digite o segundo numero:");
        int num2 = entrada.nextInt();
        n.setNum2(num2);
        
        n.maiorN(num, num2);

        System.out.println("Digite o numero para ser decrementado:");
        num = entrada.nextInt();
        d.setNum(num);

        d.imprimeNumD(num);

        
        entrada.close();






    }
}