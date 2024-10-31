package baitap1.pkg1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BaiTap11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Name is: " + name);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.println("Age is: " + age);
        scanner.nextLine(); 

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        Date birthDate = null;
        try {
            String birthDateString = scanner.nextLine();
            birthDate = dateFormat.parse(birthDateString);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            scanner.close(); 
            return; 
        }

        System.out.print("Enter Sex: ");
        String sex = scanner.nextLine();
        System.out.println("Sex is: " + sex);

        System.out.print("Enter Major: ");
        String major = scanner.nextLine();
        System.out.println("Major is: " + major);

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("GPA is: " + gpa);
        scanner.nextLine(); 

        System.out.print("Enter Hometown: ");
        String hometown = scanner.nextLine();
        System.out.println("Hometown is: " + hometown);

        scanner.close();
    }
}
