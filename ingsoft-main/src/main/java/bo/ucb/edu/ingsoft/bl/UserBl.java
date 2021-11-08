package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.EjercicioDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.UserDataRequest;
import bo.ucb.edu.ingsoft.dto.UserResponse;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.util.Encrypt;
import org.apache.tomcat.util.net.openssl.ciphers.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.kerberos.EncryptionKey;
import java.util.List;

@Service
public class UserBl {
    private UserDao userDao;
    private EjercicioDao ejercicioDao;
    private TransactionDao transactionDao;

    @Autowired
    public UserBl(UserDao userDao, EjercicioDao ejercicioDao, TransactionDao transactionDao){
        this.userDao = userDao;
        this.ejercicioDao = ejercicioDao;
        this.transactionDao=transactionDao;
    }

    public UserResponse addUser(UserResponse user,Transaction transaction) throws Exception {
        User userAdd=new User();
        String pass = Encrypt.encrypt(user.getPassword());
        userAdd.setPassword(pass);
        userAdd.setUserName(user.getUserName());
        userAdd.setAge(user.getAge());
        userAdd.setWeight(user.getWeight());
        userAdd.setHeight(user.getHeight());
        userAdd.setEmail(user.getEmail());
        //userAdd.setPassword(user.getPassword());
        userAdd.setTransaction(transaction);
        userDao.addUser(userAdd);
        Integer userId = transactionDao.getLastInsertId();
        user.setIdUser(userId);

        if(ejercicioDao.userExistsInUserEjercicios(userId) == null){
            ejercicioDao.inserIntoUserEjercicios(userId);
        }
        return user;
    }

    public UserResponse updateUser(UserResponse user){
        UserResponse userAdd=new UserResponse();
        userAdd.setIdUser(user.getIdUser());
        userAdd.setUserName(user.getUserName());
        userAdd.setWeight(user.getWeight());
        userAdd.setHeight(user.getHeight());
        userDao.updateUser(userAdd);
        return userAdd;
    }

    public List<UserResponse> getUsers(){
        List<UserResponse> user=userDao.getUsers();
        return user;
    }

    public UserResponse getUserById(Integer userId){
        UserResponse user=userDao.getUserById(userId);
        return user;
    }

    public void userDelete(Integer idUser,Transaction transaction){
        User userAdd=new User();
        userAdd.setIdUser(idUser);
        userAdd.setTransaction(transaction);
        userDao.deleteUser(userAdd);
    }

    public Integer findUserByEmailPassword(String email, String password) throws Exception {
        //String pass = Encrypt.decrypt(password);
        String pass = transformPassword(email);
        if(pass.equals(password)){
            return userDao.findUserByEmailPassword(email);
        }else{
            return 0;
        }
    }

    public Integer findUserById(Integer userId) {
        return userDao.findUserById(userId);
    }

    public String transformPassword(String email) throws Exception {
        String pass = Encrypt.decrypt(userDao.getPasswordEncrypted(email));
        return pass;
    }
}
