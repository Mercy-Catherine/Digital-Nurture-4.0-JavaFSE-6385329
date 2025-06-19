package FactoryMethod;

public class WordDocument extends Document {
	@Override
	public void print()
	{
		System.out.println("This is a Word document");
	}
}
