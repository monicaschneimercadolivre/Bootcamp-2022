package javaIIIPraticaIIStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;


public class Garagem  {
    String id;
    List<Veiculo> listaVeiculos;


//    public String getId() {
//        return id;
//    }
//
//    public List<Veiculo> getListaVeiculos() {
//        return listaVeiculos;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
//        this.listaVeiculos = listaVeiculos;
//    }


    public Garagem(String id, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public void veiculosPrecosOrdenados(){
        listaVeiculos.stream()
                .sorted((v1,v2)->Double.compare(v1.getPreco(),v2.getPreco()))
                .forEach(System.out::println);
    }

    public void veiculosMarcasOrdenadas(){
        listaVeiculos.stream()
                .sorted((m1,m2)->m1.getMarca().compareTo(m2.getMarca()))
                .forEach(System.out::println);
    }

    public void mediaPrecosVeiculos(){
        OptionalDouble mediaPrecos = listaVeiculos.stream()
                .mapToDouble(v-> v.getPreco())
                .average();
        System.out.println("A média dos precos dos veiculos é: "+ Math.round(mediaPrecos.getAsDouble()));
    }



    @Override
    public String toString() {
        return "Garagem{" +
                "id='" + id + '\'' +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }
}