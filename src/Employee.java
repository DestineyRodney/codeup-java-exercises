public class Employee extends Person {
    public Employee(String employeeName) {
        super(employeeName); //calling constructor method from Person - Person(employeeName
    }

    public int getAge(){
        return this.age; //private wont work but protected will
    }
//Overwritten sayHello from super class to what employee greets as
    public void sayHello(){
        System.out.println("Welcome to MegaCorp - how may I help you? My name is " + this.getName());
    }

    public void doWork(){ //called below
        System.out.println("Work, work ...");
    }
    public static void main(String[] args) {

        Person unemployedDes = new Person("Dessy");
        System.out.println(unemployedDes.getName());

        unemployedDes.sayHello();
        System.out.println();

        Employee des = new Employee("Des");
        des.sayHello();
        System.out.println("des.name = " + des.getName() );

        des.doWork(); //employee can do work
//        unemployedDes.doWork(); Wont work
    }
}
