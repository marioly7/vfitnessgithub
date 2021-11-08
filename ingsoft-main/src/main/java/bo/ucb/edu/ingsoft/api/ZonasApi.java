package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.bl.VideoBl;
import bo.ucb.edu.ingsoft.bl.ZonaBl;
import bo.ucb.edu.ingsoft.dto.VideoResponse;
import bo.ucb.edu.ingsoft.dto.ZonaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/zonas")
public class ZonasApi {
    private ZonaBl userBl;
    private TransactionBl transactionBl;

    @Autowired
    public ZonasApi(ZonaBl userBl, TransactionBl transactionBl){
        this.userBl= userBl;
        this.transactionBl=transactionBl;
    }


    @RequestMapping(value="/allZonas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ZonaResponse> allVideos(HttpServletRequest request) throws Exception {
        List<ZonaResponse> user=userBl.getZonas();
        return user;
    }

    @RequestMapping(value="/zonaById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ZonaResponse videoById(@RequestParam Integer zonaId, HttpServletRequest request) throws Exception {
        ZonaResponse user=userBl.getZonaById(zonaId);
        return user;
    }


}
