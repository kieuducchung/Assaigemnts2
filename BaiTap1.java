package baitap1;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.println("Name is: " + name);

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            System.out.println("Age is: " + age);
            scanner.nextLine(); 

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
        }
    }

