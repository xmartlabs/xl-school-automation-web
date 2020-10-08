package com.xlschool.Test.Tests;

import com.xlschool.Utils.Logs.*;
import org.testng.annotations.Test;

import static com.xlschool.Utils.Logs.Log.*;

public class SimpleTest {

    @Test
    public void navigateToGoogle(){

        debug(this.getClass(),"Test message to log somewhere");
        error(this.getClass(),"Test message to log somewhere");
        info(this.getClass(),"Test message to log somewhere");
        warn(this.getClass(),"Test message to log somewhere");
        fatal(this.getClass(),"Test message to log somewhere");

    }
}
