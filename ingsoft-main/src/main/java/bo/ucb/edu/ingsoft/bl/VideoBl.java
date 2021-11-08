package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.EjercicioDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.VideoDao;
import bo.ucb.edu.ingsoft.dto.EjercicioResponse;
import bo.ucb.edu.ingsoft.dto.VideoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoBl {
    private VideoDao userDao;
    private TransactionDao transactionDao;

    @Autowired
    public VideoBl(VideoDao userDao, TransactionDao transactionDao){
        this.userDao = userDao;
        this.transactionDao=transactionDao;
    }

    public List<VideoResponse> getVideos(){
        List<VideoResponse> user=userDao.getVideos();
        return user;
    }

    public VideoResponse getVideoById(Integer videoId){
        VideoResponse user=userDao.getVideoById(videoId);
        return user;
    }

    public  List<VideoResponse> getVideoByZonaId(Integer zonaId){
        List<VideoResponse> user=userDao.getVideoByZonaId(zonaId);
        return user;
    }
}
