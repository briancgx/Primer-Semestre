public class Matriz 
{   public static void main(String[] args)
        {   int x, y, band, m5;
            int num[][]=new int[3][3];
            Teclado t=new Teclado();
            for(x=0; x<=2; x++)
            for(y=0; y<=2; y++)
            {   do
                    {   try
                            {   System.out.println("Captura el numero "+x+" "+y+" : ");
                                num[x][y]=t.leeInt();
                                band=0;
                            }
                        catch(NumberFormatException z)
                            {   System.out.println("Por favor numeros enteros multiplos de 5: ");
                                band=1;
                            }
                        m5=num[y][x]%5;
                        if(m5!=0)
                            {   System.out.println("Captura solo numeros multiplos de 5");
                            }
                        if(num[x][y]<0)
                            {   System.out.println("NUMEROS POSITIVOSSS");

                            }
                    }
                while((m5!=0)||(band==1)||(num[x][y]<0));
            }
            System.out.println("Los datos capturados en la matriz fueron:");
            for(x=0; x<=2; x++)
                {   System.out.println();
                    for(y=0; y<=2; y++)
                        {   System.out.print(+num[x][y]+"   ");
                        }
                }
            System.exit(0);

        }
    
}
