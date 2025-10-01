public class segundo {
    public static void main(String[] args) {
        String carro="catalogo";
        System.out.println(carro);

        caracteristicas auto = new caracteristicas("Chevrolet", 2023, "aveo", "gris",
        4);
        System.out.println("Marca:" + auto.getMarca());
        System.out.println("Año: " + auto.getAno());
        System.out.println("Modelo: "+ auto.getModelo());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Numero de puertas: " + auto.getNpuertas());
    }
}
