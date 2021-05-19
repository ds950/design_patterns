package basepatterns.creational.factory;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter programming lang:");
        String specialty = scanner.nextLine();
        DeveloperFactory developerFactory = createDeveloperBySpecialty(specialty); //create DF object by specialty
        Developer developer = developerFactory.createDeveloper(); //create Dev object

        developer.writeCode(); //realize method
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return  new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " does not exist");
        }
    }

}
