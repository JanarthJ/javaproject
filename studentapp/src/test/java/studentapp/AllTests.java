package studentapp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClientTest.class, DaoTest.class, ServiceTesting.class })
public class AllTests {

}
