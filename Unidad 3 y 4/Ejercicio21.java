import javax.swing.*;
public class Ejercicio21
{   public static void main(String[] args)
    {   int resp;
        Mujeres m=new Mujeres();
        Agentes a=new Agentes();
        Serie s= new Serie();
        do
            {   resp=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal"+
                                                                    "\n1.-Senso de mujeres trabajadoras"+
                                                                    "\n2.-Serie de division de factoriales"+
                                                                    "\n3.-Agentes de Ventas"+
                                                                    "\n4.-Fin de Programa"+
                                                                    "\nSeleccione una opcion"));
                switch(resp)
                    {   case 1: m.Senso();
                        break;
                        case 2: s.SFact();
                        break;
                        case 3: a.Ventas();
                        break;
                        case 4: JOptionPane.showMessageDialog(null,"Fin del programa");
                        break;
                        default: JOptionPane.showMessageDialog(null,"Seleccion erronea, intente de nuevo");
                    }
            }
        while(resp!=4);
        System.exit(0);
    }
}