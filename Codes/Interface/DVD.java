
public class DVD extends Produto {

	protected double dura��o;
	public DVD() {
		
	}
	public DVD(String nome, double pre�o, double dura��o) {
		super.setNome(nome);
		super.setPre�o(pre�o);
		setDura��o(dura��o);
	}

	public double getDura��o() {
		return dura��o;
	}

	public void setDura��o(double dura��o) {
		this.dura��o = dura��o;
	}

	@Override
	public String toString() {
		return "DVD [dura��o=" + dura��o + "]";
	}
	
	
}
