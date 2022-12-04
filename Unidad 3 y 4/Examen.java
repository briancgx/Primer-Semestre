public class Examen
{   public static void main(String[] args)
    {   int f, c, st, x, ma, n, nn, me, i, in,  band;
        Teclado t=new Teclado();
        int num[][]=new int[4][4];
        int neg[]=new int[16];
        int ii[]=new int[12];
    
        st=0;  ma=0; n=0; nn=0; me=0; i=0; in=0;
        for(f=0; f<=3; f++)
        for(c=0; c<=3; c++)
            {   do
                    {   try
                            {   System.out.println("Captura un numero par: "+f+" "+c);
                                num[f][c]=t.leeInt();
                                band=0;    
                            }
                        catch (NumberFormatException z)
                            {   System.out.println("Captura solo numeros enteros");
                                band=1;
                            }
                        x=num[f][c]%2;
                        if(x!=0)
                            {   System.out.println("Captura solo numeros pares");
                            }
                    }
                while((band==1)||(x!=0));
                st=st+num[f][c]; 
                if(num[f][c]<0) 
                    {   neg[n]=num[f][c];
                        n++;
                        nn=nn+1;
                    }
                if(c==1) 
                    {   if(f==0)
                           ma=num[f][c];
                        else
                            {   if(num[f][c]>ma)
                                    ma=num[f][c];
                            }
                    }
                if(f==3)
                    {   if(c==0)
                            me=num[f][c];
                        else
                            {   if(num[f][c]<me)
                                me=num[f][c];
                            }
                    }
                if((f==1)||(f==3)||(c==1)||(c==3)) 
                    {   ii[i]=num[f][c];
                        i++;
                        in=in+1;
                    }
                    
        }
        
        System.out.println("Suma de todos los elementos de la matriz: "+st);
        System.out.println("Listado de los elementos de negativos");
        for(n=0; n<nn; n++)
            System.out.println(+neg[n]);
        System.out.println("Listado de los numeros con indice impar: ");
        for(i=0; i<in; i++)
            System.out.println(+ii[i]);
        System.out.println("Numero mayor en la segunda columna: "+ma);
        System.out.println("Numero menor en la cuarta fila: "+me);
        System.out.println("La matriz que se capturo es: ");
        for(f=0; f<=3; f++)
            {   System.out.println();
                for(c=0; c<=3; c++)
                    {   System.out.print(+num[f][c]+"     ");
                    }
            }
        System.exit(0);
    }
}