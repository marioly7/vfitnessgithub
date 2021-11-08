package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.EjercicioResponse;
import bo.ucb.edu.ingsoft.dto.VideoResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoDao {
    public List<VideoResponse> getVideos();
    public VideoResponse getVideoById(Integer videoId);
    public  List<VideoResponse> getVideoByZonaId(Integer zonaId);
}
