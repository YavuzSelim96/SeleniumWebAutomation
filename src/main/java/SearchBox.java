import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage
{
        By searchBoxLocator= By.className("searchBox");
        By searchButtonLocator=By.className("searchButton");

        public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text)
    {
        click(searchBoxLocator);
        type(searchBoxLocator,text);
        click(searchButtonLocator);
    }
}
