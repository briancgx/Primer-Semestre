import javax.swing.*;
public class Ejercicio23 //Aqui se almacenan todos los metodos
{   public void Mujeres()
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

    }

   public void Agentes()
    {   int va1, va2, cvendidas, ventasa1, ventasa2;
        float  ingresos;
        String agente1, agente2;
        Teclado x=new Teclado();
        System.out.print("Ingrese el nombre del primer agente: ");
        agente1=x.leeString();
        System.out.print("Ingrese el nombre del segundo agente: ");
        agente2=x.leeString();
        System.out.print("Cuantas computadoras vendió "+agente1+"?");
        va1=x.leeInt();
        System.out.print("Cuantas computadoras vendió "+agente2+"?");
        va2=x.leeInt();
        cvendidas=va1+va2;
        ventasa1=va1*12500;
        ventasa2=va2*12500;
        ingresos=(cvendidas*12500)*(0.80f);
        System.out.println("Computadoras veniddas totales: "+cvendidas+"\n"+
                            "Total de ventas de "+agente1+" es de: "+ventasa1+"\n"+
                            "Total de ventas de "+agente2+" es de: "+ventasa2+"\n"+
                            "Ingresos totales descontando las comisiones de los vendedores: "+ingresos);

    }

    public void Serie() 
	{	double x,n,div,facN,potX,sum; 
		int	cont, band;
		cont=1;	n=0; sum=0; facN=1; potX=0; div=0;
		Teclado t=new Teclado();
		do 
			{	System.out.println("Capure el valor de X: ");
				x=t.leeInt();
			}	
		while(x==0);
		do
			{
	        	{	try
			   		{	System.out.println("Capture el valor de N: ");
						n=t.leeInt();
						band=0;
					}
		   	    	catch(NumberFormatException z)
					{   System.out.println("Por favor, captura un numero entero");
				   	 	band=1;
			    	}
	        	}
   	    	}
		while((n<0)||(band==1));
   	    n=n-1;
		while(cont<=n)
			{	facN=facN*cont;
				potX=Math.pow(x,cont);
				div=potX/facN;
				sum=sum+div;
					
				System.out.println("El numero "+x+" elevado a la potencia de "+cont+" es: " +potX);
				System.out.println("El valor del factorial de "+cont+" es: " +facN);
				System.out.println("La division en la posicion: "+cont+" es "+div);
				cont++;
		   }
		System.out.println("la suma total de la operacion es: "+(sum+1));
	}
}