package com.carara.forumapi.form;

import com.carara.forumapi.model.Topico;
import com.carara.forumapi.repository.TopicoRepository;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AtualizacaoTopicoForm {
    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String titulo;

    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String mensagem;

    //Não será possivel atualizar a categoria do topico ( curso )
//    @NotNull
//    @NotEmpty
//    private String nomeCurso;

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getOne(id);

        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }

}
