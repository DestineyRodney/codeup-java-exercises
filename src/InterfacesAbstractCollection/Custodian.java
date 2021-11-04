package InterfacesAbstractCollection;

public class Custodian extends Employee{
    public Custodian(String name, String department){
        super(name, department);
    }

    public String work(){
        return "Maintaining building";
    }

    @Override
    public String morningMeeting() {
        return "Custodians have direct report to head of the maintenance department/ Scheduled as necessary.";
    }

    @Override
    public String lunchTime() {
        return "12:00 - 1:00";
    }

    @Override
    public int dailyPay() {
        return 180;
    }
}
