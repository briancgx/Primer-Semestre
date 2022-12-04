public class Ejercicio32 
{   public static void main(String[] args)
    {   int f, c, band, sf1, sc1y3, i, j;
        int num[][]=new int[3][3];
        int f1[]=new int[3];
        int c1y3[]=new int[6];
        Teclado t=new Teclado();
        sf1=0;  sc1y3=0; i=0; j=0;
        for(f=0; f<=2; f++)
        for(c=0; c<=2; c++)
            {   do
                    {   try
                            {   System.out.println("Captura el numero en la posicion "+f+", "+c+" :");
                                num[f][c]=t.leeInt();
                                band=0;
                            }
                        catch (NumberFormatException z)
                            {   System.out.println("Captura solo numeros enteros: ");
                                band=1;
                            }
                        if(num[f][c]<=9)
                        System.out.println("Captura solo numeros mayores a 10");
                    }
                while((band==1)||(num[f][c]<=9));
                if(f==0)
                    {   sf1=sf1+5+num[f][c]; 
                        f1[i]=num[f][c]; 
                        i++;
                    }
                if((c==0)||(c==2))
                    {   sc1y3=sc1y3+num[f][c]; 
                        c1y3[j]=num[f][c]; 
                        j++;
                    }
            }
        
            System.out.println("Listado de los numeros de la fila 1:");
                for(i=0; i<=2; i++)
                    System.out.println(+f1[i]);
            System.out.println("Suma de los elementos de la primera fila +5: "+sf1);
            System.out.println("Listado de los numeros de la columna 1 y 3:");
                for(j=0; j<=5; j++)
            System.out.println(+c1y3[j]);
            System.out.println("Suma de los elementos de la columna 1 y 3: "+sc1y3);
            System.out.println("La matriz capturada es: ");
            for(f=0; f<=2; f++)
                {   System.out.println();
                        for(c=0; c<=2; c++)
                            {   System.out.print(num[f][c]+"   ");
                            }
            }
        System.exit(0);
    }
}