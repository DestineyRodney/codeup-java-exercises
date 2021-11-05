package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrades;

//constructor
  public Student (String name){
      this.studentName = name;
      this.studentGrades = new ArrayList<>();

    }
//methods
    public String getName(){
      return this.studentName;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.studentGrades.add(grade);

    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for(int i = 0; i < studentGrades.size(); i++){
            sum += this.studentGrades.get((int) i);
//            System.out.println(this.studentGrades.get((int) i));
        }

        return sum/studentGrades.size();
    };

    public static void main(String[] args) {

    }

}
