package Strings;

public class Cadenas {
    public static void textos(){
        // * 1. Concatena dos cadenas de texto.

        String texto = " Habia una vez, que un señor llamado name ";
        String parrafo = "Esto es una prueba";

        System.out.println("La historia : " + texto + " " + parrafo);

        // * 2. Muestra la longitud de una cadena de texto.
        System.out.format("La Longitud del texto es %s ", texto.length());

        // * 3. Muestra el primer y último carácter de un string.
        System.out.format("\nPrimer caracter del texto %s \nultimo caracter del texto %s", texto.charAt(0), texto.charAt(texto.length() - 1));
        System.out.println("\n=========================");
        // * 4. Convierte a mayúsculas y minúsculas un string.

        String nombre = "JoEl";
        String apellido = "MonTeRo";

        System.out.println("\nMinusculas ===================");
        System.out.println(nombre.toLowerCase());
        System.out.println(apellido.toLowerCase());

        System.out.println("\nMayusculas=================");
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toUpperCase());

        // * 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println("=================Consultar un texto======================");
        System.out.println("nombre contiene \"OE\"");
        System.out.println(nombre.toUpperCase().contains("OE"));

        // * 6. Formatea un string con un entero.
        nombre = nombre.toUpperCase();
        int edad = 20;
        System.out.format("La edad de %s es %d", nombre, edad);

        // * 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("\nOriginar :" + texto);
        System.out.println("Sin espacias al i y al f :" + texto.trim());

        // * 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        System.out.println(texto.replace(" ", "-"));

        // * 9. Comprueba si dos strings son iguales.
        System.out.println(texto.equals(parrafo));
        
        // * 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(texto.length() == parrafo.length());
    }
}
