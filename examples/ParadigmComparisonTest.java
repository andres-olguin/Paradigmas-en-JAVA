import java.util.List;

/** Pruebas ejecutables con Java estándar, sin JUnit externo. */
public final class ParadigmComparisonTest {
    public static void main(String[] args) {
        var values = List.of(1, 2, 3, 4);
        if (ParadigmComparison.sumImperative(values) != 10) throw new AssertionError("Imperativo");
        if (ParadigmComparison.sumFunctional(values) != 10) throw new AssertionError("Funcional");
        if (ParadigmComparison.sumFunctional(List.of()) != 0) throw new AssertionError("Vacío");
        try {
            ParadigmComparison.sumImperative(List.of(Integer.MAX_VALUE, 1));
            throw new AssertionError("Debería detectar overflow");
        } catch (ArithmeticException expected) {
            // Validación correcta.
        }
        System.out.println("Pruebas correctas.");
    }
}
