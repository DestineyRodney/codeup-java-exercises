//Write a public class named ‘Candy’ - this class should have two public fields, both taking in a string literal as a value.
//        The first would be ‘name’ and the second will be ‘size’.
//        The class will also need two constructors - the first for if we know the name, but not the size. Your first constructor should set some kind of string literal for the size.
//        The second would be for if we know both the name and the size. This second constructor will pass through those arguments into the Candy object being instantiated.
//        BONUS:
//        Write a method for your Candy class - this method should print out a message saying:

public class StringExercise {
    public static void main(String[] args){
// Question 1 For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.
//        We don't need no education
//        We don't need no thought control
        String sentence1 = "We don't need no education \nWe don't need no thought control";
        System.out.println(sentence1);

//        Check "this" out!, "s inside of "s!

        String sentence2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(sentence2);

//        In windows, the main drive is usually C:\

        String sentence3 = "In windows, the main drive is usually C:\\";
        System.out.println(sentence3);

//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!

        String sentence4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
        System.out.println(sentence4);
    }
}
