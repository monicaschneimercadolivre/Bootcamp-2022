package javaIPraticaITemperaturas;

public class Temperaturas {
    public static void main(String[] args) {
        String cidades[] = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Asuncion", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Toquio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int min = 1000;
        int max = -10000;
        int maxId =0;
        int minId =0;

        for (int i = 0; i < 10; i++) {
            if (min>temperaturas[i][0]){
                min= temperaturas [i][0];
                minId=i;
            }
        }
        System.out.println(min);

        for (int i = 0; i < 10; i++) {
            if (max<temperaturas[i][1]){
                max= temperaturas [i][1];
                maxId=i;
        }
    }
        System.out.println(max);

        for (int i = 0; i < 10; i++) {
            System.out.println(cidades[i] + "\nMin: " + temperaturas[i][0] + "\nMax: " + temperaturas[i][1]);
        }
        System.out.println("Maior temperatura: " + cidades[maxId]+ " " + max );
        System.out.println("Menor temperatura: " + cidades[minId] + " " + min);
}

}
