package main.dio.desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataInicio= LocalDate.now();
	private Set<Conteudo> conteudos= new LinkedHashSet<>();
	private Set<Dev> devs = new HashSet<Dev>();
	private final LocalDate dataFinal = dataInicio.plusDays(45);
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public Set<Dev> getDevs() {
		return devs;
	}
	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicio, descricao, devs, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devs, other.devs) && Objects.equals(nome, other.nome);
	}

	
}

