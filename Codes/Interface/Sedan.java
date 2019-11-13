
public class Sedan extends AluguelAut{

	private double vdiaria = 95.00;
	
	public Sedan() {
		
	}
	public Sedan(String data, String hora, String destino, String finalidade, String placa, int quantidadedeDias, int condição) {
		super(data,hora,destino,finalidade, placa, quantidadedeDias);
	}
	
	@Override
	public void CondiçãoV(int condição) {
		if(condição == 10) {
			System.out.println("Condição do Veiculo é igual as condições quando foi colocado.");
		}
		else if (condição != 10) {
			System.out.println("A condição do veiculo não está em perfeitas condições.");
		}
	}
	public void Devolução() {
			
	}

	public double getVdiaria() {
		return vdiaria;
	}

	public void setVdiaria(double vdiaria) {
		this.vdiaria = vdiaria;
	}
	
	
	
	
}
