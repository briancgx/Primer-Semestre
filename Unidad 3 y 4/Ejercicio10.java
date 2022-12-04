public class Ejercicio10
{   public static void main(String[] agrs)
    {   int cont, num, m;
        cont=1; Teclado x=new Teclado(); m=0;
        while(cont<=4)
            {   System.out.println("Captura el numero "+cont+" : ");
                num=x.leeInt();
                if(cont==1)
                    m=num;
                else
                    {   if(num>m)
                            m=num;
                    }
                cont=cont+1;
            }
        System.out.println("El numero mayor es: "+m);
        System.exit(0);
    }
}