package week7b;

public class ITECCourseManager {
    public static void main(String[] args) {
        ITECCourse maintenanceCourse = new ITECCourse();
        maintenanceCourse.name = "MicroComputer System Maintenance";
        maintenanceCourse.code = 1310;
        maintenanceCourse.maxStudents = 20;

        //Add Some Students
        //TODO check that  we have not exceed max number for class

        maintenanceCourse.addStudent("Javier");
        maintenanceCourse.addStudent("Paulo");
        maintenanceCourse.addStudent("Humberto");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse();
        datacomCourse.name = "Data Communications";
        datacomCourse.code = 1425;
        datacomCourse.maxStudents = 30;

        datacomCourse.addStudent("Leo");
        datacomCourse.addStudent("Marcos");
        datacomCourse.addStudent("Aala");

        datacomCourse.writeCourseInfo();

    }
}
