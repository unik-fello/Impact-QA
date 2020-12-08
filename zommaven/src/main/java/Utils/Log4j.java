package Utils;

import org.apache.log4j.Logger;

public class Log4j 
{	
	static Logger logger;
	public static Logger log() 
	{
		logger = Logger.getLogger("zomato");
		return logger;
	}
}
