
public class Hatch extends AluguelAut {

	private double vdiaV = 75.00;
	private int condi��o;
	
	public Hatch() {
		
	}
	
	public Hatch(String data, String hora, String destino, String finalidade, String placa, int quantidadedeDias, int condi��o) {
		
		super(data,hora,destino,finalidade, placa, quantidadedeDias);
		setCondi��o(condi��o);
	}
	
	@Override
	public String toString() {
		return String.format("Veiculo -> Hatch:\n Informa��es:\n Valor da diaria: R$ "+this.getVdiaV()+"\n Destino: "+this.getDestino()+"\n Finalidade: "+this.finalidade+
				"\n Hora e Data: "+this.getHora()+" / "+this.getData()+" \n Placa do veiculo: "+this.getPlaca()+"\n Quantidade de dias Alugado: "+this.getQuantidadeDias()+" Dias"
				);
	}

	@Override
	public void Condi��oV(int condi��o) {
		if(condi��o == 10) {
			System.out.println("Condi��o do Veiculo � igual as condi��es quando foi colocado.");
		}
		else if (condi��o != 10) {
			System.out.println("A condi��o do veiculo n�o est� em perfeitas condi��es.");
		}
	}
	public void Devolu��o() {
			
	}

	public double getVdiaV() {
		return vdiaV;
	}

	public void setVdiaV(double vdiaV) {
		this.vdiaV = vdiaV;
	}

	

	public int getCondi��o() {
		return condi��o;
	}

	public void setCondi��o(int condi��o) {
		this.condi��o = condi��o;
	}

	
	
	
	
}
