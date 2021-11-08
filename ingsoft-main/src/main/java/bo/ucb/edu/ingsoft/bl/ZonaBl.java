package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.EjercicioDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.ZonaDao;
import bo.ucb.edu.ingsoft.dto.EjercicioResponse;
import bo.ucb.edu.ingsoft.dto.ZonaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZonaBl {
    private ZonaDao userDao;
    private TransactionDao transactionDao;

    @Autowired
    public ZonaBl(ZonaDao userDao, TransactionDao transactionDao){
        this.userDao = userDao;
        this.transactionDao=transactionDao;
    }

    public List<ZonaResponse> getZonas(){
        List<ZonaResponse> user=userDao.getZonas();
        return user;
    }

    public ZonaResponse getZonaById(Integer zonaId){
        ZonaResponse user=userDao.getZonaById(zonaId);
        return user;
    }
}
