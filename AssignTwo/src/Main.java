import java.util.Scanner;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        // Simulated database lookup
        DatabaseSim database = new DatabaseSim() {
            // Simulated data
            private final String[][] userData = {
                    {"bit19-mlumanga", "Michael"},
                    {"bit20-fahad", "Fahad"},
                    {"bit19-ichikusa", "Issac"},
                    {"bit19-lchikoko", "Laston"},
                    {"bit18-conrad", "Conrad"},
                    {"bit18-egondwe", "Emmanual"}
            };

            // Method to check if username and password match
            @Override
            public boolean authenticate(String id, String password) {
                for (String[] user : userData) {
                    if (user[0].equals(id) && user[1].equals(password)) {
                        return true;
                    }
                }
                return false;
            }
        };

        // Authenticating user credentials

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();


        // Demonstrating encapsulation by accessing student information via methods
        UndergraduateStudent undergrad0 = new UndergraduateStudent("Fahad", 20, "bit20-fahad", "National Identification");
        GraduateStudent grad0 = new GraduateStudent("Conrad", 25, "bit18-conrad", 2024);
        UndergraduateStudent undergrad1 = new UndergraduateStudent("Laston", 20, "bit19-lchikoko", "Digital Learning");
        UndergraduateStudent undergrad2 = new UndergraduateStudent("Michael", 22, "bit19-mlumanga", "DevOps");
        UndergraduateStudent undergrad3 = new UndergraduateStudent("Issac", 19, "bit19-ichikusa", "Farm management System");
        GraduateStudent grad1 = new GraduateStudent("Emmanuel", 25, "bit18-egondwe", 2024);


        if (database.authenticate(id, password)) {
            System.out.println("Login successful!");
            System.out.println("");
            System.out.println(" ");
            // You can proceed with further actions here
            switch (id) {
                case "bit19-mlumanga":
                    // Polymorphism: Same method name displayInfo() but different behaviors based on the object type
                    undergrad2.displayInfo();
                    break;
                case "bit20-fahad":
                    undergrad0.displayInfo();
                    break;
                case "bit19-ichikusa":
                    undergrad3.displayInfo();
                    break;
                case "bit19-lchikoko":
                    undergrad1.displayInfo();
                    break;
                case "bit18-conrad":
                    grad0.displayInfo();
                    break;
                case "bit18-egondwe":
                    grad1.displayInfo();
                    break;
                default:
                    System.out.println("User not found.");
                    break;
            }
        }else{
            System.out.println("Invalid username or password.");
            // You can handle failed login attempt here

        }
    }
}
