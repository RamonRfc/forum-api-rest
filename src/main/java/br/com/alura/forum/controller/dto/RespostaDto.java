package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Resposta;

public class RespostaDto {

	private Long Id;
	private String mensagem;
	private LocalDateTime dataCriação;
	private String nomeAutor;
	
	
public RespostaDto(Resposta resposta) {
		
		this.Id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriação = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return Id;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriação() {
		return dataCriação;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	
	
}
