package FactoryMethod;

public class PdfDocument extends Document {
	@Override
	public void print()
	{
		System.out.println("This is a Pdf document");
	}
}