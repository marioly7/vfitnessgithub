package bo.ucb.edu.ingsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BuscarGoogleTest {

    private WebDriver driver;

    public void setDriver() throws Exception{
        String path = "C:\\Users\\Marioly\\Desktop\\chromedriver94.exe";

        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();

    }


    public String paginaPrincipalGoogle(String text) throws Exception {
        //Preparacionn de la prueba
        setDriver();
        String traductorUrl  = "https://translate.google.com/?hl=es&sl=en&tl=es&text=";
        traductorUrl+=text+"&op=translate";
        String googleUrl = "https://www.google.com";
        driver .get(traductorUrl);

        //Logica de la prueba

        //1. Capturar campo de texto o busqueda
        //WebElement campoDeBusqueda = driver.findElement(By.name("q"));
        //2. Escribir el criterio de busqueda
        //campoDeBusqueda.sendKeys("UCB");
        //3. Mandar Peticion (click)
        //campoDeBusqueda.submit();

        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //*[@id="yDmH0d"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[5]/div/div[1]/span[1]/span/span
        //Verificacion o Assert
        WebElement resultado = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[5]/div/div[1]/span[1]/span/span"));
        String label = resultado.getText();
        System.out.println("resultado de la busqueda "+label);
        closeDriver();
        return label;
    }


    public void closeDriver() throws Exception{
        driver.quit();
    }
}
