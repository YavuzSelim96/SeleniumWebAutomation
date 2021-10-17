import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Login_AddProduct extends BaseTest
{

    HomePage homepage;
   // LoginPage loginpage;
    ProductsPage productspage;
    ProductDetailPage productdetailpage;
    CartPage cartpage;



    @Test
    @Order(1)
    public void Search()
    {
        homepage=new HomePage(driver);
        homepage.searchBox().search("pantolan");

    }

   @Test
   @Order(2)
    public void MoreItems()
    {
        productspage=new ProductsPage(driver);
        productspage.MoreProduct();
        productspage.Randomselect();


    }



    @Test
    @Order(3)
    public void AddProductToCart()
    {
        productdetailpage=new ProductDetailPage(driver);
        productdetailpage.SelectSize(1068);
        productdetailpage.AddProduct();



    }


    @Test
    @Order(4)
    public void IncreaseItem()
    {
     cartpage=new CartPage(driver);
     cartpage.AmountIncrease();
     //   Assertions.assertTrue(cartpage.IsIncreased(),"Not Increased");  //Sepetteki ürün sayısının artışı kontrolü
    }

    @Test
    @Order(5)
    public void DeleteProducts()
    {

        cartpage.DeleteProducts();

    }

}
