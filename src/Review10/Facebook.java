package Review10;

public class Facebook {
    //fields
   private  String name;
    private String username;
    private String password;
   private String dob;
//constructor
    public Facebook(String name, String username, String password, String dob) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.dob = dob;
    }

    //methods
    void login(String userName, String password){
        if(this.username.equals(username) && password.equals(password)){
            System.out.println("Logged in ");
        }
    }
    //access modifier will be public// return must be STRING since field is string.
    public String getDob(){
        return dob;
    }
    public  String getUsername(){
        return username;
    }
    public void setUsername(String Username){
        this.username=username;
    }
}
