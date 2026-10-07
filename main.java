public class main {
    public static void main(String[] args) {
        double[][] matriz = defmatrizz.defmatriz();

        GaussJordan.resolverGaussJordan(matriz);
        double[] solucion = GaussJordan.obtenerSolucionDirecta(matriz);

        System.out.println("Solución del sistema de ecuaciones(metodo de Gauss_Jordan):");
        for (int i = 0; i < solucion.length; i++) {
            System.out.printf("x[%d] = %.4f%n", i, solucion[i]);
        }
    }
}