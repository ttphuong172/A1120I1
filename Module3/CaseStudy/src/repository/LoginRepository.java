package repository;

public interface LoginRepository {
    int getEmployeeId(String username, String password);
}
