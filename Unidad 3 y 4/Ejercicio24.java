public class Ejercicio24
{   public static void main(String[] args)
        {   int i;
            double s;
            double num[]=new double[5];
            Teclado t=new Teclado();
            s=0;
            for(i=0; i<=4;i++)
                {   System.out.println(+i+".- Captura un numero: ");
                    num[i]= t.leeDouble();
                    s=s+num[i];
                }
            System.out.println("La suma total fue: "+s);
            System.out.println("La lista de los numeros capturados son: ");
            for(i=0;i<=4;i++)
                System.out.println(+num[i]);
            System.exit(0);
        }

}
