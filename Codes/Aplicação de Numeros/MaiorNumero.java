
public class MaiorNumero{

    private int num1;
    private int num2;

    public MaiorNumero(){
        this.num1 = 0;
        this.num2 = 0;
    }

    public MaiorNumero(int num1, int num2){
        setNum1(num1);
        setNum2(num2);
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }

    public void maiorN(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1+" é maior que "+num2);
        }else{
            System.out.println(num2+" é maior que "+num1);
        }
    }

}