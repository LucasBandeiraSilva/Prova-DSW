package com.atividade.dsw.series.series;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Series {
    private String titulo;
    private String genero;
    private int anoLancamento;
}
