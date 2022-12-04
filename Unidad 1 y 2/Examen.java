import javax.swing.*;
public class Examen
{   public static void main(String args[])
    {   String ca, ce, vn;
        int va, cn, tv, tc4, tc3, tct, enf, lim, sne, CA,CE, VN;
        vn=JOptionPane.showInputDialog("Capture el total de nuevos viejitos que ingresaron al asilo: ");
        ca=JOptionPane.showInputDialog("Total de cuartos con los que cuenta actualmente el asilo: ");
        ce=JOptionPane.showInputDialog("Cuartos adicionales que se quieren construir para futura necesidad");
        VN=Integer.parseInt(vn);
        CA=Integer.parseInt(ca);
        CE=Integer.parseInt(ce);
        cn=VN/3;
        va=CA*3;
        tv=VN+va;
        tc4=tv/4;
        tc3=(((tv)-(tc4*4))/3);
        tct=(tv/3)+CE;
        enf=(cn*2);
        lim=(cn/2);
        sne=(600*15)*enf;
        JOptionPane.showMessageDialog(null,"Cantidad de cuartos que hospedan a 4 viejitos: "+Math.floor(tc4)+"\n"+
                                                            "Cantidad de cuartos que hospedan a 3 viejitos: "+Math.ceil(tc3)+"\n"+
                                                            "Cantidad de cuartos a construir para tener a 3 viejitos por cuarto, también incluyendo los de futura necesidad: "+tct+" cuartos totales"+"\n"+
                                                            "Enfermeros a contratar: "+enf+" nuevos enfermeros"+"\n"+
                                                            "Personal de limpieza a contratar: "+lim+" nuevas personas"+"\n"+
                                                            "Gastos que ascenderan por contratacion del nuevo personal: "+sne+" Semanales");
        System.exit(0);
    }

}