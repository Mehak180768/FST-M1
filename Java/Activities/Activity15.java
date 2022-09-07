package com.ibm.activities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {

    static String FILE_NAME = "TestSheet.xlsx";

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DataTypes in Java");

        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };

        int rownum = 0;

        for( Object[] datatype: datatypes){
           XSSFRow row = sheet.createRow(rownum++);

           int cellnum = 0;

           for (Object cellvalue:datatype){
               XSSFCell cell = row.createCell(cellnum++);

               if (cellvalue instanceof String)
                   cell.setCellValue((String)cellvalue);

               else if (cellvalue instanceof Integer)
                   cell.setCellValue(((Integer) cellvalue));
           }
        }

        try {
            FileOutputStream file = new FileOutputStream(new File(FILE_NAME));

            workbook.write(file);
        } catch(FileNotFoundException e){
            System.out.println("The file wasn't found.");
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
