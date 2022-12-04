public class Ejercicio26
{   public static void main(String[] args)
    {   int i, j, x, c3, m;
        j=0; m=0; c3=0;
        int serie[]=new int[8];
        int nm3[]=new int[3];
        for(i=2; i<=16; i+=2)
            {   serie[j]=i;
                j=j+1;
                x=i%3;
                if(x==0)
                    {   c3=c3+1;
                        nm3[m]=i;
                        m=m+1;
                    }
            }
        System.out.println("Los numeros pares entre 2 y 16 son:");
        for(j=0; j<=7; j++)
        System.out.println(+serie[j]);
        System.out.println("La cantidad de numeros multiplos de 3 entre 2 y 16 son: "+c3);
        System.out.println("Estos fueron:");
        for(m=0; m<2; m++)
        System.out.println(+nm3[m]);
        System.exit(0);

    }

}