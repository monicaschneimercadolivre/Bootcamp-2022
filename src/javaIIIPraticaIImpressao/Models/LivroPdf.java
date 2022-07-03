package javaIIIPraticaIImpressao.Models;


public class LivroPdf extends Documentos{
    private int numeroPagina;
    private String titulo;
    private String genero;
    private String autor;

    public LivroPdf(int numeroDocumento,int numeroPagina, String genero, String titulo, String autor) {
        super(numeroDocumento);
        this.genero=genero;
        this.numeroPagina=numeroPagina;
        this.titulo=titulo;
        this.autor=autor;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + " LivroPdf{" +

                "numeroPagina=" + numeroPagina +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
