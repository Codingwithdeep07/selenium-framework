package dataproviders;

import org.testng.annotations.DataProvider;
import utilities.ExcelUtil;

public class TestDataProvider {
	
	public static final String TEST_DATA_PATH =
	        System.getProperty("user.dir")
	        + "/src/test/resources/testdata/LoginData.csv";

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return ExcelUtil.getTestData(
        		TEST_DATA_PATH,
                "Login");
    }
}