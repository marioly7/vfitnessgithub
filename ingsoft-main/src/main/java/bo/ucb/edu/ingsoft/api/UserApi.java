package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.BuscarGoogleTest;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.bl.UserBl;
import bo.ucb.edu.ingsoft.dto.UserDataRequest;
import bo.ucb.edu.ingsoft.dto.UserResponse;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserApi {
    private UserBl userBl;
    private TransactionBl transactionBl;

    @Autowired
    public UserApi(UserBl userBl, TransactionBl transactionBl){
        this.userBl= userBl;
        this.transactionBl=transactionBl;
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse addUser(@RequestBody UserResponse user, HttpServletRequest request) throws Exception {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        UserResponse userRes=userBl.addUser(user,transaction);
        return userRes;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer findUserByEmailPassword(@RequestParam String email, @RequestParam String password, HttpServletRequest request) throws Exception {

        return userBl.findUserByEmailPassword(email, password);
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUser(@RequestParam Integer userId, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        userBl.userDelete(userId,transaction);
    }

    @RequestMapping(value="/allUsers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserResponse> allusers(HttpServletRequest request) throws Exception {
        List<UserResponse> user=userBl.getUsers();
        return user;
    }

    @RequestMapping(value="/userById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse userById(@RequestParam Integer userId, HttpServletRequest request) throws Exception {
        UserResponse user=userBl.getUserById(userId);
        return user;
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse updateUser(@RequestBody UserResponse user, HttpServletRequest request){
        UserResponse userRes=userBl.updateUser(user);
        return userRes;
    }



//    @RequestMapping(path = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<NewsResponse> getNews(){
//        return newsBl.getNews();
//    }
//
//    @RequestMapping(value = "/delete/{idNews}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(value = HttpStatus.OK)
//    public void productDelete(@PathVariable("idNews") Integer idNews, HttpServletRequest request) {
////        Transaction transaction = TransactionUtil.createTransaction(request);
////        transactionBl.createTransaction(transaction);
//        newsBl.newsDelete(idNews);
//    }

}
