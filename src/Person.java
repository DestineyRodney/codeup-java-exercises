//Review with Larry
// dont have to import java utils if on same level
public class Person {
//    Java object-oriented lang
//    class is a description of the object ex create person object so create a person class and create everything that happens in person
//    object itself is the person
//    3 things commonly seen in class : properties: description, main method: everything is executed, and methods that are defined - can be getter: returns or setter: just sets must use void
//    private: only available in this class
//    Always need constructor named after class and adds perameter name
//    static means var available at class level dont need instance  if marked as ststic only available the Person class

    private String name;

//    constructor
    public Person(String name){
       this.name = name;
    }

//    Getter
    public String getName(){
        return this.name = name; // refers to the class name
    }

//    Setter
    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello" + this.name);
    }

 public static void main(String[] args){
//     Person person1 = new Person("John");
//     Person person2 = new Person("John");
//     System.out.println(person1.getName().equals(person2.getName())); //should print out true
//     System.out.println(person1 == person2); // this is false different object codes

//     Person person1 = new Person("John");
//     Person person2 = person1;
//     System.out.println(person1);
//     System.out.println(person2);
//
//     System.out.println(person1 == person2); // true because person 1 is now set to person 2

     Person person1 = new Person("John");
     Person person2 = person1;
     System.out.println(person1.getName()); //prints out John
     System.out.println(person2.getName()); //prints out John
     person2.setName("Jane");
     System.out.println(person1.getName()); //set to Jane prints out jane
     System.out.println(person2.getName()); // prints out Jane
 }


}
