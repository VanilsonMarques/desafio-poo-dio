package br.com.dio.desafio.dominio;


import java.util.Date;

public class Mentoria extends Conteudo {
        private Date Data;

        @Override
        public double calcularXp() {
                return XP_PADRAO + 20d;
        }


        public Mentoria() {
        }


        public Date getData() {
                return Data;
        }

        public void setData(Date data) {
                Data = data;
        }

        @Override
        public String toString() {
                return "Mentoria{" +
                        "titulo='" + getTitulo() + '\'' +
                        ", descricao='" + getDescricao() + '\'' +
                        ", Data=" + Data +
                        '}';
        }


}


