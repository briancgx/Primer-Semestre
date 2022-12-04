import javax.swing.*;
public class Ejercicio9 
{   public static void main(String[] args)
    {   int cont, ce, cn, cantn, edad;
        double pg, z;
        String ut; cont=1; ce=1; cn=0;
        while (cont <=10)
            {   ut=JOptionPane.showInputDialog("Usted, ¿trabaja? : (si/no)");
               if (ut.equals("si"))
                    {   cantn=Integer.parseInt(JOptionPane.showInputDialog("Cuantos niños requieren guardería?"));
                        ce=1;
                        while (ce<=cantn)
                            {  edad=Integer.parseInt(JOptionPane.showInputDialog("Capture la edad de el "+ce+" hijo o hija: "));
                            if ((edad>=1)&&(edad<=3))
                                cn=cn+1;
                            ce=ce+1;
                            }    
                    }
                cont=cont+1;
            }
        pg=cn/5;
        z=Math.ceil(pg);
        JOptionPane.showMessageDialog(null,"Total de guarderias necesarias: "+z );
        System.exit(0);
    }
    
}
