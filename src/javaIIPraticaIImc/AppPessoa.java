package javaIIPraticaIImc;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        Pessoa pessoa2 = new Pessoa("yago", 30, "01");

        Pessoa pessoa3 = new Pessoa("yago", 30, "01", 60, 1.74);

        Pessoa pessoa4 =new Pessoa ("yago", 30, ""); // não faça isso! Deu ruim! Não existe um construtor com dois parametros

        pessoa3.toString2();


    }

}

