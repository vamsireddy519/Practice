 class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double calculateBonus() {
        
        return 0.0;
    }

    public String generatePerformanceReport() {
        return "No performance report available.";
    }
}
class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public double calculateBonus() {
        
        return getSalary() * 0.15;
    }

    @Override
    public String generatePerformanceReport() {
  
        return "Performance report for Manager " + getName() + ": Excellent";
    }

    public void manageProject() {
       
        System.out.println("Manager " + getName() + " is managing a project.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public double calculateBonus() {
       
        return getSalary() * 0.10;
    }

    @Override
    public String generatePerformanceReport() {
        
        return "Performance report for Developer " + getName() + ": Good";
    }

    public void writeCode() {
      
        System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage);
    }
}

class Programmer extends Developer {
    public Programmer(String name, String address, double salary, 

    @Override
    public double calculateBonus() {
       
        return getSalary() * 0.12;
    }

    @Override
    public String generatePerformanceReport() {
       
        return "Performance report for Programmer " + getName() + ": Excellent";
    }

    public void debugCode() {
        
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
    }
}
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager", 5);
        Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "Java");
        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Python");

        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());

        manager.manageProject();
        developer.writeCode();
        programmer.debugCode();
    }
}
