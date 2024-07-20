import javax.swing.*;

public class main {
    public static void main(String args[]){
        int repito=0, repito2;
        Object[] vector= {"Semestral", "Salir"};
        String birth= "   M E N Ú\r\n" +
                      "1. Matrix\r\n" +
                      "2. Salir\r\n" +
                      "Ingrese su opción (1-3): ";


        do{
            Object ele = JOptionPane.showInputDialog(null, birth, "Menú",
            JOptionPane.INFORMATION_MESSAGE, null, vector, vector[0]);

            if(ele==vector[0]){
                do{
                Leer main;
                main = new Leer();
                main.leer();
                repito2 = JOptionPane.showConfirmDialog(null, "¿Desea ingresar una nueva dimensión?", "REPITO", 0);
                }while(repito2==0);
            }
            else if(ele==vector[1]){
                System.exit(0);
            }
            repito = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?", "REPITO", 0);
        }while(repito==0);
    }
}
