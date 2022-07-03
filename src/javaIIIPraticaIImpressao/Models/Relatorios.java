package javaIIIPraticaIImpressao.Models;

public class Relatorios extends Documentos{
    private int numeroPagina;
    private String revisor;
    private int tamanhoTexto;

    public Relatorios(int numeroDocumento, int numeroPagina, String revisor, int tamanhoTexto) {
        super(numeroDocumento);
        this.numeroPagina=numeroPagina;
        this.revisor=revisor;
        this.tamanhoTexto=tamanhoTexto;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return super.toString() + " Relatorios{" +
                "numeroPagina=" + numeroPagina +
                ", revisor='" + revisor + '\'' +
                ", tamanhoTexto=" + tamanhoTexto +
                '}';
    }
}
