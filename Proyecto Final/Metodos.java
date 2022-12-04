public class Metodos
{   public void matriz()
        {   int f, c, band, m2, m3;
            int num[][] = new int[4][4];
            int mat0[][] = new int[4][4];
            int matm1[][] = new int[4][4];
            int mat3[][] = new int[4][4];
            Teclado t = new Teclado();
            f=0; c=0;
            for(f=0; f<=3; f++)
            for(c=0; c<=3; c++)
                {   do
                        {   try
                                {   System.out.println(+f+" "+c+" .-Captura un numero entero positivo: ");
                                    num[f][c]=t.leeInt();
                                    band=0;
                                }
                            catch(NumberFormatException z)
                                {   System.out.println("CAPTURE UN ENTERO POSITIVO");
                                    band=1;
                                }
                            if(num[f][c]<0)
                                System.out.println("CAPTURA UN ENTERO POSITIVO");
                        }
                    while((band==1)&&(num[f][c]<0));
                    m2=num[f][c]%2;
                    if(m2==0)
                    mat0[f][c]=0;      
                    else
                        mat0[f][c]=num[f][c];
                    if((c==1)||(c==2))
                        matm1[f][c]=-1;
                    else
                        matm1[f][c]=num[f][c];
                    m3=num[f][c]%3;
                    if(m3==0)
                        mat3[f][c]=3;
                    else
                        mat3[f][c]=num[f][c];
                }
            System.out.println("La matriz original es: ");
            for(f=0; f<=3; f++)
                {   System.out.println();
                    for(c=0; c<=3; c++)
                        {   System.out.print(+num[f][c]+"   ");
                        }
                }

            System.out.println("\n\nLa matriz con los pares sustituidos es: ");
            for(f=0; f<=3; f++)
                {   System.out.println();
                    for(c=0; c<=3; c++)
                        {   System.out.print(+mat0[f][c]+"   ");
                        }
                }

            System.out.println("\n\nLa matriz con la columna 2 y 3 sustituidos es: ");
            for(f=0; f<=3; f++)
                {   System.out.println();
                    for(c=0; c<=3; c++)
                        {   System.out.print(+matm1[f][c]+"   ");
                        }
                }

            System.out.println("\n\nLa matriz con los multiplos de 3 sustituidos es: ");
            for(f=0; f<=3; f++)
                {   System.out.println();
                    for(c=0; c<=3; c++)
                        {   System.out.print(+mat3[f][c]+"   ");
                        }
                }
        }

    
    public void temperaturas()
        {   
            int x, y, i, band, tmp, j, tmm;
            double smay, pmay, smen, pmen;
            Teclado t=new Teclado();
            double max[] =new double[8];
            double mayp[] = new double[8];
            double min[] = new double[8];
            double menp[] = new double[8];
            x=0; smay=0; pmay=0; tmp=0; smen=0; pmen=0; tmm=0; y=0;
        
            for(i=0; i<=7; i++ )
                {   do  
                        {
                            try
                                {   System.out.println(+i+".- Captura temperaturas mayores a 0: ");
                                    max[i]=t.leeDouble();
                                    band=0;
                                }
                            catch(NumberFormatException z)
                                {   System.out.println("Captura solo numeros");
                                    band=1;
                                }
                            if(max[i]<=0)
                               System.out.println("Captura solo numeros positivos");
                                
                        }
                    while((band==1)||(max[i]<=0));
                    smay=smay+max[i];
                    if(i==7)
                        pmay=smay/8;
                
                }

            for(i=0; i<=7; i++)
                    {   if(max[i]>pmay)
                            {   mayp[x]=max[i];
                                x++;
                                tmp++;
                            }
                    }

            for(j=0; j<=7; j++ )
                {   do  
                        {
                            try
                                {   System.out.println(+j+".- Captura temperaturas menores a 0: ");
                                    min[j]=t.leeDouble();
                                    band=0;
                                }
                            catch(NumberFormatException z)
                                {   System.out.println("Captura solo numeros");
                                    band=1;
                                }
                            if(min[j]>0)
                            System.out.println("Captura solo numeros negativos");
                                
                        }
                    while((band==1)||(min[j]>=0));
                    smen=smen+min[j];
                    if(j==7)
                        pmen=smen/8;
                }



            for(j=0; j<=7; j++)
                {   if(min[j]<pmen)
                        {   menp[y]=-1;
                            y++;
                            tmm++;
                        }
                    else
                        {   menp[y]=min[j];
                            y++;
                            tmm++;
                        }
                }
                    
            System.out.println("Temperaturas mayores a 0:");
            for(i=0; i<=7; i++)
                System.out.println(+max[i]);
            System.out.println("Promedio de las temperaturas mayores: "+pmay);
            System.out.println("Temperaturas mayores a los promedios maximos: ");
                for(x=0; x<tmp; x++)
                System.out.println(+mayp[x]);
            System.out.println("Temperaturas menores a 0: ");
                for(j=0; j<=7; j++)
                System.out.println(+min[j]);
            System.out.println("Promedio de las temperaturas menores: "+pmen);
            System.out.println("Temperaturas con los valores sustituidos si son menores a la media: ");
                for(y=0; y<tmm; y++)
                System.out.println(+menp[y]);    
        }


    public void serie()
        {   double x,facN,potX,sum, m2, res; 
            int j, y;
            double div[]=new double[6];
            sum=1; facN=1; potX=0; y=0; 
            Teclado t=new Teclado();
            do 
                {	System.out.println("Capure el valor de X: ");
                    x=t.leeInt();
                }	
            while(x==0);
            
            for(j=1; j<=6; j++)
                {	if(j==1)
                        {   div[y]=1;
                            y++;
                            j++;
                        }
                    facN=facN*j;
                    potX=Math.pow(x, j);
                    res=potX/facN;
                    div[y]=res;
                    m2=j%2;
                    if(m2==0)
                        {sum=sum-div[y];
                        div[y]=div[y]*-1;}

                    if(m2!=0)
                    sum=sum+div[y];
                    if(y!=5)
                    y++;
            }
            System.out.println("La suma total de la operacion es: "+sum);
            System.out.println("Los valores de contiene la serie son: ");
            for(y=0; y<=5; y++)
            System.out.println("Posicion "+(y+1)+".-  "+div[y]);
        }
    }