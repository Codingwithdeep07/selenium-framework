package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    public static Object[][] getTestData(String filePath, String sheetName) {

        Object[][] data = null;

        try {
            FileInputStream fis = new FileInputStream(filePath);

            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            int rows = sheet.getLastRowNum();
            int cols = sheet.getRow(0).getLastCellNum();

            data = new Object[rows][cols];

            for (int i = 1; i <= rows; i++) {

                for (int j = 0; j < cols; j++) {

                    data[i - 1][j] =
                        sheet.getRow(i).getCell(j).toString();
                }
            }

            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}