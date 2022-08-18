package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo {

            private int caraHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * caraHoraria;
    }


    public Cursos() {
    }


    public int getCaraHoraria() {
        return caraHoraria;
    }

    public void setCaraHoraria(int caraHoraria) {
        this.caraHoraria = caraHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", caraHoraria=" + caraHoraria +
                '}';
    }
}