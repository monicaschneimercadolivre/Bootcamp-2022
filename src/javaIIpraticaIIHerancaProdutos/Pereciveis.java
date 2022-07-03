package javaIIpraticaIIHerancaProdutos;

public class Pereciveis extends Produto{
    private double diasParaVencer;

    public double getDiasParaVencer(){

        return diasParaVencer;
    }

    public void setDiasParaVencer (int diasParaVencer){

        this.diasParaVencer=diasParaVencer;
    }
    //construtor
    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }


    public int calcular (int quantidade) {
        double valor = getPreco()*quantidade;
        if (diasParaVencer==1){
            valor = valor/4;
            System.out.println("O preço do produto é: " + valor);
        } else if (diasParaVencer==2){
            valor=valor/3;
            System.out.println("O preço do produto é: " + valor);
        }else if (diasParaVencer==3){
            valor=valor/2;
            System.out.println("O preço do produto é: " + valor);
        }
        return (int) valor;

    }

}
