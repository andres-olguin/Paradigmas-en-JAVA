# Java Paradigms Lab
### Laboratorio académico de programación orientada a objetos y funcional

Repositorio de ejemplos y ejercicios Java para explorar estructuras de clases, colecciones y diferentes estilos de programación. Conserva un ejercicio original con referencias a clases del entorno universitario y ofrece **un ejemplo independiente y comprobable**.

> **Estado:** laboratorio didáctico, no biblioteca de producción. El archivo histórico `main.java` depende de `cl.unab.ptec102.ejemplopokemon.core` y no es autocontenido dentro de este repositorio.

## Qué puedes ejecutar hoy

El ejemplo `examples/ParadigmComparison.java` compara el cálculo de una suma mediante un ciclo imperativo y mediante `Stream`. Se acompaña de un ejecutable de pruebas sin dependencias externas.

**Requisitos:** JDK 21 o superior.

```bash
javac examples/ParadigmComparison.java examples/ParadigmComparisonTest.java
java -cp examples ParadigmComparisonTest
java -cp examples ParadigmComparison
```

En Windows PowerShell se utilizan los mismos comandos; se requiere `javac` disponible en `PATH`. El primer `java` valida ejemplos y casos límite; el segundo imprime resultados del ejemplo.

## Estructura

| Ruta | Contenido |
|---|---|
| [`main.java`](main.java) | Ejercicio histórico del entorno universitario; depende de clases externas |
| [`examples/ParadigmComparison.java`](examples/ParadigmComparison.java) | Implementaciones imperativa y funcional autocontenidas |
| [`examples/ParadigmComparisonTest.java`](examples/ParadigmComparisonTest.java) | Comprobaciones de sumas, colecciones vacías y overflow |
| [`.github/workflows/examples.yml`](.github/workflows/examples.yml) | Compilación y pruebas automáticas |
| [`docs/`](docs/) | Evaluación, restricciones y propuestas de evolución |

## Conceptos que ilustra

- **Imperativo:** estado mutable y flujo de control explícito.
- **Funcional:** uso de streams y operaciones sobre secuencias.
- **Comprobación de errores:** `Math.addExact` para detectar overflow en sumas.
- **Organización de pruebas:** separación entre programa de demostración y casos ejecutables.

Estos ejemplos **no abarcan todos los paradigmas de programación**, ni sustituyen un curso o una referencia de Java.

## Limitaciones y mejoras propuestas

1. Resolver documentalmente las dependencias del ejercicio original sin copiar clases de terceros sin licencia.
2. Organizar nuevos módulos de POO, interfaces, composición, lambdas, streams y manejo de errores.
3. Evaluar una estructura Maven/Gradle cuando aumente el número de ejemplos; el módulo actual funciona con JDK estándar.
4. Incorporar pruebas educativas adicionales y una guía comparativa con salidas verificadas.
5. Documentar autoría y licencias específicas de cada material externo.

Ver el [roadmap técnico](docs/ENGINEERING_ROADMAP_2026-11-04.md) y la [evaluación de arquitectura](docs/ARCHITECTURE_SCALABILITY_2026-11-04.md).

**Uso:** estudio y práctica; no se ha validado una licencia que autorice redistribuir las dependencias del ejercicio externo.
