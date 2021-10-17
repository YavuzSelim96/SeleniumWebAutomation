import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage
{

    By IncreaseLocator=By.className("oq-up");
    By DeleteProductsButton=By.className("fa-trash-o");
    By UpdateCartAlert=By.id("StockMessages");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void AmountIncrease()
    {
        click(IncreaseLocator);


    }

    public void DeleteProducts()
    {

        click(DeleteProductsButton);

    }

   public boolean IsIncreased()
    {
      return IsDisplayed(UpdateCartAlert);
    }
}
