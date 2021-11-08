package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.EjercicioResponse;
import bo.ucb.edu.ingsoft.dto.ZonaResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZonaDao {
    public List<ZonaResponse> getZonas();
    public ZonaResponse getZonaById(Integer zonaId);
}
