package com.carara.forumapi.controller;

import com.carara.forumapi.dto.TopicoDto;
import com.carara.forumapi.form.TopicoForm;
import com.carara.forumapi.model.Topico;
import com.carara.forumapi.repository.CursoRepository;
import com.carara.forumapi.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<TopicoDto> listAll(String nomeCurso) {
        if(nomeCurso==null){
            List<Topico> topicoList = topicoRepository.findAll();
            return TopicoDto.converter(topicoList);
        }else{
            List<Topico> topicoList = topicoRepository.findByCurso_Nome(nomeCurso);
            return TopicoDto.converter(topicoList);

        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity<TopicoDto> cadastrar(@RequestBody TopicoForm form, UriComponentsBuilder uriBuilder) {
        Topico topico = form.converter(cursoRepository);
        topicoRepository.save(topico);

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(new TopicoDto(topico));
    }
}
