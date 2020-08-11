package org;

import java.io.File;
import java.util.List;

public class Read {
    public static void main(String[] args) {
        List<ExcelDataVO> excelDataVOS = ExeclRead.readExcel("C:\\Users\\78114\\Desktop\\test.xlsx");
        for(ExcelDataVO excelDataVO : excelDataVOS){
            System.out.println(excelDataVO.toString());
        }
    }
}
