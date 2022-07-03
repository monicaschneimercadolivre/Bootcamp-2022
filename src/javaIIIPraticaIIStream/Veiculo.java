package javaIIIPraticaIIStream;

public class Veiculo implements Comparable<Veiculo> {
    String modelo;
    String marca;
    double preco;

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Veiculo(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public int compareTo(Veiculo veiculo) {
        if (this.preco < veiculo.getPreco()) {
            return -1;
        } else if (this.preco > veiculo.getPreco()) {
            return 1;
        } else {
            return 0;
        }

    }
}