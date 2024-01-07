package javaOOPsProject2;
/*
Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName
 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){
        if(email.endsWith("@yahoo.com")){
            this.email=email;
        }else{
            System.out.println("Please enter a valid yahoo email address");
        }
    }
    public void setUserName(String userName){
        if(userName.length() > 6){
            this.userName=userName;
        }else if(userName.isEmpty()){
            System.out.println("Invalid input");
        }else{
            System.out.println("Invalid username. Enter more than 6 characters");
        }

    }
    public void setPassword(String password){
        if(password.length() > 6 && !password.contains(userName)){
            this.password=password;
        }else if(password.isEmpty()){
            System.out.println("Invalid input");
        }else{
            System.out.println("Invalid password. Enter more than 6 characters");
        }
    }
    public void printInfo(){
        System.out.println("User Information:");
        System.out.println("Email: "+email);
        System.out.println("Username: "+userName);
        System.out.println("Password "+password);
    }
}
