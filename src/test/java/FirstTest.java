import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {


    @Test
    public void FirstTest(){
        System.out.println("Hello first test");
        boolean a = true;
        Assert.assertTrue(a);
    }


    @Test
    public void SecondTest(){
        System.out.println("Hello second test");
        String b = "Test";
        Assert.assertEquals(b, "Test");
    }
}
