package exercicioHeranca;

public class Distribuidora_ {
    public static void main(String[] args) {
        Produto produto = new Produto("produto",  4);
       produto.calcular(5);
       Produto nescau = new Pereciveis ("nescau", 2,2);
       Produto leite = new Pereciveis("leite", 7,3);
       Produto pao = new Pereciveis("pao",1,2);
       Produto livro = new NaoPereciveis("caneta", 3, "livraria");
       Produto caneta = new NaoPereciveis("borracha", 2, "papelaria");

       Produto []sacola = new Produto [5];

       sacola[0]= nescau;
       sacola[1]=leite;
       sacola[2]=pao;
       sacola[3]=livro;
       sacola[4]=caneta;


        for(int i=0; i<sacola.length; i++){
          double total= sacola[i].calcular(5);
        }



        // Produto produto = new Produto("produto",  4);
       // produto.calcular(5);
        //Pereciveis pereciveis = new Pereciveis("2",4, 2);
        //pereciveis.calcular(8);
        NaoPereciveis naoPereciveis = new NaoPereciveis("ello", 5,"perecieel");
        naoPereciveis.calcular(2);
       // Distribuidora distribuidora = new Distribuidora();
        //di/stribuidora.precoTotalProdutos ();
    }
}
