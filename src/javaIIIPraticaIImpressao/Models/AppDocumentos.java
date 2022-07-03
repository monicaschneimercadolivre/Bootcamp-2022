package javaIIIPraticaIImpressao.Models;
import javaIIIPraticaIImpressao.Utils.Imprimivel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppDocumentos {

   public static void main(String[] args) {
    LivroPdf livro = new LivroPdf(123, 100, "romance", "A lagoa Azul", "hello");
    Imprimivel.imprimir(livro);


    Relatorios relatorio1 = new Relatorios(456, 20, "José", 5);
    Imprimivel.imprimir(relatorio1);


    Habilidades programcao = new Habilidades("programacao em java");
    Habilidades ingles = new Habilidades("ingles avancado");

    List<Habilidades> listaPessoa1 = Arrays.asList(programcao, ingles);
    Pessoa pessoa1= new Pessoa (25,"Fulana",listaPessoa1);
    Curriculo cv1 = new Curriculo(789,pessoa1);

    Imprimivel.imprimir(cv1);


   }

}
