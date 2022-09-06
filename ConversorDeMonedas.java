import java.io.BufferedReader;        //permite manejar la memoria
import java.io.InputStreamReader;     //manejar los dispositivos de entrada
import java.io.IOException;

public class ConversorDeMonedas {
    public static void main(String[] args) throws Exception{
        InputStreamReader stm = new InputStreamReader(System.in);    //se realiza el almacenamiento por dispositivos
        BufferedReader bfr = new BufferedReader(stm); //guarda los datos en memoria

        System.out.println("Para realizar una conversión monetaria selecciona \n1 MXN a USD\n2 USD a ITL\n3 MXN a LB\n4 MXN A YN\n5 Salir ");
        String moneda = bfr.readLine();
        int monedaInt = Integer.parseInt(moneda);
        double  dolar = 19.98;
        double lira = 0.055;
        double yen = 0.14;
        double libraEst = 22.89;

        switch (monedaInt){
            case 1:
                System.out.println("Pesos Mexicanos a Dolares");
                System.out.println("Ingresa la cantidad que deseas convertir a dolares:  ");
                String mxn = bfr.readLine();
                int mxnInt = Integer.parseInt(mxn);
                System.out.println(mxnInt +" pesos méxicanos a dolares son: "+mxnInt/dolar);
                break;
            case 2:
                System.out.println("Dolares a Liras");
                System.out.println("Ingresa la cantidad de Dolares que deseas convertir a Liras:  ");
                String usd = bfr.readLine();
                int usdInt = Integer.parseInt(usd);
                System.out.println(usd+" dolares equivalen a "+usdInt/lira+ "Liras turcas");
                break;
            case 3:
                System.out.println("Pesos Mexicanos a Libras ");
                System.out.println("Ingresa la cantidad de Pesos que deseas convertir a Libras:  ");
                String mxn2 = bfr.readLine();
                int mxn2Int = Integer.parseInt(mxn2);
                System.out.println(mxn2+" Pesos equivalen a "+mxn2Int/libraEst+ "Libras");
                break;
            case 4:
                System.out.println("Pesos Mexicanos a Yenes ");
                System.out.println("Ingresa la cantidad de Pesos que deseas convertir a Yenes:  ");
                String mxn3 = bfr.readLine();
                int mxn3Int = Integer.parseInt(mxn3);
                System.out.println(mxn3+" Pesos equivalen a "+mxn3Int/yen+ "Yenes");
                break;
            case 5:
                System.out.println("Adios");
                break;
        }
    }
}
