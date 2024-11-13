import java.util.Scanner;
class Main{
    public static void score(boolean upper,boolean length,boolean lower,boolean dig,boolean symbol){
        int score = 0;
        if(upper == true){
            score +=1;
        }else{System.out.println("Your Password Should Contain Atleast One UpperCase Letter.");}
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
        System.out.println("Your Password strength is a " + score + " out of 5");

    }
    public static void validity(String password){
        boolean upper = false;
        boolean length = false;
        boolean lower = false;
        boolean dig = false;
        boolean symbol = false;
        for(char c :password.toCharArray()){
            if(Character.isUpperCase(c)){
                upper = true;
            }else if(Character.isLowerCase(c)){
                lower = true;
            }else if(Character.isDigit(c)){
                dig = true;
            }
        }
        for (int i = 0; i < password.length(); i++) {
 
            // Checking the character for not being a
            // letter,digit or space
            if (!Character.isDigit(password.charAt(i))
                && !Character.isLetter(password.charAt(i))
                && !Character.isWhitespace(password.charAt(i))) {
                // Incrementing the countr for spl
                // characters by unity
                symbol = true;
            }
        }
        if(password.length() >= 12){
            length = true;
        }
        score(upper,length,lower,dig,symbol);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pw;
        System.out.println("Enter a password:");
        pw = input.nextLine();
        validity(pw);





    }

}
