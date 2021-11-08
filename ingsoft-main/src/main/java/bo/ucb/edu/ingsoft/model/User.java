package bo.ucb.edu.ingsoft.model;

public class User {
    private Integer idUser;
    private String userName;
    private Integer age;
    private float weight;
    private float height;
    private String email;
    private String password;
    private String status;
    private Transaction transaction;

    public User() {
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}

