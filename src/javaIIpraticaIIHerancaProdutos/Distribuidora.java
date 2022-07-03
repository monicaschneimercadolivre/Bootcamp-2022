package javaIIpraticaIIHerancaProdutos;

public class Distribuidora {

    String produtos [] = {"prduto1", "produto2", "prduto3", "produto4"};
    double precoProdutos [] = {4,3.5,5.8,8};
    double precoAcumuladoProdutos [];

    public void precoTotalProdutos (){
        for (int i=0; i<4 ; i++){
            precoAcumuladoProdutos[i] = precoProdutos[i]*5;
            System.out.println(precoAcumuladoProdutos[i]);
        }
    
    }



}
