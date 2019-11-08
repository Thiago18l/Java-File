public class Quadrado extends Quadrilateros{

	public Quadrado() {
		
	}
    public Quadrado(int l1, int l2, int l3, int l4){
    	super(l1,l2,l3,l4);
    	
    }

    @Override
    public void CalcularPerimetro(){
        System.out.println("O Perimetro do Quadrado é:"+(super.l1*4));
    }
    @Override
    public void AreaForma(){
        System.out.println("A Area do Quadrado é:"+Math.pow(super.l1, 2));
    }



    
}