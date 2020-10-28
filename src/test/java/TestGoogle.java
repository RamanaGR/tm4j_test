import org.junit.Test;


  import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import com.adaptavist.tm4j.junit.annotation.TestCase;

public class TestGoogle {
        public static WebDriver driver;

        @BeforeClass
        public static void setUp()
        {
            System.setProperty("webdriver.opera.driver", "C:\\Users\\chinn\\IdeaProjects\\tm4j_Test\\operadriver.exe");
            driver=new OperaDriver();
            driver.get("https://www.google.com");
        }

        @Test
        @TestCase(key="BR-T1")
        public void test() {
            String title=driver.getTitle();
            assertEquals(title,"Google");
        }

        @AfterClass
        public static void tearDown()
        {
            driver.quit();
        }
}
