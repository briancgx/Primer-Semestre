public class Ejercicio8 
{   public static void main(String[] args)
    {   int num, s, cont;
        Teclado x=new Teclado();
        cont=1; s=0;
        while(cont<=3)
            {   System.out.println("Captura un numero: ");
                num=x.leeInt();
                s=s+num;
                cont=cont+1;
            } 
        System.out.println("La suma fue: "+s);
        System.exit(0);
    }
}   