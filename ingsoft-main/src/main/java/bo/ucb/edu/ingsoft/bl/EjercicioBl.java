package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.EjercicioDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.EjercicioResponse;
import bo.ucb.edu.ingsoft.dto.UserResponse;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.model.UsuarioEjercicios;
import bo.ucb.edu.ingsoft.util.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjercicioBl {
    private EjercicioDao userDao;
    private TransactionDao transactionDao;

    @Autowired
    public EjercicioBl(EjercicioDao userDao, TransactionDao transactionDao){
        this.userDao = userDao;
        this.transactionDao=transactionDao;
    }

    public List<EjercicioResponse> getEjercicios(){
        List<EjercicioResponse> user=userDao.getEjercicios();
        return user;
    }

    public EjercicioResponse getEjercicioById(Integer ejercicioId){
        EjercicioResponse user=userDao.getEjercicioById(ejercicioId);
        return user;
    }

    public EjercicioResponse getEjercicioByVideoId(Integer videoId, Integer dificultadId){
        EjercicioResponse user=userDao.getEjercicioByVideoId(videoId, dificultadId);
        return user;
    }

    public Integer getEjercicioStatus(Integer ejercicioId, Integer userId){
        Integer user=userDao.getEjercicioStatus(ejercicioId, userId);
        return user;
    }

    public Integer userProgress(Integer userId){
        Integer user=userDao.getUserProgress(userId);
        return user;
    }

    public Integer getEjerciciosCount(){
        Integer user=userDao.getEjerciciosCount();
        return user;
    }

    public void updateStatus(UsuarioEjercicios usuarioEjercicios) {
        userDao.updateStatus(usuarioEjercicios);
    }
}
