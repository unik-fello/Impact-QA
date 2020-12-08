package EnvVariables;

public class Config 
{
	// we can add final but nobody's gonna change it in runtime! so to Optimize.
	public static String path = System.getProperty("user.dir");  
	public static String chromePath = path + "\\drivers\\chromedriver_win32\\chromedriver.exe";
	public static String url = "http://www.zomato.com/ncr";
	public static String excelPath = path + "\\Excel\\zomatoExcel.xlsx";
}
