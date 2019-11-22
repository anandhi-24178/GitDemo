package com.apex.samples;
import org.testng.annotations.Test;
import com.apex.samples.core.ApexBaseTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.testng.annotations.DataProvider;
import java.io.File;
import org.openqa.selenium.By;


	public class ECommLoginTest extends ApexBaseTest implements EcommLoginConstant
	{
		@DataProvider(name = "LoginSuccessIds")
		public Object [][] getDataForSuccessfulLogin(){
		//String[][] data = {
		//		{"test@gmail.com", "pwd"},
		//		{"test1@gmail.com", "pwd1"}
		//};
		String[][] data = getTableArray("google_ids.xls", "Sheet1","ecommercesuccessIds");
		return data;
		}
	  @Test ( dataProvider = "LoginSuccessIds")
	  public void testWithSuccessLogin(String emailId, String pwd) {
	  driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys(emailId);
	  driver.findElement(By.name( PASSWORD_NAME_LOCATOR)).sendKeys(pwd);
	  driver.findElement(By.linkText(LOGIN_BTN_LINK_TEXT_LOCATOR)).click();
		  }
	  @Test
	  public void testWithBlankLogin() {
	  }
	  @Test
	  public void testWithBlankPassword() {
	  }
	  @Test
	  public void testWithBothBlank() {
	  }
	  @Test
	  public void testWithInvalidLogin() {
	  }
	 
	  
	  public String[][] getTableArray(String xlFilePath, String sheetName, String tableName){
	      String[][] tabArray=null;
	      try{
	          Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
	          Sheet sheet = workbook.getSheet(sheetName);
	          int startRow,startCol, endRow, endCol,ci,cj;
	          Cell tableStart=sheet.findCell(tableName);
	          startRow=tableStart.getRow();
			  startCol=tableStart.getColumn();
			  Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                               
			  endRow=tableEnd.getRow();
			  endCol=tableEnd.getColumn();
			  System.out.println("startRow="+startRow+", endRow="+endRow+", " +
			                  "startCol="+startCol+", endCol="+endCol);
			  tabArray=new String[endRow-startRow-1][endCol-startCol-1];
			  ci=0;
			
			  for (int i=startRow+1;i<endRow;i++,ci++){
			  cj=0;
			  for (int j=startCol+1;j<endCol;j++,cj++){
			  tabArray[ci][cj]=sheet.getCell(j,i).getContents();
			  }
			  }
	          } catch (Exception e)    {
			    System.out.println("error in getTableArray()");
			    }
			
			  return(tabArray);
			  }
			
	
	}
