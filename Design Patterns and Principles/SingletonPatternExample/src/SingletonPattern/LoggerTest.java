package SingletonPattern;

public class LoggerTest {
	public static void main(String args[])
	{
		Logger loggerInstance1=Logger.getInstance();
		Logger loggerInstance2=Logger.getInstance();
		if(loggerInstance1 == loggerInstance2)
		{
			System.out.println("Logger class follows Singleton design pattern: It has only one instance");
		}
		else
		{
			System.out.println("Logger class doesn't follow Singleton design pattern");
		}
	}
	
}
