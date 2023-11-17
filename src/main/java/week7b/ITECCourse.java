package week7b;
import java.util.ArrayList;
import java.util.List;

public class ITECCourse {
    //Data that an ITEC course object needs to store
    String name;
    int code;
    List<String> students;
    int maxStudents;


    //Constructor
    //ITECCourse(String courseName, int courseCode, int courseMaxStudents){
        //this.name = courseName;
        //this.code = courseCode;
       // this.students = new ArrayList<>(); //Set Up the Student Lists
       // this.maxStudents = courseMaxStudents;

 //   }
    void addStudent (String studentName){
        if(studentName == null){
            students = new ArrayList<>();
        }
        students.add(studentName);
    }

    void writeCourseInfo(){
        System.out.println("Course Name" + name);
        System.out.println("Course Code" + code);
        System.out.println("Student Enrolled: ");
        for(String student: students){
            System.out.println(student);
        }
        System.out.println("There are " + getNumberofStudents()+ "Students Enrolled");
        System.out.println("The max number of students are " + maxStudents);
    }

    int getNumberofStudents(){
        return this.students.size();
    }


}
