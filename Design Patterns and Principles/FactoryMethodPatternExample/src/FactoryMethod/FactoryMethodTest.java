package FactoryMethod;

public class FactoryMethodTest {
	public static void main(String args[])
	{
		DocumentFactory wordFactory=new WordDocumentFactory();
		Document word=wordFactory.createDocument();
		
		DocumentFactory pdfFactory=new PdfDocumentFactory();
		Document pdf=pdfFactory.createDocument();
		
		DocumentFactory excelFactory=new ExcelDocumentFactory();
		Document excel=excelFactory.createDocument();
		System.out.println("Factory Method Pattern Example:");
		word.print();
		pdf.print();
		excel.print();
		
	}
}
