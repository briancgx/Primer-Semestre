import javax.swing.*;
public class Ejercicio20
{   public static void main(String[] args)
    {   int opc, i, s, num, m3, sm5, pm10;
        double ct, cant;
        do
            {   opc=Integer.parseInt(JOptionPane.showInputDialog("Menu principal"+
                                                                    "\n1.-Sumar 3 numeros"+
                                                                    "\n2.-Inversión en 5 años"+
                                                                    "\n3.-Serie de 5,10,15,20,25,30"+
                                                                    "\n4.-Finaliza el programa"+
                                                                    "\nSeleccione su opcion"));
                switch(opc)
                {   case 1: s=0;
                        for(i=1; i<=3; i++)
                            {   num=Integer.parseInt(JOptionPane.showInputDialog("Captura un numero: "));
                                s=s+num;
                            }
                        JOptionPane.showMessageDialog(null,"La suma es: "+s);
                    break;
                    case 2: ct=5000;
                            for(i=1;i<=5;i++)
                                {   ct=ct*1.06;
                                    if(i==3)
                                        {   cant=Double.parseDouble(JOptionPane.showInputDialog("Cual es la nueva inversión?"));
                                            ct=ct+cant;
                                        }
                                }
                            JOptionPane.showMessageDialog(null,"La inversion total que recibirá esta persona es "+ct);
                    break;
                    case 3: m3=0;   sm5=0;  pm10=1;
                        for(i=5;i<=30;i+=5)
                            {    num=i%3;
                                    if(num==0)
                                        m3++;
                                        num=i%5;
                                    if(num==0)
                                        sm5=sm5+i;
                                        num=i%10;
                                    if(num==0)
                                        pm10=pm10*i;
                            }
                        JOptionPane.showMessageDialog(null,"Cantidad de multiplos de 3:  "+m3+
                                                                            "\nResultado de la suma de los multiplos de 5:  "+sm5+
                                                                            "\nResultado de el producto de los multiplos de 10: "+pm10);
                    break;
                    case 4: JOptionPane.showMessageDialog(null,"Finaliza el programa");
                    break;
                    default: JOptionPane.showMessageDialog(null,"Seleccion erronea, intente nuevamente");
                }   

            }
        while(opc!=4);
        System.exit(0);
    }
}