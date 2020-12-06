package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityClass {
	public List<String> readBooksFromExcelFile(int sheetnum,String excelFilePath){
		List<String> listBooks = new ArrayList<>();
		try {
			
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet firstSheet = (Sheet) workbook.getSheetAt(sheetnum);
			Iterator<Row> iterator = firstSheet.iterator();
			while (iterator.hasNext()) {
				Row nextRow = iterator.next();
				Iterator<Cell> cellIterator = nextRow.cellIterator();
				List<String> data = new ArrayList<>();
				String Value="";
				while (cellIterator.hasNext()) {
					Cell nextCell = cellIterator.next();
					if(nextCell.getCellType()==CellType.NUMERIC) {
						DecimalFormat df = new DecimalFormat("#.##"); 
						Value=df.format(nextCell.getNumericCellValue());
					}
					if(nextCell.getCellType()==CellType.STRING) {
						Value=nextCell.toString();
					}
					if(!Value.isBlank())
						data.add(Value);
				}
				listBooks.add(data.toString());
			}

			workbook.close();
			inputStream.close();

			return listBooks;
		} catch (Exception e) {
			System.out.println(e);
		}
		return listBooks;
	}
	
	
	
	public String getDropdownExcelPath() {
		return "C:\\Users\\Pavan\\Desktop\\SQA-Assignment\\TradeMartLK-DropDownValues.xlsx";
	}
}
