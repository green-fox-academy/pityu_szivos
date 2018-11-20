package GreenFoxOrganisation;

import java.util.ArrayList;
import java.util.List;

public class Cohort extends Person {
    private String name;
    private List<String> students;
    private List<String> mentors;

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<String>(0);
        this.mentors= new ArrayList<String>(0);
    }

    public void addStudent(Student student){
        students.add(student.getName());
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor.getName());
    }

    public void info(){
        System.out.println("Name of the cohort" + name + students.size()
                + "students" + mentors.size() + "mentors");
    }
}
