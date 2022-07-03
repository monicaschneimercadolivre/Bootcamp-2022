package javaIIIPraticaIImpressao.Models;

public class Habilidades {
    private String habilidades;

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public Habilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return  habilidades;

    }
}
