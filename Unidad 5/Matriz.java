public class Matriz
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
        System.exit(0);
    }

}