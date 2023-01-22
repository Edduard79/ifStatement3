
import java.util.Random;
public class Student {
    public String name;
    public int age;

    public Student(String studentName, int studentAge){ //CONSTRUCTOR METHOD
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge(){     //METHOD
        Random casual = new Random();
        int casNum = casual.nextInt(35);
        System.out.printf("I generated the random number %d for student %s. \n",casNum, name);

        String var;

            if(casNum < age){
                var = "lower";
            }else if (casNum == age){
                var = "equals";
            }else {
                var =" greater";
            }

            System.out.printf("The random number is %s than the student's age %d! \n",var,age );

        }

}







