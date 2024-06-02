package br.com.dio.desafio.domain;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double CalcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    public Curso() {}


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "\nTitulo:'" + getTitulo() + '\'' +
                ", \nDescricao: '" + getDescricao() + '\'' +
                ", \nCarga Horaria: " + cargaHoraria + " Horas\n" +
                '}';
    }
}
