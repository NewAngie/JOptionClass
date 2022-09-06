//Entrada de datos


import java.util.Scanner;

public class InAndOut {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      /*  //ENTEROS
        int numero;
        System.out.println("Digita un numero: ");
         //Donde se va a guardar el valor
        numero=entrada.nextInt();
        System.out.println("El numero es: "+numero);

        //FLOTANTES
        float numero2;
        System.out.println("numoero");
        numero2= entrada.nextFloat();
        System.out.println("flotante es: "+numero2);

        //DOUBLE
        double numero3;
        System.out.println("numero");
        numero3= entrada.nextDouble();
        System.out.println("Double es: "+numero3);

        //CADENAS
        String cadena;
        System.out.println("Escribe algo: ");
        cadena = entrada.nextLine();
        System.out.println("La cadena es: "+cadena);*/

        //LETRA
        char letrita;
        System.out.println("Escribe un caracter");
        letrita = entrada.next().charAt(0);
        System.out.println("La letra es: "+letrita);
    }
}
