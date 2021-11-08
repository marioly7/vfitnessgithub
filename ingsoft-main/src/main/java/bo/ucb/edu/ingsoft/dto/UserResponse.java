package bo.ucb.edu.ingsoft.dto;

public class UserResponse {
    private Integer idUser;
    private String userName;
    private Integer age;
    private float weight;
    private float height;
    private String email;
    private String password;
//    private String status;

    public UserResponse(Integer idUser, String userName, Integer age, String email, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public UserResponse() {
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
