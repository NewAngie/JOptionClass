import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {

        int figura;
        int lado;
        int altura;
        double area;
        int radio;
        Scanner Objeto = new Scanner(System.in);
        System.out.println("Para calcular el área de una figura selecciona \n1 Rectangulo \n2 Triangulo \n3 Circulo \n4 SALIR.");
        figura=Objeto.nextInt();
        System.out.println("Selecciona una figura: "+figura);

        switch (figura){
            case 1:
                System.out.println("Rectangulo");
                Scanner Objeto2 = new Scanner(System.in);
                System.out.println("Ingresa el valor del lado mas largo del rectangulo");
                lado=Objeto2.nextInt();
                System.out.println("El valor del lado es:"+lado);
                System.out.println("Ingresa el valor de la altura");
                altura=Objeto2.nextInt();
                System.out.println("El valor de la altura es: "+altura);
                area=lado*altura;
                System.out.println("El área es: "+area);
                break;

            case 2:
                System.out.println("Triangulo");
                Scanner Objeto3 = new Scanner(System.in);
                System.out.println("Ingresa el valor de la base: ");
                lado=Objeto3.nextInt();
                System.out.println("El valor de la base es:"+lado);
                System.out.println("Ingresa el valor de la altura");
                altura=Objeto3.nextInt();
                System.out.println("El valor de la altura es: "+altura);
                area=lado*altura/2;
                System.out.println("El área es: "+area);
                break;

            case 3:
                System.out.println("Circulo");
                Scanner Objeto4 = new Scanner(System.in);
                System.out.println("Ingresa el valor del radio");
                radio=Objeto4.nextInt();
                System.out.println("El valor del radio es:"+radio);
                area=3*Math.pow(radio,2);
                System.out.println("El área es: "+area);
                break;

            case 4:
                System.out.println("Adiós");
                break;

        }
    }
}