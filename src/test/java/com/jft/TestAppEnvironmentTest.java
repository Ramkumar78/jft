package com.jft;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static com.jft.TestAppEnv;
import static com.jft.TestAppEnv.DOMAIN;
import static com.jft.TestAppEnv.PORT;
import static com.jft.TestAppEnv.getUrl;
//import static org.junit.Assert;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {

        Assert.assertEquals("Returns hard coded url","http://192.123.0.3:67",getUrl());
    }
@Test
    public void canGetDomainAndPortStatically(){
        Assert.assertEquals("Just the domain","192.123.0.3",DOMAIN);
        Assert.assertEquals("just the port","67",PORT);
}
}
