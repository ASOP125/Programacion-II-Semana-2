public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hola a todos");
        System.out.println("Contenido de la caja: " + stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Contenido de la caja: " + integerBox.getContent());
    }
}