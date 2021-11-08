package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.BuscarGoogleTest;
import bo.ucb.edu.ingsoft.bl.RecipeBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.bl.UserBl;
import bo.ucb.edu.ingsoft.dto.UserResponse;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/recipe")
public class RecipeApi {
    private RecipeBl recipeBl;
    private TransactionBl transactionBl;

    @Autowired
    public RecipeApi(RecipeBl recipeBl, TransactionBl transactionBl){
        this.recipeBl= recipeBl;
        this.transactionBl=transactionBl;
    }

    @RequestMapping(value = "/translation", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String translate(@RequestParam String text, HttpServletRequest request) throws Exception {

        return recipeBl.translate(text);
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
