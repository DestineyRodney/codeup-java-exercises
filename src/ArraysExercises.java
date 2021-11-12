import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] arr, Person single){
        Person[] personAddOne = Arrays.copyOf(arr, arr.length + 1);
        personAddOne[personAddOne.length -1] = new Person(single.getName());
        return personAddOne;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);  //[I@4617c264 Need to do arrays toString
        System.out.println(Arrays.toString(numbers));

        Person[] students = new Person[3];
        students[0] = new Person("Destiney");
        students[1] = new Person("Ni");
        students[2] = new Person("Noah");

        for (Person person : students) {
            System.out.println(person.getName());
        }
        System.out.println();

        Person[] newPerson = addPerson(students, new Person("TK"));

        for (Person person : newPerson) {
            System.out.println(person.getName());
        }
    }
}
