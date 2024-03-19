import java.util.Scanner;


public class cobatugas {
    
    public static void main(String[] args) {
        
        int option;
        String nim;
        String adminName, adminPw;

        String[] nimMahasiswa = {"123456789876543", "987654321234567"};

        String usernameAdmin = "admin";
        String passwordAdmin = "admin";
        
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
                    
                    boolean nimFound = false;
                    for (String studentNim : nimMahasiswa) {
                    if (nim.equals(studentNim)) {
                        nimFound = true;
                        break;
                        }
                    } if (nimFound) {
                        System.out.println("Successful login as student");
                        } else {
                         System.out.println("Nim not Found!");
                        }
                    } else {
                        System.out.println("NIM is Invalid!");
                    }
                    
            } else if (option == 2) {
                System.out.println("Enter admin name: ");
                adminName = input.next();

                System.out.println("Enter Password: ");
                adminPw = input.next();

                if (adminName.equals(usernameAdmin) && adminPw.equals(passwordAdmin)) {
                    System.out.println("Successful login as Admin");
                    
                } else{
                    System.out.println("Admin User not found!");
                }
                return;
            } else if (option == 3) {
                System.out.println("ADIOS");
            } else {
                System.out.println("Wrong input Option");
            }

        }
    }
