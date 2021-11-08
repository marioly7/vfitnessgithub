package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.EjercicioBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.bl.UserBl;
import bo.ucb.edu.ingsoft.dto.EjercicioResponse;
import bo.ucb.edu.ingsoft.dto.UserResponse;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.UsuarioEjercicios;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/ejercicios")
public class EjerciciosApi {
    private EjercicioBl userBl;
    private TransactionBl transactionBl;

    @Autowired
    public EjerciciosApi(EjercicioBl userBl, TransactionBl transactionBl){
        this.userBl= userBl;
        this.transactionBl=transactionBl;
    }


    @RequestMapping(value="/allEjercicios", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EjercicioResponse> allusers(HttpServletRequest request) throws Exception {
        List<EjercicioResponse> user=userBl.getEjercicios();
        return user;
    }

    @RequestMapping(value="/ejercicioById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public EjercicioResponse ejercicioById(@RequestParam Integer ejercicioId, HttpServletRequest request) throws Exception {
        EjercicioResponse user=userBl.getEjercicioById(ejercicioId);
        return user;
    }

    @RequestMapping(value="/ejercicioByVideoId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public EjercicioResponse ejercicioByVideoId(@RequestParam Integer videoId, @RequestParam Integer dificultadId, HttpServletRequest request) throws Exception {
        EjercicioResponse user=userBl.getEjercicioByVideoId(videoId,  dificultadId);
        return user;
    }

    @RequestMapping(value="/ejercicioStatusByUserId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer ejercicioStatusByUserId(@RequestParam Integer ejercicioId, @RequestParam Integer userId, HttpServletRequest request) throws Exception {
        Integer user=userBl.getEjercicioStatus(ejercicioId, userId);
        return user;
    }

    @RequestMapping(value="/updateStatus", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateStatus(@RequestBody UsuarioEjercicios usuarioEjercicios, HttpServletRequest request) throws Exception {
        userBl.updateStatus(usuarioEjercicios);
    }


}
