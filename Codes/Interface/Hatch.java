
public class Hatch extends AluguelAut {

	private double vdiaV = 75.00;
	private int condição;
	
	public Hatch() {
		
	}
	
	public Hatch(String data, String hora, String destino, String finalidade, String placa, int quantidadedeDias, int condição) {
		
		super(data,hora,destino,finalidade, placa, quantidadedeDias);
		setCondição(condição);
	}
	
	@Override
	public String toString() {
		return String.format("Veiculo -> Hatch:\n Informações:\n Valor da diaria: R$ "+this.getVdiaV()+"\n Destino: "+this.getDestino()+"\n Finalidade: "+this.finalidade+
				"\n Hora e Data: "+this.getHora()+" / "+this.getData()+" \n Placa do veiculo: "+this.getPlaca()+"\n Quantidade de dias Alugado: "+this.getQuantidadeDias()+" Dias"
				);
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

	public double getVdiaV() {
		return vdiaV;
	}

	public void setVdiaV(double vdiaV) {
		this.vdiaV = vdiaV;
	}

	

	public int getCondição() {
		return condição;
	}

	public void setCondição(int condição) {
		this.condição = condição;
	}

	
	
	
	
}
