import org.junit.Test;

import java.util.ResourceBundle;

public class TestSuperTest {

    @Test
    public void superTestMethod() {
        System.out.println("junit something");
        System.out.println(System.getProperty("value1"));

        ResourceBundle rb = ResourceBundle.getBundle("config");
        System.out.println("VALUE = " + rb.getString("key1"));
    }
}