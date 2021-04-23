package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    private String userName;
    private String currentPassword;
    private boolean valid;
    private String errorMessage;
    private static Scanner scanner = new Scanner(System.in);

    public PasswordValidator(String userName, String password) {
    }

    public static void main(String[] args){
        var validator = login();
        validator.printPasswordRules();
        do{
            var proPosedPassword = validator.getProposedPassword();
            validator.changePassword(proPosedPassword);
        }while(!validator.isValid());
        System.out.println("The proposed password is valid");
        validator.closeScanner();

    }

    public void closeScanner() {
        scanner.close();
    }

    public boolean isValid() {
        return isValid();
    }

    public void changePassword(String newPassword) {
         valid = true;
         errorMessage = "";
        if (newPassword.length() < 8) {
           valid=false;
            errorMessage += "\n Your password must be at least 8 characters.";
        }
        if(newPassword.equals(newPassword.toLowerCase())){
            valid=false;
            errorMessage+= "\n Your password must include an uppercase letter.";
        }
        if(newPassword.matches("[a-zA-Z0-9]*")){
            valid=false;
            errorMessage+= "\n Your password must include a special character (e.g. %,$[:)." ;
        }

        if(newPassword.equals(currentPassword)){
            valid=false;
            errorMessage+= "\n Your password must be different from your current password." ;
        }
    }

    public String getProposedPassword() {
        System.out.println("Enter your new password");
        return scanner.nextLine();
    }

    public static PasswordValidator login() {
        System.out.println("Enter your username:");
        String userName = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        return new PasswordValidator(userName,password);
    }
    public void printPasswordRules(){
    System.out.println("Your new password must meet the following requirements:");
    System.out.println("* at least 8 characters long");
    System.out.println("* contain an uppercase letter");
    System.out.println("* contain a special character");
    System.out.println("* not contain the username");
    System.out.println("* not the same as the old password");
    System.out.println();
}

}
