public class caracteristicas {
    private String marca;
    private int ano;
    private String modelo;
    private String color;
    private int npuertas;

    //CONSTRUCTOR
    public caracteristicas(String marca, int ano, String modelo, String color, int npuertas) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.color = color;
        this.npuertas = npuertas;
    }

    //constructor vacio
    public caracteristicas(){}

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public String getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }
    public int getNpuertas(){
        return npuertas;
    }
}
