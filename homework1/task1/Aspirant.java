package homework1.task1;

public class Aspirant extends Student{
    String scientificWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }


    public int getScholarship(){
        int scholarship = 0;
        if(this.averageMark >= 5){
            scholarship += 2500;
        }else{
            scholarship += 2200;
        }
        return scholarship;
    }
}
