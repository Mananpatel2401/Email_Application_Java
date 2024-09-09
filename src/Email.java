
import java.util.*;
import java.lang.*;

public class Email{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "Javaproject.com";

    // Collect the first name nad last name

    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email has been created: "+this.firstName+this.lastName);

        // Calling menthod to ask for department

        this.department = setDepartment();
        System.out.println("Department: "+this.department);

        // Calling method to return random password
        this.password = password(defaultPasswordLength);
        System.out.println("Your password is: "+ this.password);

        // Combining data collected till now to generate email
        email = firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+department+"."+ companySuffix ;
        System.out.println("Your email is: "+email);

    }

    // Determine the department (sales, development, accounting), if none leave blank

    private String setDepartment(){
        System.out.println("Enter the department\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice==1){
            return "Sales";
        }
        else if (depChoice == 2){
            return "Development";
        }
        else if (depChoice == 3){
            return "Accounting";
        }
        else{
            return "";
        }
    }

    // Generatea random string for a password 

    private String password(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for(int i=0; i<length; i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);

    }

    // Creating mail capacity 

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Setting alternative email

    public void setAlternativeEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getalternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: "+ firstName + " "+ lastName+
        "Company Email: "+ email +"MAILBOX CAPACITY: " + "mb";
    }


}