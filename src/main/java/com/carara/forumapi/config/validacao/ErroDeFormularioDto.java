package com.carara.forumapi.config.validacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErroDeFormularioDto {

    private String campo;
    private String erro;

}
