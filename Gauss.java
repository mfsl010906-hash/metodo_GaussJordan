public class Gauss {

    /**
     * metodo que realiza el triangulo de la matriz usando eliminacion Gaussiana simple.
     */
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length; // obtiene el tamaño del sistema (numero de filas)

        //ciclo I (i): selecciona el renglon private actual(la diagonal principal)
        for (int i = 0; i < n; i++) {

            //ciclo 2 (j): recorrre todods los renglones que esran abajo del private actual
            for (int j = i + 1; j < n; j++) {

                // calcula el factor de proporcion para anular el coeficiente de esta columna
                double factor = matriz[j][i] / matriz[i][i];

                //ciclo 3 (k):recorre columna por columna la fila completa
                //para aplcar la operacion matematica: R_j = R_j - (factor * R_i)
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }

        }
    }

    /**
     * metodo que realiza la sustitucion regresiva (la bajada) para despejar las variables.
     *
     * @param matriz ya convertida en triangular superior .
     * @return un arreglo unidimensional con los valores de las soluciones (x1, x2, x3...).
     */
    public static double[] sustiticionRegresiva(double[][] matriz) {
        int n = matriz.length;
        double[] x = new double[n]; //arreglo para almacenar las respuestas

        //recorre los renglones de abajo hacia arriba (del ultimo al primero)
        for (int i = n - 1; i >= 0; i--) {
            double suma = 0.0;

            //suma los valores de las incognitas que ya conocemos en este reglon
            for (int j = i + 1; j < n; j++) {
                suma += matriz[i][j] * x[j];
            }

            //despeja la incognita actual: (lado derecho - suma acumulada) / coeficiente del privote
            x[i] = (matriz[i][n] - suma) / matriz[i][i];
        }

        return x;
    }
}




