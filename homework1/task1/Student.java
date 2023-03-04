package homework1.task1;

public class Student {

    String firstName;
    String lastName;
    int group;
    double averageMark;



    public Student(String firstName, String lastName, int group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this. group = group;
        this.averageMark = averageMark;

    }


    public int getScholarship(){
        int sholarship = 0;
        if(this.averageMark >= 5 ){
            sholarship += 2000;
        }else{
            sholarship += 1900;
        }
        return sholarship;
    }
}
