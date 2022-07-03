package javaIIIPraticaIImpressao.Models;
import java.util.List;


public class Pessoa {
    private int idade;
    private String nome;
    List<Habilidades> listaHabilidades;

    public Pessoa (int idade, String nome, List listaHabilidades){
        this.idade=idade;
        this.nome=nome;
        this.listaHabilidades=listaHabilidades;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "idade=" + idade +
                ", nome='" + nome + '\'' +
                "Habilidades:" + listaHabilidades +
                '}';
    }
}
