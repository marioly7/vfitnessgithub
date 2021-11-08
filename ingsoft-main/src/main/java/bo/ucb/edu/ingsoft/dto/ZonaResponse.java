package bo.ucb.edu.ingsoft.dto;

public class ZonaResponse {
    private Integer zonaId;
    private String zona;

    public Integer getZonaId() {
        return zonaId;
    }

    public void setZonaId(Integer zonaId) {
        this.zonaId = zonaId;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "ZonaResponse{" +
                "zonaId=" + zonaId +
                ", zona='" + zona + '\'' +
                '}';
    }
}
