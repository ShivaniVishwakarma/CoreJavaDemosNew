package src.Java_1_8_features;

interface Super {
    /**
     * An abstract method. By default it is public and abstract.
     */
    void print();

    /**
     * Default method, introduced in Java 8.
     */
    public default void doStuff() {
        System.out.println("Hello world");
    }

    /**
     * Static method in interface, introduced in Java 8.
     */
    public static void sayHello() {
        System.out.println("Hello");
    }
}
