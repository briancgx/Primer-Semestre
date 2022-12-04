public class Metodos
{   public void matrizD()
        {   int f, c, i, j, st, sd, x, m, band;
            Teclado t=new Teclado();
            int num[][]=new int[3][3];
            int b[]=new int[3];
            int m3[]=new int[9];    
            st=0;   i=0;    j=0;    m=0;    sd=0;
            for(f=0; f<=2; f++)
            for(c=0; c<=2; c++)
                {   do
                        {   try
                                {   System.out.println("Captura un numero: "+f+" "+c);
                                    num[f][c]=t.leeInt();
                                    band=0;
                                }
                            catch (NumberFormatException z)
                                {   System.out.println("Captura solo numeros enteros: ");
                                    band=1;
                                }
                            if(num[f][c]<0)
                                {   System.out.println("Captura solo numeros positivos: ");
                                }
                        }
                    while((band==1)||(num[f][c]<0));
                    st=st+num[f][c];
                    if(f==c)
                        {   sd=sd+num[f][c]; 
                            b[i]=num[f][c];
                            i=i+1;
                        }
                    x=num[f][c]%3;
                    if(x==0)
                        {   m3[j]=num[f][c];
                            j=j+1;
                            m=m++;
                        }    
            }
        
            System.out.println("Suma de todos los elementos de la matriz: "+st);
            System.out.println("Suma de la diagonal principal: "+sd);
            System.out.println("Listado de los elementos de la diagonal principal");
            for(i=0; i<=2; i++)
                System.out.println(+b[i]);
            System.out.println("Listado de los numeros multiplos de 3 que tiene la matriz");
            for(j=0; j<m; j++)
                System.out.println(+m3[j]);
            System.out.println("La matriz que se capturo es: ");
            for(f=0; f<=2; f++)
                {   System.out.println();
                    for(c=0; c<=2; c++)
                        {   System.out.print(+num[f][c]+"  ");
                        }
                }
        }

    public void agentes()
        {   int va1, va2, cvendidas, ventasa1, ventasa2;
            float  ingresos;
            String agente1, agente2;
            Teclado x=new Teclado();
            System.out.print("Ingrese el nombre del primer agente: ");
            agente1=x.leeString();
            System.out.print("Ingrese el nombre del segundo agente: ");
            agente2=x.leeString();
            System.out.print("Cuantas computadoras vendió "+agente1+"?: ");
            va1=x.leeInt();
            System.out.print("Cuantas computadoras vendió "+agente2+"?: ");
            va2=x.leeInt();
            cvendidas=va1+va2;
            ventasa1=va1*12500;
            ventasa2=va2*12500;
            ingresos=(cvendidas*12500)*(0.80f);
            System.out.println("Computadoras veniddas totales: "+cvendidas+"\n"+
                                "Total de ventas de "+agente1+" es de: $"+ventasa1+"\n"+
                                "Total de ventas de "+agente2+" es de: $"+ventasa2+"\n"+
                                "Ingresos totales descontando las comisiones de los vendedores: $"+ingresos);

        }

    public void serie() 
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