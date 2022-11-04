public class Course {
    private String courseName;
    private String instructorName;
    private Student name;

    public Course(String courseName, String instructorName, Student name){


        this.name=name;
        if (courseName.length()>2){
            this.courseName=courseName;
            this.instructorName=instructorName;
        }


    }
    public Course(){

    }
    String getCourseName(){
        return courseName;
    }
    String getInstructorName(){
        return instructorName;
    }
    Student getName(){
        return name;
    }
}
