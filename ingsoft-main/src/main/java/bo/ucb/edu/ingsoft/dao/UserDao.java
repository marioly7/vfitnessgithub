package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.UserDataRequest;
import bo.ucb.edu.ingsoft.dto.UserResponse;
import bo.ucb.edu.ingsoft.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public void addUser(User user);
    public List<UserResponse> getUsers();
    public UserResponse getUserById(Integer userId);
    public void deleteUser(User user);
    public void updateUser(UserResponse user);
    public Integer findUserByEmailPassword(String email);
    public Integer findUserById(Integer userId);
    public String getPasswordEncrypted(String email);
}
