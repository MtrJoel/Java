package src.Operadores;

public class Operadores {
    public static void  run(){
        // * 1. Crea una variable con el resultado de cada operación aritmética.
       int a = 10;
       int b = 5;
       int multi = a * b;
       int sum = a + b;
       int resta = a - b;
       int div = a / b;

       System.out.println(multi);
       System.out.println(sum);
       System.out.println(resta);
       System.out.println(div);

       // * 2. Crea una variable para cada tipo de operación de asignación.

        double PI = 3; // ! Declaramos y inicializamos PI
        PI += 0.1415; // ! Usamos el operador de asignación mas suma
        System.out.println(PI); // ! Mostramos por consola el valor final de PI

        int year = 2030;
        year -= 4;
        System.out.println(year);

        double total = 30;
        total *= 3;
        System.out.println(total);

        double repart = 30;
        repart /= 3;
        System.out.println(repart);

        // * 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        int isValid =  2;
        System.out.println(isValid >= 20);
        System.out.println(isValid == 25);
        System.out.println(isValid < 100);

        // * 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(isValid <= 20);
        System.out.println(isValid != 25);
        System.out.println(isValid > 100);

        // * 5. Utiliza el operador lógico and.
        char sex = 'M';
        if(sex == 'M' && isValid >= 18){
            System.out.println("Pasa");
        } else {
            System.out.println("No cumples los requisitos");
        }

        // *  6. Utiliza el operador lógico or.
        if(sex == 'M' || isValid >= 18){
            System.out.println("Se cumple una o ambas");
        } else {
            System.out.println("No se cumple ninguna");
        }

        // * 7. Combina ambos operadores lógicos.
        int z = 20;
        String name = "Joel";
        if(z == 20 && name.equals("Joel")){
            System.out.println("Eres Joel");
        } else if(z >= 18 || name.equals("Joel")){
            System.out.println("Te pareces a Joel");
        } else {
            System.out.println("No eres Joel");
        }
        // * 8. Añade alguna negación.

        if(z != a){
            System.out.println("z y a son distintos");
        } else {
            System.out.println("son iguales");
        }

        // * 9. Imprime 3 ejemplos de uso de operadores unarios.

        a = -a;
        System.out.println(a);
        a++;
        System.out.println(a);

        boolean isStudent = true;
        isStudent = !isStudent;
        System.out.println(isStudent);

        // * 10. Combina operadores aritméticos, de comparación y lógicos.

        if(a <= 0 || a == 0){
            System.out.format(" el valor de a es %d y no puede ser negativo ", a);
        } else if (a >= 1 && a <= 20){
            System.out.println("Estas en un rango de edad de 1 a 20");
        } else if(!isStudent){
            System.out.println("No eres estudiante ");
        } else{
            System.out.println("No Valid");
        }

    }
}
