public class Ejercicio29 
{   public static void main(String[] args)
    {   int f, c;
        double s;
        double a[][]=new double[3][3];
        Teclado t=new Teclado();
        s=0;
        for(f=0; f<=2; f++)
        {    for(c=0; c<=2; c++)
                {   System.out.println("Captura un numero: ");
                    a[f][c]=t.leeDouble();
                    s=s+a[f][c];
                }
        }
        System.out.println("La suma es :"+s);
        for(f=0; f<=2; f++)
            {   System.out.println();
                for(c=0; c<=2; c++)
                    {   System.out.print(+a[f][c]+"   ");
                    }

            }
        System.exit(0);
    }
}
