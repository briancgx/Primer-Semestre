public class Ejercicio7
{   public static void main(String ars[])
    {   int a, b;
        Teclado t=new Teclado();
        System.out.println("Captura un numero: ");
        a=t.leeInt();
        System.out.println("Captura otro numero: ");
        b=t.leeInt();
        if(a>b)
            System.out.println("El numero mayor es: "+a);
        else
            {   if(b>a)
                    System.out.println("El numero mayor es: "+b);
                else
                    System.out.println("Los numeros son iguales");
            }
        System.exit(0);
    }
}
