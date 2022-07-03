package javaIIPraticaIImc;


import org.w3c.dom.ls.LSOutput;

public class Pessoa {
    String nome;
    int idade;
    String Id;
    double peso;
    double altura;

    public Pessoa() {

    };

    public Pessoa (String nome,int idade, String Id){
        this.nome = nome;
        this.idade = idade;
        this.Id = Id;

    }

    public Pessoa (String nome,int idade, String Id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.Id = Id;
        this.peso = peso;
        this.altura=altura;
    };

    public int calcularIMC () {
        double IMC=peso/Math.pow(altura,2);
        if (IMC <20) {
            return -1;
        } else if (IMC>20 && IMC<25) {
            return 0;
        } else
            return 1;

    };

    public boolean ehMaiorIdade () {
        return idade >18 ? true : false;

    };

    public void toString2 () {
        System.out.println(nome + " " + idade +  " " + Id +  " " + peso +  " " + altura);
        int resultIMC = calcularIMC();
        boolean resultIdade = ehMaiorIdade();

        if (resultIMC ==-1 ) {
            System.out.println("Coma mais!");
        }else if (resultIMC==0) {
            System.out.println("Só sucesso!");
        }else {
            System.out.println("Você está acima do peso");
        }

        if (resultIdade){
            System.out.println("Voce é maior de idade!");

        }else {
            System.out.println("Pirralho!");
        }

    }


};




