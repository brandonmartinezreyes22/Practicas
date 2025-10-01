public class primero {
    public static void main(String[] args) {
        String saludo="hola mundo";
        int edad=20;
        float altura=1.75f;
        System.out.println(saludo);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        Datos persona = new Datos("Juan", 25, "juan@hotmail.com");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("correo: " + persona.getCorreo());
    }
    
}
