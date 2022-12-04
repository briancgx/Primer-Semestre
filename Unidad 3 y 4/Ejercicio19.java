public class Ejercicio19
{   public static void main(String[] args)
    {   int i, m3, sm5, pm10;
        float num;
        m3=0;   sm5=0;  pm10=1;
        for(i=5;i<=30;i+=5)
               {    num=i%3;
                    if(num==0)
                        m3++;
                        num=i%5;
                    if(num==0)
                        sm5=sm5+i;
                        num=i%10;
                    if(num==0)
                        pm10=pm10*i;
               }
        System.out.println("Cantidad de multiplos de 3:  "+m3);
        System.out.println("Resultado de la suma de los multiplos de 5:  "+sm5);
        System.out.println("Resultado de el producto de los multiplos de 10: "+pm10);
    }
}