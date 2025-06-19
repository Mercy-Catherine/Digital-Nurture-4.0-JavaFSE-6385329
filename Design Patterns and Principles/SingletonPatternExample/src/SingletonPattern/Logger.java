package SingletonPattern;

public class Logger {
	private static Logger instance;
	private Logger() {
		System.out.println("Private Constructor");
	}
	public static Logger getInstance()
	{
		if(instance == null)
		{
			instance = new Logger();
		}
		return instance;
	}
	public static void showMessage()
	{
		System.out.println("This is a Singleton Pattern Class");
	}
}
