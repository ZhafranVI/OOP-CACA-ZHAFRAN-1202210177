package MODUL1;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        String nama;
        Scanner input = new Scanner(System.in);
    
        System.out.println("Selamat datang di REstoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("==================================");

        System.out.print("Nama: ");
        String userName = input.nextLine();  // Read user input

        System.out.print("No HP: ");
        String nohp = input.nextLine();  // Read user input

        
        System.out.println(" ");

        System.out.println("Register Success");
        System.out.println("Name: " + userName);  // Output user input
        System.out.println("No. HP: " + nohp);  // Output user input

        System.out.println("==================================");

        System.out.println("1. Menu");
        System.out.println("2. Pilih Menu");
        System.out.println("3. Keluar");
    }
    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
