# metodo de Gauss_Jordan
---
**datos generales**

**Asignatura:** 
Métodos Numéricos
**Docente:** 
Víctor Hugo Vásquez Herrera
**Institución:** 
Instituto Tecnológico Superior de Xalapa 
**Carrera:** 
Ingeniería en Sistemas Computacionales
**Alumna:** 
María Fátima Sánchez Landa (No. de Control: 25702876) (3º"B")

---

**Descripcion del proyecto**
Este repositorio contiene la implementación en Java del método numérico de Gauss-Jordan para la resolución de sistemas de ecuaciones lineales simultáneas.
A partir de la triangulación superior encontrada en el metdo Gauss.eliminacionGausaliana, en este programa se normalizan los elementos de la diagonal principal, que son los pivotes, para convertirlos en (1).
se anulan los coeficientes por encima de la diagonal principal.
y la matriz aumentada se transforma en una matriz identidad, lo cual permite la lectura directa del vector de soluciones sin requerir una fase de sustitución regresiva.

---

**estructura modular**

**Gauss.java**
es la clase que contiene el metodo eliminación gaussiana, encargada de transformar la matriz inicial en su forma triangular superior.

**GaussJordan.java**
clase principal del algoritmo que llama al método de la clase Gauss, normaliza la diagonal principal y realiza la eliminación de coeficientes superiores.

**dermatrizz.java**
Clase que se encarga de definir y retornar las matrices aumentadas empleadas para las corridas de pruba.

**main.java**
Clase donde se ejecuta, se coordina la llamada a los métodos, procesa los datos y muestra los resultados en consola.

**compilacion y ejecucion**
"C:\Users\Maria Fatima\Documents\protectos interllidea\Gauss\out\production\Ecuaciones_lineales" main

---

**ejemplo de prueba**
prueba 1
matriz
 {3.0, -0.1, -0.2,7.85 },
 {0.1, 7.0, -0.3, -19.3 },
 {0.3, -0.2, 10.0, 71.4 },

---

 **salida de consola**
Solución del sistema de ecuaciones(metodo de Gauss_Jordan):
x[0] = 3.0000
x[1] = -2.5000
x[2] = 7.0000

---

**conclusiones**
Reutilizar el programa anterior (Gauss) permitió resolver el problema de forma más rápida 
y sin tener que programar todo desde cero, se redujo la cantidad de operaciones a relizar y los valores finales se pueden leer de manera directa.   
