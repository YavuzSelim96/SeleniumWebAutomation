import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage
{

    SearchBox searchBox;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);

    }



    public SearchBox searchBox()
    {
        return this.searchBox;
    }


}
