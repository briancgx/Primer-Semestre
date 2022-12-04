public class Ejercicio27
{   public static void main(String[] args)
    {   int i, j, x;
        double inv, invi, inte;
        x=0; j=0;
        Teclado t=new Teclado();
        double ianual[]= new double[5];
        double interes[]=new double[5];
        System.out.println("Captura la cantidad de de dinero que desea invertir: ");
        inv=t.leeDouble();
        for(i=0; i<=4; i++)
            {   invi=inv;
                inv=inv*1.06f;
                ianual[x]=inv;
                x=x+1;
                inte=inv-invi;
                interes[j]=inte;
                j=j+1;
                if(i==2)
                    inv=inv+2500;
            }
        System.out.println("Inversión total que recibirá durante los años:");
        for(x=0; x<=4; x++)
        System.out.println(+ianual[x]);
        System.out.println("Interés recibido anualmente: ");
        for(j=0; j<=4; j++)
        System.out.println(+interes[j]);
        System.exit(0);
    }

}