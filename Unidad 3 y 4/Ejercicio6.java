import javax.swing.*;
public class Ejercicio6
{   public static void main(String[] args)
    {   int a, b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Capture el primer numero: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Capture el segundo numero: "));
        if(a>b)
            JOptionPane.showMessageDialog(null,"El numero "+a+" es mayor que el numero "+b);
        else
            {   if(b>a)
                        JOptionPane.showMessageDialog(null,"El numero "+b+" es mayor que el numero"+a);                    
                else
                    JOptionPane.showMessageDialog(null,"Los numeros "+a+" y" +b+" son iguales");
            }
        System.exit(0);
    }
}