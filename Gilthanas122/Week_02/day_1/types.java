public class types {
    public static void main(String[] args) {
    // 04 Introduce yourself
        String name = "Pityu";
        int age = 32;
        float height = 1.90f;

        System.out.println("My name is " + name);
        System.out.println("My name age " + age);
        System.out.println("My height is " + height);

        //05 Two number //

        // Print the result of 13 added to 22
        int a = 13;
        int b = 22;

        System.out.println(a + b);
        // Print the result of 13 substracted from 22
        System.out.println(b - a);
        // Print the result of 22 multiplied by 13
        System.out.println(a * b);
        // Print the result of 22 divided by 13 (as a decimal fraction)
        System.out.println((float)b / a);
        // Print the integer part of 22 divided by 13
        System.out.println(a + b);
        // Print the reminder of 22 divided by 13

        //06 Workinghours //

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int average_work_hour = 6;
        int length_semester = 17;
        int days_work = 5;

        int spent_coding = length_semester * days_work * average_work_hour;
        System.out.println(spent_coding);

        float week_hours = 168;
        float work_hours = 52;

        float average_week = work_hours / week_hours;
        System.out.println(average_week * 100 + "%");
    }
}
