package repository;

import model.Login;
import model.User;

public interface LoginRepository {
    User checkLogin(Login login);
}
