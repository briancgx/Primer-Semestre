public class Ejercicio28
{   public static void main(String[] args)
    {   int i, s, x, p, n, cn, cp, band;
        Teclado t=new Teclado();
        int num[]=new int[10];
        int pos[]=new int[10];
        int neg[]=new int[10];
        s=0; x=0; p=0; n=0; cn=0; cp=0;
        for(i=0; i<=9; i++)
            {   do  
                    {   try
                            {   System.out.println(+i+".- Captura un numero entero difenrente a 0: ");
                                num[x]=t.leeInt();
                                band=0;
                            }
                        catch(NumberFormatException z)
                            {   System.out.println("Numero entero diferente a 0");
                                band=1;
                            }
                        if(num[x]==0)
                            System.out.println("CAPTURA UN NUMERO DIFERENTE A O POR DIOSSSS");
                    }
                while((band==1)||(num[x]==0));
                s=s+num[x];
                if(num[x]<0)
                    {   neg[n]=num[x];
                        n++;
                        cn++;
                        x++;
                    }
                else
                    {   pos[p]=num[x];
                        p++;
                        cp++;
                        x++;
                    }
            }
        System.out.println("Listado de todos los numeros capturados: ");
        for(x=0; x<=9; x++)
            System.out.println(+num[x]);
        System.out.println("Los numeros positivos son: ");
        for(p=0; p<cp; p++)
            System.out.println(+pos[p]);
        System.out.println("Los numeros negativos fueron: ");
        for(n=0; n<cn; n++)
            System.out.println(+neg[n]);
        System.out.println("La suma total de todos los numeros es: "+s);
        System.exit(0);
    }
    
}
