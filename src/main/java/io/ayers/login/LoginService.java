package io.ayers.login;

public class LoginService {

    public boolean isUserValid(String user, String password) {
        if (user.equals("test") && password.equals("password"))
            return true;

        return false;
    }

}
