public class Ejercicio30 
{   public static void main(String[] args)
    {   int f, c, band, cont, fact;
        int num[][]=new int[2][3];
        int fac[][]=new int[2][3];
        Teclado t=new Teclado();
        for(f=0; f<=1; f++)
        for(c=0; c<=2; c++)
            {   do
                    {   try
                            {   System.out.println("Captura el numero entero positivo "+f+","+c+" :");
                                num[f][c]=t.leeInt();
                                band=0;
                            }
                        catch(NumberFormatException z)
                            {   System.out.println("VERIFIQUE QUE SEA NUMERO ENTERO POSITIVO");
                                band=1;
                            }
                        if(num[f][c]<0)
                            {   System.out.println(" VERIFIQUE QUE SEA NUMERO ENTERO POSITVO");
                            }
                    }
                while((band==1)||(num[f][c]<0));
                cont=1;    fact=1;
                while(cont<=num[f][c])
                    {   fact=fact*cont;
                        cont=cont+1;
                    }   
                fac[f][c]=fact;
            }
        System.out.println("La matriz capturada es: ");
        for(f=0; f<=1; f++)
            {   System.out.println();
                for(c=0; c<=2; c++)
                    {   System.out.print(+num[f][c]+"   ");
                    }
            }
        System.out.println("\nLa matriz factorial de los numeros capturados es: ");
        for(f=0; f<=1; f++)
            {   System.out.println();
                for(c=0; c<=2; c++)
                    {   System.out.print(+fac[f][c]+"   ");
                    }
            }
        System.exit(0);
    }
    
}
