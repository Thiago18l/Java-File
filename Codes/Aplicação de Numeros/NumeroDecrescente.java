
public class NumeroDecrescente{
    private int num;

    public NumeroDecrescente(){
        this.num = 0;
    }

    public NumeroDecrescente(int num){
        setNum(num);
    }
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }

    public void imprimeNumD(int num){
        int i =0;
        while(i<num){
            System.out.println(""+num);
            num--;
        }

    }
}