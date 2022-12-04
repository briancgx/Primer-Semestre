public class Serie
{   public static void main(String[] args)
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
        System.exit(0);
    }
}