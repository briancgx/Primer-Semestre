public class SegundoMenu
{   public static void main(String[] args)
    {   int resp;
        Teclado t=new Teclado();
        Matriz m=new Matriz();
        Agentes a=new Agentes();
        Serie s= new Serie();
        do
            {   System.out.println( "Menu Principal"+
                                    "\n1.-Agentes de Ventas"+
                                    "\n2.-Matriz de 3x3 Diagonal Principal"+
                                    "\n3.-Factorial"+
                                    "\n4.-Fin");
                System.out.print("\nSeleccione su opcion: ");
                resp=t.leeInt();
                switch(resp)
                    {   case 1: a.ventas();
                        break;
                        case 2: m.matrizD(); 
                        break;
                        case 3: s.sFact(); 
                        break;
                        case 4: System.out.println("Fin del programa");
                        break;
                        default: System.out.println("**Selección errónea, intente de nuevo**");
                    }
            }
        while(resp!=4);
        System.exit(0);
    }
}