package class23Hw;
/*
Create Registration Class in which you would have variables as email,
userName and password that have an access scope only within its own class.
After creating an object of the class user should be able to call methods
and in each method separately pass values to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and
should be of length larger than 6 characters.
Also valid password cannot contain userName.
 */

public class Registration09 {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("yahoo.com")) {
            this.email = email;
            System.out.println("Email");
        } else {
            System.out.println("Invalid email");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username");
        } else {
            System.out.println("Invalid username");
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("Password");
        } else {
            System.out.println("Invalid password");
        }
    }
}



