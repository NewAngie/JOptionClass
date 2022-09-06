import javax.swing.JOptionPane;

public class JOptionClass {
    public static void main(String[] args) {
        String select;
        int option, degrees;
        JOptionPane.showMessageDialog(null,"Bienvenido al conversor de temperaturas");

        do{
            select = JOptionPane.showInputDialog(null,"Selecciona: \n1.  Celcius a  farenheit \n2.  Celcius a Kelvin \n3.  Celcius  a Rankine \n4.  Farenheit a Celcius \n5.  Kelvin a Celcius \n6.  Rankie a Celcius \n7 Salir");
            option = Integer.parseInt(select);

            switch (option){
                case 1:
                    System.out.println("Celsius a Farenheit");
                    select=JOptionPane.showInputDialog("Ingresa la cantidad a convertir");
                    degrees=Integer.parseInt(select);
                    JOptionPane.showMessageDialog(null, "El equivalente a Farenheit es: " + ((degrees*1.8)+32) + " grados °R");
                    break;
                case 2:
                    System.out.println("Celsius a Kelvin");
                    select=JOptionPane.showInputDialog("Ingresa la cantidad a convertir");
                    degrees=Integer.parseInt(select);
                    JOptionPane.showMessageDialog(null, "El equivalente a Kelvin es: " + (degrees+273.15) + " grados K");
                    break;
                case 3:
                    System.out.println("Celsius a Rankine");
                    select=JOptionPane.showInputDialog("Ingresa la cantidad a convertir");
                    degrees=Integer.parseInt(select);
                    JOptionPane.showMessageDialog(null, "El equivalente a Rankine es: " + ((degrees*1.8)+491.67) + " grados °R");
                    break;
                case 4:
                    System.out.println("Farenheit a Celsius ");
                    select=JOptionPane.showInputDialog("Ingresa la cantidad a convertir");
                    degrees=Integer.parseInt(select);
                    JOptionPane.showMessageDialog(null, "El equivalente a Celsius es: " + ((degrees-32)*0.55) + " grados °C");
                    break;
                case 5:
                    System.out.println("Kelvin a Celsius");
                    select=JOptionPane.showInputDialog("Ingresa la cantidad a convertir");
                    degrees=Integer.parseInt(select);
                    JOptionPane.showMessageDialog(null, "El equivalente a Celsius es: " + (degrees-273.15) + " grados °C");
                    break;
                case 6:
                    System.out.println("Rankie Celsius");
                    select=JOptionPane.showInputDialog("Ingresa la cantidad a convertir");
                    degrees=Integer.parseInt(select);
                    JOptionPane.showMessageDialog(null, "El equivalente a Celsius es: " + ((degrees-491.67)*0.5) + " grados °C");
                    break;
                case 7:
                    System.out.println("Salir");
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    System.out.println("Incorrecto");
                    break;
            }
        }while(option!=7);//Esta es una modificacion para GIT
    }
}





