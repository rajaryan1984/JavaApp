
public class Hello
{

    private final String message = "Hello Java and Jenkins!";

    public Hello() {}

    public static void main(String[] args) {
        System.out.println(new Hello().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
