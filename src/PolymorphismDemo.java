import javax.lang.model.SourceVersion;

public class PolymorphismDemo {
    //my application (polymorph demo) has method calling on the employee.work()
    public static void doWork(Worker w){
        System.out.println(w.work());
    }// being static allows to access it instead of being an instance



    public static void main(String[] args){
        Worker one = new Worker();
        Worker two = new Manager();

    //Static path: calling within the class
        doWork(one);
        doWork(two);


    //INSTANCE PATH
    //PolymorphismDemo newObj = new PolymorphismDemo()();
    //newObj.doWork();
    }
}
//Rule of thumb If you create a class that has mini objects dont use static but if it will be methods then use static