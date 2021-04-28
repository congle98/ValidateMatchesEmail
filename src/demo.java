import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    static String getEmail(){
        Scanner scanner = new Scanner(System.in);
        String email ="";
        Pattern emailRegex = Pattern.compile("^[a-zA-z0-9]+@[a-zA-z0-9]+(\\.[a-zA-z0-9]+){1,2}$");
        while (true){
            email = scanner.nextLine();
            if(emailRegex.matcher(email).find()){
                break;
            }
            else {
                System.out.println("Invalid email, please enter again!! ");
            }
        }
        return email;
    }
    public static void main(String[] args) {
        // dùng hàm getmail
//        String email = getEmail();
//        System.out.println(email);

    }
}
