
public abstract class AluguelAut implements Locação{
	
	protected String data;
	protected String hora;
	protected String placa;
	protected String destino;
	protected String finalidade;
	protected int quantidadeDias;
	
	

	public int getQuantidadeDias() {
		return quantidadeDias;
	}

	public void setQuantidadeDias(int quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}

	public AluguelAut(String data, String hora, String destino, String finalidade, String placa, int quantidadedeDias) {
		
		setData(data);
		setHora(hora);
		setDestino(destino);
		setFinalidade(finalidade);
		setPlaca(placa);
		setQuantidadeDias(quantidadedeDias);
		
		
	}
	
	public abstract void CondiçãoV(int condição);
	public abstract void Devolução();
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	public AluguelAut() {
			
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
