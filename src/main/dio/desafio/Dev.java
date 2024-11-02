package main.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> counteudosInscritos= new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosConcluidos =new LinkedHashSet<Conteudo>();
	
	public void inscreverBootcamp(Bootcamp bootcamp)  {
		
		this.counteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevs().add(this);
	}
	
	public void progedir() {
		Optional<Conteudo> conteudo= this.counteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.counteudosInscritos.remove(conteudo.get());
		}
		else{
			System.err.println("Voce nao esta inscrito em nenhum BootCamp");
		}
	}
	
	public double calcularTotal() {
		return this.conteudosConcluidos.stream().mapToDouble(conteudo->conteudo.calcularXp()).sum();
	}
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public Set<Conteudo> getConteudoInscritos(){
		return this.counteudosInscritos;
	}
	
	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.counteudosInscritos=conteudoInscritos;
	}
	
	
	public Set<Conteudo> getConteudoConcluidos(){
		return this.conteudosConcluidos;
	}

	public void setConteudoConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos=conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, counteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(counteudosInscritos, other.counteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	

}
