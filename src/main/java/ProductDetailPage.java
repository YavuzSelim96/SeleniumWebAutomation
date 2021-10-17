import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends BasePage
{

    By SizeLocator=By.tagName("a");
    By AddtoCartButtonLocator=By.id("pd_add_to_cart");
    By CartButton= By.className("header-cart");





    public ProductDetailPage(WebDriver driver)
    {
        super(driver);
    }

    public void SelectSize(int i)
    {

        getAllSize().get(i).click();

    }

    public void AddProduct()
    {

        click(AddtoCartButtonLocator);
        click(CartButton);


    }


    private List<WebElement> getAllSize()
    {
        return findAll(SizeLocator);
    }



}
