public class Ejercicio25 
{   public static void main(String[] args)
    {   int i, band, f, j;
        int num[]=new int[4];
        int fact[]=new int[4]; 
        Teclado t=new Teclado();
        for(i=0; i<=3; i++)
            {    do    
                    {   try
                            {   System.out.println(+i+".-Captura un numero: ");
                                num[i]=t.leeInt();
                                band=0;
                            }
                        catch(NumberFormatException z)
                            {   System.out.println("Por favor capture un numero entero positivo");
                                band=1;
                            }
                    }
                while((band==1)||(num[i]<0));
                f=1;
                for(j=1; j<=num[i]; j++)
                    {   f=f*j;
                    }
                fact[i]=f;
            }
        System.out.println("Los numeros capturados fueron:");
        for(i=0; i<=3; i++)
        System.out.println(+num[i]);
        System.out.println("Los factoriales de dichos numeros fueron:");
        for(i=0; i<=3; i++)
        System.out.println(+fact[i]);
        System.exit(0);
    }
}
