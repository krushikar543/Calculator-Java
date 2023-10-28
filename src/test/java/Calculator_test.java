import com.sample.Main;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class Calculator_test {
    private Main calculator;
    @Before
    public void setUp(){
        calculator = new Main();
    }
    @Test
    public void Test_add_positive(){
        int a = 113;
        int b = 45;
        int expRes = 158;
        Assert.assertEquals(expRes, calculator.add(a, b));
    }   
    @Test
    public void Test_add_negative(){
        int a = 45;
        int b = -57;
        int expRes = -12;
        Assert.assertEquals(expRes, calculator.add(a, b));
    }
    @Test
    public void Test_sub_positive(){
        int a = 45;
        int b = 57;
        int expRes = -12;
        Assert.assertEquals(expRes, calculator.sub(a, b));
    }
    @Test
    public void Test_sub_negative(){
        int a = 45;
        int b = -57;
        int expRes = 102;
        Assert.assertEquals(expRes, calculator.sub(a, b));
    }
    @Test
    public void Test_mul_positive(){
        int a = 5;
        int b = 9;
        int expRes = 45;
        Assert.assertEquals(expRes, calculator.mul(a, b));
    }
    @Test
    public void Test_mul_negative(){
        int a = 45;
        int b = -5;
        int expRes = -180;
        Assert.assertEquals(expRes, calculator.mul(a, b));
    }
    @Test
    public void Test_div_positive(){
        int a = 45;
        int b = 5;
        int expRes = 9;
        Assert.assertEquals(expRes, calculator.div(a, b));
    }
    @Test
    public void Test_div_negative(){
        int a = 6;
        int b = -2;
        int expRes = -3;
        Assert.assertEquals(expRes, calculator.div(a, b));
    }
}
