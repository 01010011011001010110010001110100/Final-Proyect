package model;

public class User {
    
    private int idUser;
    private String userName;
    private String userEmail;
    private String userPassword;
    private int idAccess;
    private int idState;

    public User(){
    }

    public User(int idUser,String userName, String userEmail, String userPassword, int idAccess, int idState) {
        this.idUser = idUser;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.idAccess = idAccess;
        this.idState = idState;
    }

    public int getIdUser() {
        return idUser;
    }
    
    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public int getIdAccess() {
        return idAccess;
    }

    public int getIdState() {
        return idState;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setIdAccess(int idAccess) {
        this.idAccess = idAccess;
    }

    public void setIdState(int idState) {
        this.idState = idState;
    }



}
