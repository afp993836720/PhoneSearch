package com.offcn.database;

import com.offcn.dao.MDao;
import com.offcn.pojo.Mobile;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

/**
 * @Author afp
 * @date 2018/10/11--21:04
 */
public class ImportExcelToDataBase {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-dao.xml");

        MDao bean = ac.getBean(MDao.class);

        Workbook workbook = WorkbookFactory.create(new File("D:\\code\\Mobile.xls"));
        System.out.println(workbook);
        int numberOfSheets = workbook.getNumberOfSheets();
        for (int i = 0; i < numberOfSheets; i++) {
            Sheet sheetAt = workbook.getSheetAt(i);
            int rows = sheetAt.getPhysicalNumberOfRows();
            for (int i1 = 0; i1 < rows; i1++) {
                if (i1==0){
                    continue;
                }
                Row row = sheetAt.getRow(i1);
                Mobile mobile = new Mobile();
                mobile.setNumber(row.getCell(1).getStringCellValue());
                mobile.setArea(row.getCell(2).getStringCellValue());
                mobile.setType(row.getCell(3).getStringCellValue());
                mobile.setAreacode(row.getCell(4).getStringCellValue());
                mobile.setPostcode(row.getCell(5).getStringCellValue());
                bean.save(mobile);
                System.out.println(mobile);
            }
        }
        workbook.close();
    }
}
