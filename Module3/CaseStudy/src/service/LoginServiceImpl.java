package service;

import repository.LoginRepository;
import repository.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService {
    LoginRepository loginRepository=new LoginRepositoryImpl();
    @Override
    public int getEmployeeId(String username, String password) {
        return loginRepository.getEmployeeId(username,password);
    }
}
