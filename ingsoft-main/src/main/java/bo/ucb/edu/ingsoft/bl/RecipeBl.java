package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.BuscarGoogleTest;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.UserResponse;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class RecipeBl {
    private TransactionDao transactionDao;

    @Autowired
    public RecipeBl(TransactionDao transactionDao){
        this.transactionDao=transactionDao;
    }


    public String translate(String text) throws Exception {
        BuscarGoogleTest buscarGoogleTest = new BuscarGoogleTest();
        String result = buscarGoogleTest.paginaPrincipalGoogle(text);
        return result;
    }


}
