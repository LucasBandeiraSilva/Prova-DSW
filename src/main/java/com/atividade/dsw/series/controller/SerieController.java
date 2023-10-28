package com.atividade.dsw.series.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.dsw.series.series.Series;

@RestController
@RequestMapping("/series")
public class SerieController {
    
    @GetMapping
    public List<Series> listar(){
        List <Series> lista = new ArrayList<>();
        lista.add(new Series("Breaking bad", "Drama", 2008));
        lista.add(new Series("Game of thrones", "Aventurra", 2011));
        lista.add(new Series("Round 6", "Ação", 2022));
        return lista;
    }
}
