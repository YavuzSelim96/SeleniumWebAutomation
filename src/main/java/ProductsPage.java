import org.openqa.selenium.*;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage
{
    By Scrollpage= By.cssSelector("body");
    By MoreItemLocator=By.className("lazy-load-text");
    By AllProducts=By.className("a_model_item");

    public ProductsPage(WebDriver driver) {
        super(driver);


    }

    public void MoreProduct()
    {
       find(Scrollpage).sendKeys(Keys.CONTROL,Keys.END);
       click(MoreItemLocator);


    }


    public void Randomselect()
    {


        Random r= new java.util.Random();
        List<WebElement>links=driver.findElements(AllProducts);
        WebElement randomElement=links.get(r.nextInt(links.size()));
        randomElement.click();




    }
   /* private List<WebElement>GetAllProducts()
    {
        return findAll(AllProducts);
    }*/


}
