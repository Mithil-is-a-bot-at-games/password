import java.util.Scanner;
class Main{
    public static void score(boolean upper,boolean length,boolean lower,boolean dig,boolean symbol){
        //initializing score variable
        int score = 0;
        //adding a point for every requirement the password meets
        if(upper == true){
            score +=1;
        }else{System.out.println("Your Password Should Contain Atleast One UpperCase Letter.");}//printing out what the user needs to change in their password
        if(lower == true){
            score+=1;
        }else{System.out.println("Your Password Should Contain Atleast One LowerCase Letter.");}
        if(length == true){
            score +=1;
        }else{System.out.println("Your Password Should Contain Atleast 12 characters.");}
        if(dig == true){
            score +=1;
        }else{System.out.println("Your Password Should Contain Atleast One Numerical Digit.");}
        if(symbol == true){
            score +=1;
        }else{System.out.println("Your Password Should Contain Atleast One Special Character.");}
        //printing out final password score
        System.out.println("Your Password strength is a " + score + " out of 5");

    }
    public static void validity(String password){
        //intializing variables
        boolean upper = false;
        boolean length = false;
        boolean lower = false;
        boolean dig = false;
        boolean symbol = false;
        //swapping input from string to character
        for(char c :password.toCharArray()){
            //checking if input meets password requirements
            if(Character.isUpperCase(c)){
                upper = true;
            }else if(Character.isLowerCase(c)){
                lower = true;
            }else if(Character.isDigit(c)){
                dig = true;
            }
        }
        //looping through user input
        for (int i = 0; i < password.length(); i++) {
 
            //checking input for special characters
            if (!Character.isDigit(password.charAt(i))
                && !Character.isLetter(password.charAt(i))
                && !Character.isWhitespace(password.charAt(i))) {
                symbol = true;
            }
        }
        //checking if password length meets the requirements
        if(password.length() >= 12){
            length = true;
        }
        //calling scoring function
        score(upper,length,lower,dig,symbol);

    }
    public static void main(String[] args) {
        //intializing variables
        Scanner input = new Scanner(System.in);
        String pw;
        //getting user input 
        System.out.println("Enter a password:");
        pw = input.nextLine();
        //calling function to check is input meets requirements
        validity(pw);





    }

}
