
package condicionales;

import javax.swing.JOptionPane;


public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Dia;

        Dia = Integer.parseInt(JOptionPane.showInputDialog("digite un numero del mes"));
        switch(Dia){
            case 1: JOptionPane.showMessageDialog(null,"El dia del mes es Enero");
            break;

            case 2: JOptionPane.showMessageDialog(null,"El dia del mes es febrero");
            break;

            case 3: JOptionPane.showMessageDialog(null,"El dia del mes es Marzo");
            break;

            case 4: JOptionPane.showMessageDialog(null,"El dia del mes es Abril");
            break;

            case 5: JOptionPane.showMessageDialog(null,"El dia del mes es Mayo");
            break;

            case 6: JOptionPane.showMessageDialog(null,"El dia del mes es  Junio");
            break;

            case 7: JOptionPane.showMessageDialog(null,"El dia del mes es Julio");
            break;

            case 8: JOptionPane.showMessageDialog(null,"El dia del mes es Agosto");
            break;

            case 9: JOptionPane.showMessageDialog(null,"El dia del mes es Septiembre");
            break;

            case 10: JOptionPane.showMessageDialog(null,"El dia del mes es Octubre");
            break;

            case 11: JOptionPane.showMessageDialog(null,"El dia del mes es Noviembre");
            break;

            case 12: JOptionPane.showMessageDialog(null,"El dia del mes es Diciembre");
            break;



        }
    }
    
}
