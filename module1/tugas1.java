import java.util.Scanner;


public class tugas1 {
    
    public static void main(String[] args) {
        
        int option;
        String nim;
        String adminName, adminPw;
        
        Scanner input = new Scanner(System.in);

            System.out.println("=== Library System ==");
            System.out.println(" ");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose Option (1-3): ");

            option = input.nextInt();

            if (option == 1) {
                System.out.println("Enter your NIM: ");
                nim = input.next();

                    if (nim.length() == 15) {
                        System.out.println("Successful login as student");
                    } else {
                        System.out.println("NIM not Found!");
                    }
                    
                return;
            } else if (option == 2) {
                System.out.println("Enter admin name: ");
                adminName = input.next();

                System.out.println("Enter Password: ");
                adminPw = input.next();

                if (adminName.equals(adminPw)) {
                    System.out.println("Successful login as Admin");
                    
                } else{
                    System.out.println("Admin User not found!");
                }
                return;
            } else if (option == 3) {
                System.out.println("ADIOS");
            }

        }
    }
