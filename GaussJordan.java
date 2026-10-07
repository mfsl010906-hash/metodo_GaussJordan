public class GaussJordan {

    /**
     * Método que aplica el algoritmo de Gauss-Jordan a una matriz aumentada.
     * Reutiliza la eliminación gaussiana previa para luego normalizar pivotes
     * y eliminar coeficientes superiores.
     *
     * @param matriz Matriz aumentada a resolver.
     */
    public static void resolverGaussJordan(double[][] matriz) {
        int n = matriz.length; // Número de filas ( e incógnitas)

        //reutilizacion del metodo eliminacion.Gausaliana
        Gauss.eliminacionGaussiana(matriz);

        // Normalización de pivotes y barrido superior (de la última fila a la primera)
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            // Normalizar la fila i dividiendo entre el elemento diagonal (pivote) para que sea 1.0
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // quitar los elementos que están por encima del pivote actual
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    /**
     * Método para extraer el vector solución directamente de la matriz reducida.
     * En Gauss-Jordan, la solución queda directamente en la última columna.
     *
     * @param matriz Matriz reducida a su forma identidad.
     * @return Arreglo unidimensional con el vector de soluciones.
     */
    public static double[] obtenerSolucionDirecta(double[][] matriz) {
        int n = matriz.length;
        double[] solucion = new double[n];

        for (int i = 0; i < n; i++) {
            solucion[i] = matriz[i][n];
        }

        return solucion;
    }
}
