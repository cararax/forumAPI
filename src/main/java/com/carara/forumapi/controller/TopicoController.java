package com.carara.forumapi.controller;

import com.carara.forumapi.Dto.TopicoDto;
import com.carara.forumapi.model.Curso;
import com.carara.forumapi.model.Topico;
import com.carara.forumapi.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @GetMapping
    public List<TopicoDto> listAll(String nomeCurso) {
        if(nomeCurso==null){
            List<Topico> topicoList = repository.findAll();
            return TopicoDto.converter(topicoList);
        }else{
            List<Topico> topicoList = repository.findByCurso_Nome(nomeCurso);
            return TopicoDto.converter(topicoList);

        }
    }
}
