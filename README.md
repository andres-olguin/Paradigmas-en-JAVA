# Paradigmas de Programación en Java

Este repositorio contiene ejercicios y ejemplos prácticos sobre los diferentes paradigmas de programación implementados en Java, desarrollados para profundizar en la lógica y estructura del lenguaje.

## Contenidos
* **Programación Orientada a Objetos (POO):** Uso de clases, herencia, polimorfismo y encapsulamiento.
* **Programación Funcional:** Implementación de Lambdas y Streams (Java 8+).
* **Estructuras de Datos:** Manejo de colecciones y lógica algorítmica.

## Cómo ejecutarlo
1. Asegúrate de tener instalado el JDK (Java Development Kit).
2. Clona el repositorio.
3. Compila y ejecuta el archivo principal:
   ```bash
   javac main.java
   java main


## Ejemplo independiente y verificable (propuesta)

El `main.java` histórico importa componentes Pokemon que pueden no estar presentes en este repositorio; no debe presentarse como autocontenido. La carpeta `examples/` añade una comparación independiente de suma imperativa y funcional en Java 21.

```bash
javac examples/ParadigmComparison.java examples/ParadigmComparisonTest.java
java -cp examples ParadigmComparisonTest
java -cp examples ParadigmComparison
```

Se preserva el código original y se documenta la procedencia y límites en `docs/ENGINEERING_ROADMAP_2026-11-04.md`.
