import org.junit.Test;

import java.util.ResourceBundle;

public class TestSuperHomeworkTest {

    @Test
    public void superHomeworkMethod(){
        String methodName = "superHomeworkMethod";

        System.out.println("--value1: "+System.getProperty("value1")+"\n");
        System.out.println("--value2: "+System.getProperty("value2")+"\n");
        if (System.getProperty("value1").equals(System.getProperty("value2"))){
            System.out.println("Assertion passed\n");
        } else {
            System.out.println("Assertion failed\n");
        }

        ResourceBundle rb = ResourceBundle.getBundle("config");
        System.out.println(rb.getString("key1"));
        System.out.println(rb.getString("key2"));

        System.out.println(String.format("This is the %s method", methodName));
        System.out.println("\nThe answer to passing multiple agrs is '-Dproperthy1=value1 -Dproperty2=value2'");
    }
}
