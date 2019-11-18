
public class TesteConta {
	public static void main(String args[]) {
		Conta minhaconta = new Conta();
		minhaconta.Deposita(100);
		minhaconta.setLimite(100);
		try {
			
			minhaconta.Saca(150);
		}
		catch(ContaException e) {
			System.err.println("Saldo insuficiente.");
		}
		
	}
	
	
}
