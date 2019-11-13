
public class Cliente extends Pessoa {
	
	protected int codCliente;
	
	public Cliente() {
		
	}
	public Cliente(String nome) {
		super(nome);
		
	}
	
	public Cliente(String nome, String end) {
		super(nome, end);
	}
	

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}



	@Override
	public String toString() {
		return "Cliente [Codigo do Cliente=" + codCliente + " Nome do Cliente: "+this.getNome()+" Endereço do Cliente: "+this.getEnd()+"]";
	}
	
	
	
}
