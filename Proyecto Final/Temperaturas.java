public class Temperaturas
{   public static void main(String[] args)
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
}