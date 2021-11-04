package InterfacesAbstractCollection;

abstract class Employee implements DailyWork {
    //uses protected because it allows to share between super and subclass but maintain lock
    protected String name;
    protected String department;

    // need a way to be instaniated

//    constructor
    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

//    getters
    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

//    public String work(); Missing method body, or declare abstract

//    public abstract String work(); //tightly coupled popped out to interface to loosely couple

//    public static void main(String[] args){
//        Employee mcken = new Employee("ken", "web dev");
//    } cannot substanitate

}
