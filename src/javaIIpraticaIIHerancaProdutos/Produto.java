package javaIIpraticaIIHerancaProdutos;


public class Produto {
    private String nome;
    private double preco;

    //Construtor
    public Produto(String nome, double preco) {
        this.nome=nome;
        this.preco=preco;
    }

    public String getNome (){
        return nome;
    }

    public double getPreco (){
        return preco;
    }

    public void setPreco(double preco){
        this.preco=preco;
    }
    public void setNome(String nome){
        this.nome=nome;
    }


    public int calcular (int quantidade) {

        double valor = preco*quantidade;
        System.out.println(valor);
        return (int)valor;
    }


}
