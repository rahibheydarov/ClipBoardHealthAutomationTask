package com.clipboardHealth.pages;

import com.clipboardHealth.customUtils.BrowserUtils;
import com.clipboardHealth.customUtils.DriverUtil;
import com.clipboardHealth.customUtils.WebDriverFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DodimLinks {

    public static void main(String[] args) throws IOException {

        //I have placed an excel file 'Test.xlsx' in my D Driver
        FileInputStream fis = new FileInputStream("src/undone_links.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
//        System.out.println(cell);
//        System.out.println(sheet.getRow(2).getCell(1));

        List<String> allLinks = new ArrayList<>();

        for (int i = 1; i < 1000; i++) {

            String cellValue = String.valueOf(sheet.getRow(i).getCell(1));
            allLinks.add(cellValue);


        }

        for (int j = 1; j < 10000; j++) {
            DriverUtil.getDriver().get(allLinks.get(j));
            BrowserUtils.sleep(1);
        }








        //String cellval = cell.getStringCellValue();
        //System.out.println(cellval);

    }
}

