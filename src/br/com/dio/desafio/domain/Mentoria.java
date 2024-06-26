package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria (){}

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10d ;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "\nTitulo:'" + getTitulo() + '\'' +
                ", \nDescricao: '" + getDescricao() + '\'' +
                ", \nData De Inicio: " + data + "\n" +
                '}';
    }
}
