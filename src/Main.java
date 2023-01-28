public class Main {
    public static void main(String[] args) {
        method("peaceful");
    }

    static void method() {
        System.out.println("println");
    }

    static void method(String name) {
        System.out.println(name);
    }

    static String method1() {
        return "peaceful";
    }
}