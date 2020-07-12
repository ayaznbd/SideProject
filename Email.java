package Emailapp;

import java.util.Scanner;

public class Email {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private String email;
        private int defaultPassLength = 10;
        private int mailboxCapacity = 500;
        private String CS = "sideproject.com";
        private String alternateEmail;

        //Constructor to receive the first name and last name
        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

            // calling to setFunction
            this.department = setDepartment();


            // calling password function
            this.password = randomPass(defaultPassLength);
            System.out.println("Your Password is: " + this.password);

            // combine elements to generate email
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + CS;

        }


        // Ask for the department

        private String setDepartment() {
            System.out.println("New Employees: " + firstName + ",Department Codes:\n1: for Sales\n2: for Development\n3: for Accounting\nEnter the code: ");
            Scanner in = new Scanner(System.in);
            int dc = in.nextInt();
            if (dc == 1) {
                return "sales";
            } else if (dc == 2) {
                return "development";
            } else if (dc == 3) {
                return "accounting";
            } else {
                return "";
            }
        }

        private String randomPass(int length) {
            String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
            char[] password = new char[length];
            for (int i = 0; i < length; i++) {
                int rand = (int) (Math.random() * pass.length());
                password[i] = pass.charAt(rand);
            }
            return new String(password);
        }

        public void setMailboxCapacity(int capacity) {
            this.mailboxCapacity = capacity;
        }

        public void setAlternateEmail(String altEmail) {
            this.alternateEmail = altEmail;
        }

        public void changePassword(String pas) {
            this.password = pas;
        }

        public int getMailboxCapacity() {
            return mailboxCapacity;
        }

        public String getAlternateEmail() {
            return alternateEmail;
        }

        public String getPassword() {
            return password;
        }

        public String showInfo() {
            return "DISPLAY NAME: " + firstName + " " + lastName +
                    "\nCOMPANY EMAIL: " + email +
                    "\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";
        }
    }
