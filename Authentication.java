public class Authentication{

    private String username;
    private String password;

    public String decrypt(String encrptedPassword){
        //..decrpyt password
        return password;
    }

    public boolean checkUser(String usernameEntered, String decrpytedPassword){
        //this.username = username;
        //this.password = decrpytedPassword;
        //..check if user is among the DB
        if(usernameEntered.equals("Admin") && decrpytedPassword.equals("Admin")){
            return true;
        }
        else
            return false;
    }

    public boolean grantAccess(){
        //..grant access to information
        System.out.println("Access Granted!");
        return true;
    }

}