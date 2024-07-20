import javax.swing.*;

public class Leer {
    public void leer() {
        int n, j=0, holis=1;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión de la matriz: "));
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "La dimensión tiene que ser mayor a 1");
            }
        } while (n <= 0);
        
        String cad = "S A L I D A" + "\nDimensión: " + n + "*" + n + "\nMatriz Diagonal: " + "\n";

        String[][] omnitrix=new String[n][n];
        int i=n-1;

        omnitrix[i][j]=String.valueOf(holis);
        j++;
        holis++;

        while(holis<n*n){
            while(j>0 && i>0){
                omnitrix[i][j]=String.valueOf(holis);
                j--;
                i--;
                holis++;
            }
            if(j==0 && i!=0){
                omnitrix[i][j]=String.valueOf(holis);
                i--;
                holis++;
            }
            else if(i==0){
                omnitrix[i][j]=String.valueOf(holis);
                j++;
                holis++;
            }


            while(i<(n-1) && j<(n-1)){
                omnitrix[i][j]=String.valueOf(holis);
                j++;
                i++;
                holis++;
            }
            if(i==(n-1) && j!=(n-1)){
                omnitrix[i][j]=String.valueOf(holis);
                j++;
                holis++;
            }
            else if (j==(n-1)){
                omnitrix[i][j]=String.valueOf(holis);
                i--;
                holis++;
            }
        }

        Procesar leere = new Procesar();
        leere.procesar(cad, n, omnitrix);
    }
}