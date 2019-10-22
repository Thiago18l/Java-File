import java.util.Scanner;

public class ParidadeTes{

    public static void main(String[] args) {
        int elementos =0;
        int indice;
        int k=0;
        
      

        //Scanner
        Scanner entrada = new Scanner(System.in);

        //Ask the numbers of elements in the array;
        System.out.printf("Digite a quantidade de elementos: ");
        elementos = entrada.nextInt();
        int v[] = new int [elementos];

        for(int i=0; i<v.length;i++){

          System.out.println("Informe o valor: ");
          indice = entrada.nextInt();

          v[i] = indice;
        }
        //Objeto
        Paridade obj = new Paridade(k);
        //percorre o array indice a indice com o retorno se é par ou impar.
        for(int j : v){
            boolean dado = obj.verifica(j);
            if(dado == true){
                System.out.println("É par");
            }else{
                System.out.println("É impar");
            }
           
        }
        entrada.close();
    }
}