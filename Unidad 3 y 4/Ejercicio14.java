public class Ejercicio14 
{   public static void main(String[] args)
    {   int zan, cal, cha, lec, cre, yog, fab, jab, fabu,
            pzan, pcal, pcha, plec, pcre, pyog, pfab, pjab, pfabu,
            tzan, tcal, tcha, tlec, tcre, tyog, tfab, tjab, tfabu;
        double tp;
        Teclado x=new Teclado();
        System.out.println("Ingrese la cantidad de Zanahorias adquiridas: ");
        zan=x.leeInt();
        System.out.println("Ingrese el precio de la Zanahoria: ");
        pzan=x.leeInt();
        tzan=zan*pzan;
        System.out.println("Ingrese la cantidad de Calabazas adquiridas: ");
        cal=x.leeInt();
        System.out.println("Ingrese el precio de la Calabaza: ");
        pcal=x.leeInt();
        tcal=cal*pcal;
        System.out.println("Ingrese la cantidad de Chayotes adquiridos: ");
        cha=x.leeInt();
        System.out.println("Ingrese el precio del Chayote: ");
        pcha=x.leeInt();
        tcha=cha*pcha;
        System.out.println("Ingrese la cantidad de Leche adquirida: ");
        lec=x.leeInt();
        System.out.println("Ingrese el precio de la Leche: ");
        plec=x.leeInt();
        tlec=lec*plec;
        System.out.println("Ingrese la cantidad de Crema adquirida: ");
        cre=x.leeInt();
        System.out.println("Ingrese el precio de la Crema: ");
        pcre=x.leeInt();
        tcre=cre*pcre;
        System.out.println("Ingrese la cantidad de Yogurth adquirido: ");
        yog=x.leeInt();
        System.out.println("Ingrese el precio del Yogurth: ");
        pyog=x.leeInt();
        tyog=yog*pyog;
        System.out.println("Ingrese la cantidad de Fab adquirido: ");
        fab=x.leeInt();
        System.out.println("Ingrese el precio del Fab: ");
        pfab=x.leeInt();
        tfab=fab*pfab;
        System.out.println("Ingrese la cantidad de Jabon Liquido adquirido: ");
        jab=x.leeInt();
        System.out.println("Ingrese el precio del Jabon Liquido: ");
        pjab=x.leeInt();
        tjab=jab*pjab;
        System.out.println("Ingrese la cantidad de Fabuloso adquirido: ");
        fabu=x.leeInt();
        System.out.println("Ingrese el precio del Fabuloso: ");
        pfabu=x.leeInt();
        tfabu=fabu*pfabu;
        tp=tzan+tcal+tcha+tlec+tcre+tyog+tfab+tjab+tfabu;
        if(tp<1999)
                System.out.println("Su compra no tiene descuento, por lo tanto su pago es de: "+Math.round(tp));
            else
                {   if((tp>=2000)&&(tp<=3000))
                        {   tp=tp*(0.95f);
                            System.out.println("Su compra tiene un descuento del 5%, por lo tanto su pao es de: "+Math.round(tp));
                        }
                    else
                        {   if((tp>=3001)&&(tp<=5000))
                                {   tp=tp*(0.93f);
                                    System.out.println("Su compra tiene un descuento del 7%, por lo tanto su pago es de: "+Math.round(tp));
                                }
                            else
                                {   if(tp>=5000)
                                        tp=tp*(0.90f);
                                        System.out.println("Su compra tiene un descuento del 10%, por lo tanto su pago es de: "+Math.round(tp));
                                }
                        }
                }
    }
    
}
