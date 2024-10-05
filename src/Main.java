public class Main {
    public static void main(String[] args) {

        String [] marcas = {"Ford","Acura","BMW","Ferrari","Mitsubishi", "Alfa Romeo","BYD","Dodge","Honda",
                "Aston Martin","Chevrolet","Mazda","Cadillac","Hyundai", "KIA", "Lexus",   };

        BusqConcesionario.Busqueda<String> b = new BusqConcesionario.Busqueda<>();
        b.OrdSeleccion(marcas);
        for (int i = 0; i < marcas.length; i++) {
            System.out.println("Estas son las marcas que tenemos: " + marcas[i]);
        }

        System.out.println("-----------");
        System.out.println("-----------");

        System.out.println("Buscas una marca en especial?, dinosla y consultaremos existencia");
        BusqConcesionario.Busqueda<String> b2 = new BusqConcesionario.Busqueda<>();
        b2.OrdSeleccion(marcas);
        System.out.println(b2.BusqLineal(marcas,0, marcas.length-1,"Lamborghini"));

        System.out.println("-----------");
        System.out.println("-----------");

        System.out.println("De que año lo buscas?");
        Integer [] year= {1998, 2000, 2005, 2007, 2010, 2015, 2018, 2020, 2022, 2024 };
        BusqConcesionario.Busqueda<Integer> b3 = new BusqConcesionario.Busqueda<>();
        System.out.println("Al parecer el año que dices lo tenemos como: " + b3.BusqBinaria(year, 0, year.length-1,2005));
    }
}