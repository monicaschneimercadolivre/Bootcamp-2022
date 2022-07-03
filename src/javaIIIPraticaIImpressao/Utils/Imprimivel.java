package javaIIIPraticaIImpressao.Utils;
import javaIIIPraticaIImpressao.Models.Documentos;

public interface Imprimivel {
    static void imprimir(Documentos documento){
        System.out.println(documento.toString());
    }
}
