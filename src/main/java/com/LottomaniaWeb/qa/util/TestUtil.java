package com.LottomaniaWeb.qa.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.LottomaniaWeb.qa.base.TestBase;

public class TestUtil extends TestBase{
	public static long  PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 50;
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	public class XLUtility {

		public FileInputStream fi;
		public FileOutputStream fo;
		public XSSFWorkbook workbook;
		public XSSFSheet sheet;
		public XSSFRow row;
		public XSSFCell cell;
		public CellStyle style;   
		String path;
		
		public XLUtility(String path2)
		{
			this.path=path;
		}
			
		public int getRowCount(String sheetName) throws IOException 
		{
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet(sheetName);
			int rowcount=sheet.getLastRowNum();
			((WebDriver) workbook).close();
			fi.close();
			return rowcount;		
		}
		

		public int getCellCount(String sheetName,int rownum) throws IOException
		{
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet(sheetName);
			row=sheet.getRow(rownum);
			int cellcount=row.getLastCellNum();
			((WebDriver) workbook).close();
			fi.close();
			return cellcount;
		}
		
		
		public String getCellData(String sheetName,int rownum,int colnum) throws IOException
		{
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet(sheetName);
			row=sheet.getRow(rownum);
			cell=row.getCell(colnum);
			
			DataFormatter formatter = new DataFormatter();
			String data;
			try{
			data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
			}
			catch(Exception e)
			{
				data="";
			}
			((WebDriver) workbook).close();
			fi.close();
			return data;
		}
		
		public void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
		{
			File xlfile=new File(path);
			if(!xlfile.exists())    // If file not exists then create new file
			{
			workbook=new XSSFWorkbook();
			fo=new FileOutputStream(path);
			workbook.write(fo);
			}
					
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
				
			if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
				workbook.createSheet(sheetName);
			
			sheet=workbook.getSheet(sheetName);
						
			if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
					sheet.createRow(rownum);
			row=sheet.getRow(rownum);
			
			cell=row.createCell(colnum);
			cell.setCellValue(data);
			fo=new FileOutputStream(path);
			workbook.write(fo);		
			((WebDriver) workbook).close();
			fi.close();
			fo.close();
		}
		
		
		public void fillGreenColor(String sheetName,int rownum,int colnum) throws IOException
		{
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet(sheetName);
			
			row=sheet.getRow(rownum);
			cell=row.getCell(colnum);
			
			style=workbook.createCellStyle();
			
			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			
					
			cell.setCellStyle(style);
			workbook.write(fo);
			((WebDriver) workbook).close();
			fi.close();
			fo.close();
		}
		
		
		public void fillRedColor(String sheetName,int rownum,int colnum) throws IOException
		{
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet(sheetName);
			row=sheet.getRow(rownum);
			cell=row.getCell(colnum);
			
			style=workbook.createCellStyle();
			
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
			
			
			cell.setCellStyle(style);		
			workbook.write(fo);
			((WebDriver) workbook).close();
			fi.close();
			fo.close();
		}}}
		