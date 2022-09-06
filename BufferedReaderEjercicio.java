import java.io.BufferedReader;        //permite manejar la memoria
import java.io.InputStreamReader;     //manejar los dispositivos de entrada

public class BufferedReaderEjercicio
{
    public static void main(String[] args) throws Exception {
        InputStreamReader st = new InputStreamReader(System.in);    //se realiza el almacenamiento por dispositivos
        BufferedReader bf = new BufferedReader(st); //guarda los datos en memoria

        System.out.println("Para calcular el área de una figura selecciona \n1 Rectangulo \n2 Triangulo \n3 Circulo \n4 SALIR.: ");
        String selection = bf.readLine();
        int entero = Integer.parseInt(selection);

        switch (entero){
            case 1:
                System.out.println("Cuadrado");
                System.out.println("Ingresa el valor de un lado: ");
                String lado = bf.readLine();;
                int laInt = Integer.parseInt(lado);
                System.out.println("El área del cuadrado es: "+laInt*laInt);
                break;
            case 2:
                System.out.println("Triangulo");
                System.out.println("Ingresa el valor de la base: ");
                String base = bf.readLine();;
                int baseInt = Integer.parseInt(base);
                System.out.println("Ingresa el valor de la altura: ");
                String altura= bf.readLine();
                int alturaInt = Integer.parseInt(altura);
                System.out.println("El área del triangulo es: "+baseInt*alturaInt/2);
                break;
            case 3:
                System.out.println("Circulo");
                System.out.println("Ingresa el valor del radio: ");
                String radio = bf.readLine();
                int radInt = Integer.parseInt(radio);
                System.out.println("El área del circulo es: "+ 3.14*Math.pow(radInt,2));
                break;
            case 4:
                System.out.println("Salir");
                break;
        }
    }
}
