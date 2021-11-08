package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.EjercicioBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.bl.VideoBl;
import bo.ucb.edu.ingsoft.dto.EjercicioResponse;
import bo.ucb.edu.ingsoft.dto.VideoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/videos")
public class VideosApi {
    private VideoBl userBl;
    private TransactionBl transactionBl;

    @Autowired
    public VideosApi(VideoBl userBl, TransactionBl transactionBl){
        this.userBl= userBl;
        this.transactionBl=transactionBl;
    }


    @RequestMapping(value="/allVideos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<VideoResponse> allVideos(HttpServletRequest request) throws Exception {
        List<VideoResponse> user=userBl.getVideos();
        return user;
    }

    @RequestMapping(value="/videoById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public VideoResponse videoById(@RequestParam Integer videoId, HttpServletRequest request) throws Exception {
        VideoResponse user=userBl.getVideoById(videoId);
        return user;
    }

    @RequestMapping(value="/videoByZonaId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public  List<VideoResponse> videoByZonaId(@RequestParam Integer zonaId, HttpServletRequest request) throws Exception {
        List<VideoResponse> user=userBl.getVideoByZonaId(zonaId);
        return user;
    }


}
