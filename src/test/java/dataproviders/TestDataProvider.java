package dataproviders;

import org.testng.annotations.DataProvider;

import utilities.CSVUtil;


public class TestDataProvider {
	
	public static final String TEST_DATA_PATH =
	        System.getProperty("user.dir")
	        + "/src/test/resources/testdata/LoginData.csv";

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

    	  return CSVUtil.getTestData(TEST_DATA_PATH);
    }
}