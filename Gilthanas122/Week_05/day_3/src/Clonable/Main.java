package Clonable;

public class Main {
    public static void main(String[] args)  {
        Student student2 = new Student("John", 30, "male", "BME");
        try {
            Student studentNew = student2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
