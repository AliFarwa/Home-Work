package ProjectTask;
//Create Registration Class in which you would have variables as
//email, userName and password that have an access scope only
//within its own class. After creating an object of the class user should
//be able to call methods and in each method separately pass values
//to set users email, username and password.
//Requirements:
//A. Valid email consider to be only yahoo
//B. Valid userName and password cannot be empty and should be of
//length larger than 6 characters. Also valid password cannot contain
//userName.
public class Registration {

    private String Email;
    private String userName;
    private String password;

    public void setEmail(String Email) {
        this.Email = Email;
        if (Email.equals("yahoo")) {
            System.out.println("Email is abc@yahoo.com");
        } else {
            System.out.println("Sorry no Email Available");
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if (userName.isEmpty()) {
            System.out.println("Username cannot be empty");
        } else if (userName.length() > 6) {
            System.out.println("Username is good");
        } else {
            System.out.println("No username");
        }
    }

    public void setPassword(String password) {
        this.password = password;
        if (password.isEmpty()) {
            System.out.println("Password cannot be empty");
        } else if (password.length() > 6) {
            System.out.println("Password is good");
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain username");
        }

    }
}
    class RegistrationTest {
        public static void main(String[] args) {
            Registration r = new Registration();
            r.setEmail("yahoo");
            r.setPassword("abc1234");
            r.setUserName("admin123");

        }
    }
