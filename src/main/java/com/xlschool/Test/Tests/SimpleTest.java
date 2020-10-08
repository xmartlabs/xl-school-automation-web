package Tests;

import com.xlschool.Utils.Logs.*;
import org.testng.annotations.Test;

import static com.xlschool.Utils.Logs.Log.*;

public class SimpleTest {

    @Test
    public void navigateToGoogle(){

        debug("tests-actions","Test message to log somewhere");
        error("selenium-actions","Test message to log somewhere");
        info("common-actions","Test message to log somewhere");
        warn("tests-actions","Test message to log somewhere");
        trace("common-actions","Test message to log somewhere");

    }
}
