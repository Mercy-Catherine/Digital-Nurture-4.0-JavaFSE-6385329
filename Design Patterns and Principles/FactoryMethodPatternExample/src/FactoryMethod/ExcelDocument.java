package FactoryMethod;

public class ExcelDocument extends Document {
	@Override
	public void print()
	{
		System.out.println("This is a Excel document");
	}
}