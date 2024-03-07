package helpers;

public class Polimorfism {
    public static void main(String[] args) {
        /* En Java, se permite asignar una instancia
        de una subclase a una referencia de una superclase,
         lo que se conoce como el principio de sustitución de Liskov. */

        A b = new B();
        b.m(); // B


    }

    static class A {
        void m() {
            System.out.println("I'm A");
            // de que clase soy?
            System.out.println(this.getClass().getName());
        }
    }

    static class B extends A {
        void m() {
            System.out.println("I'm B");
            // de que clase soy?
            System.out.println(this.getClass().getName());
        }
    }
}
