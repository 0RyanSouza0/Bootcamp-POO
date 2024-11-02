package main.dio.desafio;

public abstract  class Conteudo {

	protected static final double  XP_PADARAO=100;
	
	private String descricao;
	private String titulo;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}






	public abstract double calcularXp();
}
