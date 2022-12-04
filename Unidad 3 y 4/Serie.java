public class Serie
{	public void SFact() 
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