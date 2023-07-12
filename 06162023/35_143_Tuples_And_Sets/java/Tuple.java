public class Tuple<T> {
    private T[] elements;

    public Tuple(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public static <T> Tuple<T> arrayToTuple(T[] array) {
        return new Tuple<>(array);
    }
}