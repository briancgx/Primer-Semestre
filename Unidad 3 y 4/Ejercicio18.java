public class Ejercicio18
{   public static void main(String[] args)
    {   int i;
        double ct, cant;    
        Teclado t=new Teclado();
        ct=5000;
        for(i=1;i<=5;i++)
            {   ct=ct*1.06;
                if(i==3)
                    {   System.out.println("Cual es la nueva inversión?");
                        cant=t.leeDouble();
                        ct=ct+cant;
                    }
            }
        System.out.println("La inversion total que recibirá esta persona es "+ct);
        System.exit(0);
    }
}