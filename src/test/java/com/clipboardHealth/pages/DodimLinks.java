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

        FileInputStream fis = new FileInputStream("src/undone_links.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);


        List<String> allLinks = new ArrayList<>();

        for (int i = 1; i < 1000; i++) {

            String cellValue = String.valueOf(sheet.getRow(i).getCell(1));
            allLinks.add(cellValue);


        }

        for (int j = 1; j < 10000; j++) {
            DriverUtil.getDriver().get(allLinks.get(j));
            System.out.println("Hazirki link nomresi " +j);
            BrowserUtils.sleep(2);
        }








        //String cellval = cell.getStringCellValue();
        //System.out.println(cellval);

    }
}

