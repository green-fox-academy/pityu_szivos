package GreenFoxOrganisation;

public class Student extends Person {
    private String previousOrganisation;
    private int skippedDays;

      public Student() {
        super("Jane Doe", 30, "female");
        this.previousOrganisation = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    public void introduce() {
        System.out.println("Hi, my name is" + getName() + "I am " + getAge() + " old and I am a " + isGender() +
        " my previous organisation" + previousOrganisation + "I skipped so many days" + skippedDays);
    }

    public void skipDays(int numberofDays) {
        skippedDays = skippedDays + numberofDays;
    }
}
