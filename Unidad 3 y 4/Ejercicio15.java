public class Ejercicio15 
{   public static void main(String[] args)
    {   int cont, ci, contm4, me, m4, m, num;
        double x;
        cont=1; ci=0;   contm4=0;   me=0;   m4=0;   Teclado t=new Teclado();
        while(cont<=4)
            {   do
                    {   System.out.println("Captura el numero "+cont+" : ");
                        num=t.leeInt();
                        x=Math.floor(num);
                    }
                while((num<0)||(x!=num));
                m=num%2;
                if(m!=0)
                    ci=ci+1;
                if(cont==1)
                    me=num;
                else
                    {   if(num<me)
                            me=num;
                    }
                m4=num%4;
                if(m4==0)
                    contm4=contm4+1;
                    cont=cont+1;
            }
        System.out.println("El numero menor es: "+me+"\n"+
                            "Los numeros impares fueron: "+ci+"\n"+
                            "Los numeros multiplos de 4 fueron: "+contm4);
        System.exit(0);
    }
}
