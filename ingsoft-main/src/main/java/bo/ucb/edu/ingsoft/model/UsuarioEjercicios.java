package bo.ucb.edu.ingsoft.model;

public class UsuarioEjercicios {
    private Integer ejercicioId;
    private Integer userId;
    private Integer status;

    public Integer getEjercicioId() {
        return ejercicioId;
    }

    public void setEjercicioId(Integer ejercicioId) {
        this.ejercicioId = ejercicioId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UsuarioEjercicios{" +
                "ejercicioId=" + ejercicioId +
                ", userId=" + userId +
                ", status=" + status +
                '}';
    }
}
