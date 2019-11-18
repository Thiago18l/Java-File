
public class Conta {
	
	private double saldo;
	private double limite;
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Conta() {
		
	}
	public Conta(double saldo) {
		this.saldo = saldo;
	
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void Deposita(double valor) {
		this.saldo = valor;
		System.out.println("Deposito efetuado com sucesso.");
	}
	public void Saca(double valor)throws ContaException {
		
		if(valor > saldo+limite) {
			throw new ContaException(saldo+limite);
			
		}else {
			System.out.println("O saldo atual da conta é:"+(saldo+limite-valor));
		}
	}
	
	
}
