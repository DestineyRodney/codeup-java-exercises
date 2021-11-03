public class MethodsLec {
//    static -- the presence of this keyword defines that the method belongs to the class, as opposed to instances of it.
//If a method does not return anything, the special keyword void is used here.

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

//    Method Overloading:
//    Multiple methods with the same name, but with different
//    Parameter type OR Parameter order OR Parameter count
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }

    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }
    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
        System.out.println(s);
    }

//    Recursion
//    Concept that aims to solve a problem by dividing it into smaller chunks.
//    The idea is that a method can call itself, but with parameters that represent a smaller instance of the problem.
//    You need to specify a stop condition to end the recursion.

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    //    Main where methods are called
public static void main(String[] args){
    sayHello();
    sayHello(2);
    sayHello("Codeup");
    sayHello("Greetings", "Codeup");

//    Passing Parameters To Methods

    String changeMe = "hello codeup!";
    changeString(changeMe);
    System.out.println(changeMe); //why are we printing out changeMe?

    count(5);

}
}
