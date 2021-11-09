package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.EjercicioResponse;
import bo.ucb.edu.ingsoft.dto.UserResponse;
import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.model.UsuarioEjercicios;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EjercicioDao {
    public List<EjercicioResponse> getEjercicios();
    public EjercicioResponse getEjercicioById(Integer ejercicioId);
    public EjercicioResponse getEjercicioByVideoId(Integer videoId, Integer dificultadId);
    public Integer getEjercicioStatus(Integer ejercicioId, Integer userId);
    public Integer getUserProgress(Integer userId);
    public Integer getEjerciciosCount();
    public Integer userExistsInUserEjercicios(Integer userId);
    public void inserIntoUserEjercicios(Integer userId);
    public void updateStatus(UsuarioEjercicios usuarioEjercicios);
}
