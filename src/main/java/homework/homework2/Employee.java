package homework.homework2;

public class Employee {

    private String name;
    private String surname;
    private String age;
    private String jobTitle;
    private String email;
    private String phoneNumber;

    public Employee(String name, String surname, String age, String jobTitle, String email, String phoneNumber) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getAge() {
        return this.age;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Neil", "Armstrong", "55", "Spaceman",
                "email@email.com", "+38023547869");

        System.out.println();
        System.out.println("Name: " + employee.getName());
        System.out.println("Surname: " + employee.getSurname());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Job: " + employee.getJobTitle());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone Number: " + employee.getPhoneNumber());

    }
}
