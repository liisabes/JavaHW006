import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("16", "160", "Windows", "Black");
        Laptop laptop2 = new Laptop("8", "100", "Windows", "White");
        Laptop laptop3 = new Laptop("16", "170", "Linux", "Grey");
        Laptop laptop4 = new Laptop("8", "100", "Linux", "Black");
        Laptop laptop5 = new Laptop("16", "160", "Windows", "Grey");

        Set<Laptop> set = new HashSet<>();
        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);

        Map<String, String> map = new HashMap<>();
        System.out.println(
                "\nВведите цифру, указывающую на вид фильтрации: \n1 - ram, \n2 - disk capacity, \n3 - operating system, \n4 - color\n");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\nВведите цифру, указывающую на параметр: 8, 16\n");
                String choice1 = scanner.nextLine();
                map.put(choice, choice1);
                for (Laptop laptop : set) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (laptop.getRam().equals(entry.getValue())) {
                            System.out.println(laptop);
                        }
                    }
                }
                break;
            case "2":
                System.out.println("\nВведите цифру, указывающую на параметр: 100, 160, 170\n");
                String choice2 = scanner.nextLine();
                map.put(choice, choice2);
                for (Laptop laptop : set) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (laptop.getDiskCapacity().equals(entry.getValue())) {
                            System.out.println(laptop);
                        }
                    }
                }
                break;
            case "3":
                System.out.println("\nВведите параметр: Windows, Linux\n");
                String choice3 = scanner.nextLine();
                map.put(choice, choice3);
                for (Laptop laptop : set) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (laptop.getOperatingSystem().equals(entry.getValue())) {
                            System.out.println(laptop);
                        }
                    }
                }
                break;
            case "4":
                System.out.println("\nВведите параметр: Black, White, Grey\n");
                String choice4 = scanner.nextLine();
                map.put(choice, choice4);
                for (Laptop laptop : set) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (laptop.getColor().equals(entry.getValue())) {
                            System.out.println(laptop);
                        }
                    }
                }
                break;
            default:
                System.out.println("Такаого парамметра нет!");
                break;
        }
    }
}