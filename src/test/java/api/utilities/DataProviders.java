package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name = "data")
	public String[][] getAllData() throws IOException{
		
		String path = System.getProperty("user.dir")+"//TestData//Userdata.xlsx";
		
		ExcelUtility excel =new ExcelUtility(path);
		
		int rowCount = excel.getRowCount("Sheet1");
		int colCount = excel.getCellCount("Sheet1", 1);
		
		String[][] apiData = new String [rowCount][colCount];
		
		for (int i =1 ; i<=rowCount ; i++) {
			for (int j =0; j<colCount;j++) {
				
				apiData[i-1][j]= excel.getCellData("Sheet1", i, j);
				
			}
		}
		
		return apiData;
		
		
	}
	
	@DataProvider(name = "userNames")
	public String[] getUserNames() throws IOException{
		
		String path = System.getProperty("user.dir")+"//TestData//Userdata.xlsx";
		
		ExcelUtility excel =new ExcelUtility(path);
		
		int rowCount = excel.getRowCount("Sheet1");
		int colCount = excel.getCellCount("Sheet1", 1);
		
		String[] userNames = new String [rowCount];
		
		int colIndex = -1;
		
		for (int j =0; j<colCount;j++) {
				
				if(excel.getCellData("Sheet1", 0, j).equalsIgnoreCase("UserName")) {
					
					colIndex = j;
					break;
					
				}
			}

		if (colIndex == -1) {
            throw new RuntimeException("UserName column not found in sheet!");
        }
		
		for (int i =1 ; i<=rowCount ; i++) {
			
			userNames[i-1] = excel.getCellData("Sheet1", i, colIndex);
		}	
	
		return userNames;
		
		
		
	}

}
