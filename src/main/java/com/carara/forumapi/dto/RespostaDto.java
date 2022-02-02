package com.carara.forumapi.dto;

import com.carara.forumapi.model.Resposta;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RespostaDto {
    private Long id;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAuthor;

    public RespostaDto(Resposta resposta) {
        this.id= resposta.getId();
        this.mensagem= resposta.getMensagem();
        this.dataCriacao= resposta.getDataCriacao();
        this.nomeAuthor= resposta.getAutor().getNome();
    }
}
