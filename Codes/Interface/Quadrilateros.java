public abstract class Quadrilateros {
	protected int l1,l2,l3,l4;

    public Quadrilateros(){

    }

    public Quadrilateros(int l1, int l2, int l3, int l4){
        setLado1(l1);
        setLado2(l2);
        setLado3(l3);
        setLado4(l4);
    }

    public abstract void CalcularPerimetro();
    public abstract void AreaForma();

    public void setLado1(int l1){
        this.l1 = l1;
    }
    public void setLado2(int l2){
        this.l2 = l2;
    }
    public void setLado3(int l3){
        this.l3 =l3;
    }
    public void setLado4(int l4){
        this.l4 = l4;
    }

    public int getLado1(){
        return this.l1;
    }
    public int getLado2(){
        return this.l2;
    }
    public int getLado3(){
        return this.l3;
    }
    public int getLado4(){
        return this.l4;
    }
}