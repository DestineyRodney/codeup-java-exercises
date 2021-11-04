package InterfacesAbstractCollection;

public class Accountant extends Employee{
   //constructor that was needed
    public Accountant(String name, String department){
        super(name, department);
    }

    public String work(){
        return "TPS Reports have been drafted";
    }

    @Override
    public String morningMeeting() {
        return "Accountants have morning meeting from 8:15 until 8:45";
    }

    @Override
    public String lunchTime() {
        return "Take lunch at desk when ready";
    }

    @Override
    public int dailyPay() {
        return 500;
    }

    //need default constructor
}
