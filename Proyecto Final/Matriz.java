public class Matriz
{   public static void main(String[] args)
    {   int f, c, band, m2, m3;
        int num[][] = new int[4][4];
        int mat0[][] = new int[4][4];
        int matm1[][] = new int[4][4];
        int mat3[][] = new int[4][4];
        Teclado t = new Teclado();
        f=0; c=0;
        for(f=0; f<=3; f++)
        for(c=0; c<=3; c++)
            {   do
                    {   try
                            {   System.out.println(+f+" "+c+" .-Captura un numero entero positivo: ");
                                num[f][c]=t.leeInt();
                                band=0;
                            }
                        catch(NumberFormatException z)
                            {   System.out.println("CAPTURE UN ENTERO POSITIVO");
                                band=1;
                            }
                        if(num[f][c]<0)
                            System.out.println("CAPTURA UN ENTERO POSITIVO");
                    }
                while((band==1)&&(num[f][c]<0));
                m2=num[f][c]%2;
                if(m2==0)
                   mat0[f][c]=0;      
                else
                    mat0[f][c]=num[f][c];
                if((c==1)||(c==2))
                    matm1[f][c]=-1;
                else
                    matm1[f][c]=num[f][c];
                m3=num[f][c]%3;
                if(m3==0)
                    mat3[f][c]=3;
                else
                    mat3[f][c]=num[f][c];
            }
        System.out.println("La matriz original es: ");
        for(f=0; f<=3; f++)
            {   System.out.println();
                for(c=0; c<=3; c++)
                    {   System.out.print(+num[f][c]+"   ");
                    }
            }

        System.out.println("\n\nLa matriz con los pares sustituidos es: ");
        for(f=0; f<=3; f++)
            {   System.out.println();
                for(c=0; c<=3; c++)
                    {   System.out.print(+mat0[f][c]+"   ");
                    }
            }

        System.out.println("\n\nLa matriz con la columna 2 y 3 sustituidos es: ");
        for(f=0; f<=3; f++)
            {   System.out.println();
                for(c=0; c<=3; c++)
                    {   System.out.print(+matm1[f][c]+"   ");
                    }
            }

        System.out.println("\n\nLa matriz con los multiplos de 3 sustituidos es: ");
        for(f=0; f<=3; f++)
            {   System.out.println();
                for(c=0; c<=3; c++)
                    {   System.out.print(+mat3[f][c]+"   ");
                    }
            }
        System.exit(0);
    }
}