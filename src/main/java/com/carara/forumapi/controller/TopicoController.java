package com.carara.forumapi.controller;

import com.carara.forumapi.Dto.TopicoDto;
import com.carara.forumapi.model.Curso;
import com.carara.forumapi.model.Topico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @GetMapping
    @ResponseBody
    public List<TopicoDto> listAll() {
        Topico topico = new Topico("Duvida", "Duvida com spring", new Curso( "Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
