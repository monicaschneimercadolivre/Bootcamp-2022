package javaIIpraticaIIExcecao;

public class PraticaExcecoes {
    int a;
    int b;

    public PraticaExcecoes (int a, int b){
        this.a=a;
        this.b=b;

    }

    public void calcularRazao(){
        try {
            int razao = b / a;
            System.out.println(razao);
        }
         catch (ArithmeticException exception) {
             throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        finally {
            System.out.println("fim");
        }
        }
    }



