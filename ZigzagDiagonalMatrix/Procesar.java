public class Procesar {
        public void procesar(String cad, int n, String matriz[][]){
            int i, j;

            for (i=0; i<n; i++) {
                for (j=0; j<n; j++) {
                    if(Integer.parseInt(matriz[i][j])<10){
                    matriz[i][j]='0'+matriz[i][j];
                    }
                    cad+=matriz[i][j]+"  ";
                }
                cad+="\n";
            }

            Imprimir proceso = new Imprimir();
            proceso.imprimir(cad);
        }
    }
