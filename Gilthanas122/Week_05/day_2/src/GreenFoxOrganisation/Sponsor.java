package GreenFoxOrganisation;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor() {
        super("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public void introduce() {
        System.out.println("Hi, my name is" + getName() + "I am " + getAge() + " old and I am a " + isGender() +
                " I represent the " + company + " company and hired so far" + hiredStudents + "so far");
    }

    public void hire(){
        hiredStudents++;
    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers");
    }
}
