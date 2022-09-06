import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);//objeto que guarda espacio en memoria
        int select,option;
        double number;
        do {
            System.out.println("Bienvenido al conversor:");
            System.out.println("Selecciona: \n1. Centimetros a Metros \n2. Metros a Kilometros \n3. Metros a Yardas \n4. Metros a pies \n5. Pies a yardas \n6. Salir");
            option = value.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Centimetros a Metros");
                    System.out.println("Ingresa la longitud:");
                    number = value.nextDouble();
                    System.out.println(number +" centimetros equivalen a " + number/100+ " metros");
                    break;
                case 2:
                    System.out.println("Metros a Kilometros");
                    System.out.println("Ingresa la longitud:");
                    number = value.nextDouble();
                    System.out.println(number +" metros equivalen a " + number/1000+ " kilometros");
                    break;
                case 3:
                    System.out.println("Metros a Yardas");
                    System.out.println("Ingresa la longitud:");
                    number = value.nextDouble();
                    System.out.println(number +" metros equivalen a " + number*1.094+ " yardas");
                    break;
                case 4:
                    System.out.println("Metros a Pies");
                    System.out.println("Ingresa la longitud:");
                    number = value.nextDouble();
                    System.out.println(number +" metros equivalen a " + number*3.281+" pies");
                    break;
                case 5:
                    System.out.println("Pies a Yardas");
                    System.out.println("Ingresa la longitud:");
                    number = value.nextDouble();
                    System.out.println(number +" pies equivalen a " + number/3+ " yardas");
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Seleccion incorrecta");
                    break;
            }
        }while (option!=6);
    }
}
