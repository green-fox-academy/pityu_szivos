package GreenFoxOrganisation;

public class Mentor extends Person {
    private String level;

    public Mentor(){
        super("Jane Doe", 30, "female");
        level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers");
    }

    public void introduce() {
        System.out.println("Hi, my name is" + getName() + "I am " + getAge() + " old and I am a " + isGender() +
                level + "level mentor");
    }

}

