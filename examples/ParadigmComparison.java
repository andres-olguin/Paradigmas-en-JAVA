import java.util.List;
import java.util.Objects;

/** Comparación autocontenida entre enfoque imperativo y funcional. */
public final class ParadigmComparison {
    private ParadigmComparison() { }

    public static int sumImperative(List<Integer> values) {
        Objects.requireNonNull(values, "values");
        int total = 0;
        for (int value : values) total = Math.addExact(total, value);
        return total;
    }

    public static int sumFunctional(List<Integer> values) {
        Objects.requireNonNull(values, "values");
        return values.stream().mapToInt(Integer::intValue).reduce(0, Math::addExact);
    }

    public static void main(String[] args) {
        var values = List.of(3, 5, 8);
        System.out.println("Imperativo: " + sumImperative(values));
        System.out.println("Funcional: " + sumFunctional(values));
    }
}
