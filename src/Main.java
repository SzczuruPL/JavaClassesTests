import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*String[] colorsTab = new String[5];
        colorsTab[0] = "czerwony";
        colorsTab[1] = "zielony";
        colorsTab[2] = "niebieski";
        colorsTab[3] = "żółty";
        colorsTab[4] = "fioletowy";

        System.out.println(Arrays.toString(colorsTab));

        String firstColor = "pomarańczowy";
        String[] newColorsTab = new String[colorsTab.length + 1];
        newColorsTab[0] = firstColor;
        System.arraycopy(colorsTab, 0, newColorsTab, 1, colorsTab.length);

        String[] trimmedColorsTab = Arrays.copyOf(newColorsTab, newColorsTab.length - 2);

        boolean containsBlack = Arrays.asList(trimmedColorsTab).contains("czarny");

        System.out.println(containsBlack);

        List<String> colorsList = new ArrayList<>();
        colorsList.add("czerwony");
        colorsList.add("zielony");
        colorsList.add("niebieski");
        colorsList.add("żółty");
        colorsList.add("fioletowy");

        System.out.println(colorsList);

        colorsList.add(0, firstColor);*/

        /*List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Sedan", 4, Vehicle.Difficulty.MEDIUM, "Toyota"));
        vehicles.add(new Motorcycle("Sport", 2, Vehicle.Difficulty.HARD, "Honda"));
        vehicles.add(new Tricycle("Cargo", 3, Vehicle.Difficulty.EASY, "Lifan"));

        for(Vehicle vehicle : vehicles){
            System.out.println("The price of the " + vehicle.getName() + " is " + vehicle.getPrice() + " dollars.");
        }*/

        List<com.company.Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new employee");
            System.out.println("2. Display all employees");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter employee type (doctor or miner):");
                    String type = scanner.nextLine();

                    System.out.println("Enter employee name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter employee age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter employee salary:");
                    Double salary = scanner.nextDouble();
                    scanner.nextLine();

                    if (type.equalsIgnoreCase("doctor")) {
                        System.out.println("Enter doctor specialization:");
                        String specialization = scanner.nextLine();

                        employees.add(new Doctor(name, age, salary, specialization));
                    } else if (type.equalsIgnoreCase("miner")) {
                        System.out.println("Enter miner mining skill level:");
                        int miningSkillLevel = scanner.nextInt();
                        scanner.nextLine();

                        employees.add(new Miner(name, age, salary, miningSkillLevel));
                    } else {
                        System.out.println("Invalid employee type!");
                    }

                    break;
                case 2:
                    for (com.company.Employee employee : employees) {
                        System.out.println(employee);
                    }

                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}