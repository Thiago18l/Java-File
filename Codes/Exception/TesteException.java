

public class TesteException {

    public static void main(String[] args) {
        System.out.println("Inicio do Main");
        try{
            metodo1();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Este array contém apenas 10 elementos. de '0' a '9'");
        }
            
            System.out.println("Fim do main");
    }
    static void metodo1() {
        System.out.println("Inicio do metodo 1");
            metodo2();
        System.out.println("Fim do metodo 1");
    }
    static void metodo2(){
        System.out.println("Inicio do metodo 2");
            int [ ] array = new int [10];
                for(int i =0; i<=15; i++){
                    array[i] = i;
                    System.out.println(i);
                }// fim do for.

                System.out.println("Fim do metodo 2");

    }

}