public class Ejercicio16
{  public static void main(String[] args)
    {   int cont, c, f, num, band;
        Teclado x=new Teclado();
        cont=1; num=0;  band=0;
        while(cont<=5)
            {   do 
                    {   try {   System.out.println("Captura el numero "+cont+" :");
                                num=x.leeInt();
                                band=0;
                            }
                        catch(NumberFormatException z)
                            {   System.out.println("Captura solo numeros enteros");
                                band=1;
                            }
                    }
                while((num<0)||(band==1));
                c=1;    f=1;
                while(c<=num)
                    {   f=f*c;
                        c=c+1;
                    }
                System.out.println("El numero "+num+" tiene como factorial: "+f);
                cont=cont+1;
            }
        System.exit(0);
    } 

}