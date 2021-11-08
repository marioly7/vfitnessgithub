package bo.ucb.edu.ingsoft.dto;

public class VideoResponse {
    private Integer videoId;
    private String nombre;
    private String link;
    private Integer zonaId;
    private String zona;


    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

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
        return "VideoResponse{" +
                "videoId=" + videoId +
                ", nombre='" + nombre + '\'' +
                ", link='" + link + '\'' +
                ", zonaId=" + zonaId +
                ", zona='" + zona + '\'' +
                '}';
    }
}
