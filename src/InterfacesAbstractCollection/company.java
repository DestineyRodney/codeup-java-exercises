package InterfacesAbstractCollection;

public class company { //Dessy INC
    public static void main(String[] args){
        //2 instances of employees
        Accountant accBot = new Accountant("numberBot", "Accounting");
        Custodian cleanerBot = new Custodian("cleanerBot900", "Maitinence");

//        System.out.println(accBot.work());
//        System.out.println(accBot.getName());
//        System.out.println(accBot.getDepartment());
//
//        System.out.println(cleanerBot.work());
//        System.out.println(cleanerBot.getName());
//        System.out.println(cleanerBot.getDepartment());

       //How does our workday go
        System.out.println(accBot.getName() + "is reporting for buisness for the " + accBot.getDepartment());
        System.out.println(cleanerBot.getName() + "is reporting for buisness for the " + cleanerBot.getDepartment());
        System.out.println("How do morning meetings go? ");
        System.out.println("accBot's morning meeting " + accBot.morningMeeting());
        System.out.println("cleanerBot's morning meeting " + cleanerBot.morningMeeting());

        System.out.println("What happens at lucnhtime?");
        System.out.println("accBot's lunch" + accBot.lunchTime());
        System.out.println("cleanerBot's lunch" + cleanerBot.lunchTime());





    }
}
