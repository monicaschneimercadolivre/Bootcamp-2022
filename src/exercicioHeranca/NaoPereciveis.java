package exercicioHeranca;

public class NaoPereciveis extends Produto {
    private String tipo;


    public String getTipo (){

        return tipo;
    }

    public void setTipo (){

        this.tipo = tipo;
    }


    public NaoPereciveis (String nome, int preco, String tipo){
        super(nome, preco);
        this.tipo=tipo;
    }

    public int calcular (int quantidade) {

        double valor = getPreco()*quantidade;
        System.out.println(valor);
        return (int)valor;
    }
}
