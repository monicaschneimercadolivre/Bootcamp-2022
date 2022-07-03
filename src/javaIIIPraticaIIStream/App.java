package javaIIIPraticaIIStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos= new ArrayList();
        Garagem garagem = new Garagem("123",listaVeiculos);

        listaVeiculos.add(new Veiculo("Fiesta", "Ford", 1000));
        listaVeiculos.add(new Veiculo("Focus", "Ford", 1200));
        listaVeiculos.add(new Veiculo("Explorer", "Ford", 2500));
        listaVeiculos.add(new Veiculo("Uno", "Fiat", 500));
        listaVeiculos.add(new Veiculo("Cronos", "Fiat", 1000));
        listaVeiculos.add(new Veiculo("Torino", "Fiat", 1250));
        listaVeiculos.add(new Veiculo("Aveo", "Chevrolet", 1250));
        listaVeiculos.add(new Veiculo("Spin", "Chevrolet", 2500));
        listaVeiculos.add(new Veiculo("Corola", "Toyota", 1200));
        listaVeiculos.add(new Veiculo("Fortuner", "Toyota", 3000));
        listaVeiculos.add(new Veiculo("Logan", "Renault", 950));
        //System.out.println(garagem.toString());

        // garagem.veiculosPrecosOrdenados();
        // garagem.veiculosMarcasOrdenadas();
        //garagem.mediaPrecosVeiculos();

        //listaVeiculos.stream().sorted((v1,v2)->Double.compare(v1.getPreco(),v2.getPreco())).forEach(System.out::println);
        //listaVeiculos.stream().sorted((v1,v2)->v1.getMarca().compareTo(v2.getMarca())).forEach(System.out::println);


//      listaVeiculos.stream().filter(n -> n.getPreco()<1000);
//      listaVeiculos.stream().filter(Veiculos -> Veiculos.getPreco()<=1000);
//
//      listaVeiculos.stream().map(Veiculo::getPreco).filter(v -> v<1000);compareTo()
//
//      System.out.println(listaVeiculos.stream().mapToDouble(v->v.getPreco()).average());

        listaVeiculos.stream().sorted(Veiculo::compareTo).forEach(System.out::println);



    }






}
