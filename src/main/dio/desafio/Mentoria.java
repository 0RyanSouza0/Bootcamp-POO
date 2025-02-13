package main.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;

	public double calcularXp() {
		return XP_PADARAO + 20; 
	}
	
	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao()+ ", data=" + data + "]";
	}
	
	
}
