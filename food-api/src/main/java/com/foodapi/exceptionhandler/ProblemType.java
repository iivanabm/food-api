package com.foodapi.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

	MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivel", "Mensagem incompreensível."),
	ENTIDADE_NAO_ENCONTRADA("/entidade-nao-encontrada", "Entidade não encontrada."),
	ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso."),
	ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio.");
	
	private String title;
	private String uri;
	
	ProblemType(String path, String title){
		this.uri = "https://localhost:8080" + path;
		this.title=title;
	}
}
