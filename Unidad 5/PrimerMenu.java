public class PrimerMenu
{   public static void main(String[] args)
    {   int resp;
        Teclado t=new Teclado();
        Metodos x=new Metodos();
        do
            {  System.out.println(  "\nMenu Principal"+
                                    "\n1.-Agentes de Ventas"+
                                    "\n2.-Matriz de 3x3 Diagonal Principal"+
                                    "\n3.-Factorial"+
                                    "\n4.-Fin");
                System.out.print("\nSeleccione su opcion: ");
                    resp=t.leeInt();
                    switch(resp)
                    {   case 1: x.agentes();
                        break;
                        case 2: x.matrizD();
                        break;
                        case 3: x.serie(); 
                        break;
                        case 4: System.out.println("Fin del programa");
                        break;
                        default: System.out.println("**Selección errónea, intente de nuevo**\n");
                    }
            }
        while(resp!=4);
        System.exit(0);
    }
}