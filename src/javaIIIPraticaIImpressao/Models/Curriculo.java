package javaIIIPraticaIImpressao.Models;

public class Curriculo extends Documentos{
    Pessoa pessoa;



    public Curriculo (int numeroDocumento, Pessoa pessoa){
        super(numeroDocumento);
        this.pessoa=pessoa;

    }

    @Override
    public String toString() {
        return super.toString() + "Curriculo: " + pessoa.toString();
    }
}


