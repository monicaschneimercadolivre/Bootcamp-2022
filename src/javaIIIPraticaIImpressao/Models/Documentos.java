package javaIIIPraticaIImpressao.Models;

public class Documentos {
    private int numeroDocumento;

    public Documentos(int numeroDocumento) {

        this.numeroDocumento = numeroDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {

        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "{"+
                "Número do documento='" + numeroDocumento + '\'' +
                "} ";
    }
}
