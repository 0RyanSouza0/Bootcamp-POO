package main.dio.desafio;


public class Curso  extends Conteudo{


	private int cargaHoraria;
	
	public double calcularXp() {
		return XP_PADARAO * cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao()+ ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
}
