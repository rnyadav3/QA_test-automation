import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("here iam at start ");
        System.setProperty("web.driver.chrome.driver","C:/Users/rnyad/Downloads/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://neverland.freshprints.com/dashboard/login");
        driver.findElement(By.id("form-email")).sendKeys("interns2022@freshprints.com");

        driver.findElement(By.id("form-password")).sendKeys("interns2022");

        driver.findElement(By.className("submit-container")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/ul/li[3]/a")).click();
        Thread.sleep(8000);
        try {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//span[contains(text(),'Create User')]//preceding-sibling::img")));
        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println("here iam ");
        Thread.sleep(6000);
        for(int i=1;i<=6;i++){
            WebElement pill= driver.findElement(By.xpath("/html/body/app-custom-overlay/div/div/div[2]/app-wizard-create-select/div/div["+i+"]"));

            if(pill.isDisplayed())
            {
                System.out.println(i);
            }
        }

        System.out.println("pills verified");

        // Printer.java

        driver.get("https://neverland.freshprints.com/dashboard/login");
        driver.findElement(By.id("form-email")).sendKeys("rupesh@freshpris.com");

        driver.findElement(By.id("form-password")).sendKeys("Rupesh@123");

        driver.findElement(By.className("submit-container")).click();
        driver.get("https://v4-qa.freshprints.com/dashboard/settings?login=$2a$10$P6vBSvVF2BqOId75Pm8YP.fytbBeUXISWjPpwhuFeENl6n90xL2IW");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div[2]/div[2]/div/div/app-settings/div/app-edit-user/div/div[2]/div/div[1]/app-contact-info/div/div[1]/div[2]/app-input/div/input")).clear();
        Thread.sleep(9000);

        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div[2]/div[2]/div/div/app-settings/div/app-edit-user/div/div[2]/div/div[1]/app-contact-info/div/div[1]/div[2]/app-input/div/input")).sendKeys("Rupesh Printer");
        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div[2]/div[2]/div/div/app-settings/div/app-edit-user/div/div[3]/div/app-button/button")).click();

        //Printer Edit Functionality Checked
 Thread.sleep(7000);
        //Proof.java
        driver.get("https://neverland.freshprints.com/dashboard/login");
        driver.findElement(By.id("form-email")).sendKeys("interns2022@freshprints.com");

        driver.findElement(By.id("form-password")).sendKeys("interns2022");

        driver.findElement(By.className("submit-container")).click();
        //logged in to v4
        Thread.sleep(8000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/ul/li[3]/a")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/div/a[1]/div")).click();
        Thread.sleep(1000);
        String str =  driver.findElement(By.xpath("/html/body/app-half-overlay/div/div/app-create-proof-wizard/div/div[2]/div/aw-wizard/div/aw-wizard-step[1]/div/div[1]")).getText();
        System.out.println(str);

        //Proof Done
        System.out.println("printer functionality checked");
        Thread.sleep(7000);
        //SearchBox

        driver.get("https://neverland.freshprints.com/dashboard/login");
        driver.findElement(By.id("form-email")).sendKeys("interns2022@freshprints.com");

        driver.findElement(By.id("form-password")).sendKeys("interns2022");

        driver.findElement(By.className("submit-container")).click();
        //login completed//
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/ul/li[3]/a")).click(); // navigate to user module
        Thread.sleep(10000);


        try {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='Rupesh'",driver.findElement(By.xpath("//*[@id=\"sticky-search-filter\"]/app-search-filter/div[1]/div/div/label/input")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Search Done
        Thread.sleep(7000);
        //Logout
        driver.get("https://neverland.freshprints.com/dashboard/login");
        driver.findElement(By.id("form-email")).sendKeys("interns2022@freshprints.com");

        driver.findElement(By.id("form-password")).sendKeys("interns2022");

        driver.findElement(By.className("submit-container")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/ul/li[3]/a")).click();//to user module
        Thread.sleep(7000);
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/app-navbar/nav/div/div[2]/div/ul/li/a/div[1]/span")).click();
        Thread.sleep(9000);
        String log = driver.findElement(By.xpath("//*[@id=\"userDropdownMenu\"]")).getText();
        System.out.println(log);
        if(log.equals("Logout")){

            driver.findElement(By.xpath("/html/body/app-root/app-full-layout/app-navbar/nav/div/div[2]/div/ul/li/div/a/div")).click();
        }
        else{
            System.out.println("else executed");
        }
        Thread.sleep(6000);
        String new_url =  driver.getCurrentUrl();
        System.out.println(new_url);
        if( new_url.equals("https://neverland.freshprints.com/dashboard/login") ){
            System.out.println("inside url ");
            System.out.println("true");
        }
        //logout Done

        System.out.println("same logout page done");
        Thread.sleep(6000);

        //UserUrl Verification

        String old_url1 = "https://neverland.freshprints.com/dashboard/orders";
        String old_url2 = "https://v4-qa.freshprints.com/dashboard/users";
        driver.get("https://neverland.freshprints.com/dashboard/login");
        driver.findElement(By.id("form-email")).sendKeys("interns2022@freshprints.com");

        driver.findElement(By.id("form-password")).sendKeys("interns2022");

        driver.findElement(By.className("submit-container")).click();

        Thread.sleep(10000);
        String new_url1 = driver.getCurrentUrl();
        if(new_url1.equals(old_url1)){
            System.out.println(new_url1);
            System.out.println("its order page");

        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/ul/li[3]/a")).click();//to user module
        Thread.sleep(10000);
        String new_url2 = driver.getCurrentUrl();

        if(new_url2.equals(old_url2))
        {
            System.out.println(new_url2);
            System.out.println("Its user module");
        }

        //User Url Done
        System.out.println("user url and order module done");
        Thread.sleep(7000);

        //full fill test

        driver.get("https://neverland.freshprints.com/dashboard/login");
        driver.findElement(By.id("form-email")).sendKeys("rupesh@ful.com");

        driver.findElement(By.id("form-password")).sendKeys("Rupesh@123");

        driver.findElement(By.className("submit-container")).click();
        /////logged in to v4
        Thread.sleep(4000);
        System.out.println("fulfilment center");

        // fulfiment done

        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://neverland.freshprints.com/dashboard/login");
        driver.findElement(By.id("form-email")).sendKeys("rupesh@campus.com");

        driver.findElement(By.id("form-password")).sendKeys("Rupesh@123");

        driver.findElement(By.className("submit-container")).click();
        //login completed//
        Thread.sleep(7000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/ul/li[3]/a/i")).click();
        String names ="";
        Thread.sleep(8000);
        names=  driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div[2]/div[2]/div/div/app-users-list/div/div[2]/app-search-filter/div[1]/div/label")).getText();
        if(names.equals("Clients")){
            System.out.println(names);

        }
        System.out.println("last case done");
        driver.close();
    }
}
