**Objective**
In this challenge, we're going to use loops to help us do some simple math.

**Task**
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

**Input Format**

A single integer, .

**Constraints**

**Output Format**

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.

**Sample Input**

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

**Additional information**
En Java, puedes leer la entrada del usuario de dos maneras principales: utilizando `System.in` directamente o utilizando un objeto `BufferedReader` para envolver `System.in`. Aquí hay una explicación de cada uno y cuándo es apropiado usarlos:

1. **System.in**:
    - `System.in` es un objeto de flujo de entrada estándar que representa la entrada estándar del sistema, generalmente el teclado.
    - Puedes usar `System.in` directamente con métodos como `System.in.read()`, que lee un byte de datos del flujo de entrada.
    - Sin embargo, `System.in` es bastante primitivo y no proporciona métodos convenientes para leer líneas o convertir datos en tipos de datos útiles como `int` o `String`.
    - Es útil cuando necesitas leer bytes de entrada de forma muy básica y no necesitas funcionalidades adicionales de procesamiento de entrada.
    - Ejemplo:
      ```java
      int byteLeido = System.in.read();
      ```

2. **BufferedReader**:
    - `BufferedReader` es una clase de Java que proporciona un búfer de tamaño fijo para leer caracteres de un flujo de entrada de caracteres, como `System.in`.
    - Envuelve `System.in` para proporcionar métodos más convenientes para leer líneas enteras de entrada (`readLine()`) o para leer datos primitivos como `int`, `double`, etc., utilizando métodos de parseo.
    - `BufferedReader` es más eficiente en términos de rendimiento al leer grandes cantidades de datos ya que lee los datos en bloques en lugar de leer byte por byte como `System.in`.
    - Es útil cuando necesitas leer líneas completas de entrada o cuando necesitas convertir la entrada en tipos de datos más útiles.
    - Ejemplo:
      ```java
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String linea = bufferedReader.readLine();
      int numero = Integer.parseInt(linea);
      ```

En resumen, puedes usar `System.in` cuando necesitas leer datos de entrada básicos a nivel de byte. Sin embargo, para una lectura más conveniente y eficiente de líneas completas o para convertir la entrada en tipos de datos útiles, es preferible utilizar `BufferedReader`.


