
public class Ejercicio33 
{   public static void main(String[] args)
    {   int x, band, im, i, pm, cx, ci, m;
        int num[]=new int[8];
        int imp[]=new int[8];
        int men[]=new int[1];
        Teclado t=new Teclado();
        i=0; pm=0; cx=0; ci=0; m=0;
        for(x=0; x<=7; x++ )
            {   do
                    {   try
                            {   System.out.println("Captura el numero en la posicion "+(x+1)+" :");
                                num[x]=t.leeInt();
                                band=0;
                                cx++;
                                
                            }
                        catch (NumberFormatException z)
                            {   System.out.println("Captura solo numeros enteros: ");
                                band=1;
                            }
                        if(num[x]==-99)
                            {   System.out.println("-99 CAPTURADO - FIN DE LA CAPTURA");
                                cx=cx-1;
                                x=7;
                            }
                    }
                while((band==1)||(num[x]==-99));
              
                        im=num[x]%2;
                        if(im!=0)
                            {   imp[i]=num[x];
                                i++;
                                ci++;
                            }
                        if(x==0)
                            {   men[m]=num[x];
                                pm=1;
                            }
                                if((num[x]<men[m])&&(x!=-99))
                                    {   men[m]=num[x];
                                        pm=x+1;
                                    }
                            
                                    
                            
            }

        System.out.println("Los numeros del vector fueron: ");
            for(x=0; x<cx; x++)
                System.out.println(+num[x]);
        System.out.println("La cantidad de numeros impares es: "+i);
            for(i=0; i<ci; i++)
                    System.out.println(+imp[i]);
        System.out.println("El numero menor se encuentra en la posición: "+pm);
            for(x=0; x<1; x++)
                System.out.println(+men[m]);
            
    }
    
}
