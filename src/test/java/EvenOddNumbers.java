import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EvenOddNumbers {

    public String even_or_odd(int number) {
        return (number % 2 == 0) ? "Even":"Odd";
}
// eto test
    @Test
    public void evenOddNumbers(){
        EvenOddNumbers obj = new EvenOddNumbers();
        Assert.assertEquals(obj.even_or_odd(6), "Even");
        Assert.assertEquals(obj.even_or_odd(7), "Odd");
    }

}
