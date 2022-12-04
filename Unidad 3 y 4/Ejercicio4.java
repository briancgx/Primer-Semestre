public class Ejercicio4
{   public static void main(String[] args)
    {   int va1, va2, cvendidas, ventasa1, ventasa2;
        float  ingresos;
        String agente1, agente2;
        Teclado x=new Teclado();
        System.out.print("Ingrese el nombre del primer agente: ");
        agente1=x.leeString();
        System.out.print("Ingrese el nombre del segundo agente: ");
        agente2=x.leeString();
        System.out.print("Cuantas computadoras vendió "+agente1+"?");
        va1=x.leeInt();
        System.out.print("Cuantas computadoras vendió "+agente2+"?");
        va2=x.leeInt();
        cvendidas=va1+va2;
        ventasa1=va1*12500;
        ventasa2=va2*12500;
        ingresos=(cvendidas*12500)*(0.80f);
        System.out.println("Computadoras veniddas totales: "+cvendidas+"\n"+
                            "Total de ventas de "+agente1+" es de: "+ventasa1+"\n"+
                            "Total de ventas de "+agente2+" es de: "+ventasa2+"\n"+
                            "Ingresos totales descontando las comisiones de los vendedores: "+ingresos);
        System.exit(0);
    }

}