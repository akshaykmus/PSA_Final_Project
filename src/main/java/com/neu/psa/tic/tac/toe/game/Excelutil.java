/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.psa.tic.tac.toe.game;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 *
 * @author akshaykumthimatad
 */
public class Excelutil {


    public static double getData(int value1, int value2) {
        double value = 0;
        try {
            String path = "./src/main/java/com/neu/psa/tic/tac/toe/game/ExcelUtils/data.xlsx";
            XSSFWorkbook work = new XSSFWorkbook(path);
            XSSFSheet sheet = work.getSheet("Sheet1");
            value = sheet.getRow(value1).getCell(value2).getNumericCellValue();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //System.out.print(value);
        return value;
    }

    public static void writeData(int row, int col, int value){
       
        
        try {
             String path = "./src/main/java/com/neu/psa/tic/tac/toe/game/ExcelUtils/data.xlsx";
        XSSFWorkbook work = new XSSFWorkbook(path);
        XSSFSheet sheet = work.getSheet("Sheet1");
        sheet.getRow(row).getCell(col).setCellValue(value);
        FileOutputStream fos = new FileOutputStream(path);
        work.write(fos);
        fos.flush();
        fos.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.print(value);
    }

}
