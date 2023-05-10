package org.example;

import org.testng.annotations.BeforeSuite;

public class SuiteSetup {
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        System.out.println();
    }
}
