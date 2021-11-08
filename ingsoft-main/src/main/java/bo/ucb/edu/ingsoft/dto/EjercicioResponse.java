package bo.ucb.edu.ingsoft.dto;

public class EjercicioResponse {
    private Integer ejercicioId;
    private Integer series, repeticiones;
    private String link;
    private Integer dificultad;
    private String ejercicioName;

    public String getEjercicioName() {
        return ejercicioName;
    }

    public void setEjercicioName(String ejercicioName) {
        this.ejercicioName = ejercicioName;
    }

    public Integer getEjercicioId() {
        return ejercicioId;
    }

    public void setEjercicioId(Integer ejercicioId) {
        this.ejercicioId = ejercicioId;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(Integer repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getDificultad() {
        return dificultad;
    }

    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "EjercicioResponse{" +
                "ejercicioId=" + ejercicioId +
                ", series=" + series +
                ", repeticiones=" + repeticiones +
                ", link='" + link + '\'' +
                ", dificultad=" + dificultad +
                ", ejercicioName='" + ejercicioName + '\'' +
                '}';
    }
}
