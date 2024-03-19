package dependencyInversion;


// statement generation 1
class PDFStatementGeneration{
	public void generatePDF() {
		System.out.println("PDF");
	}
}
//statement generation 2
class WordStatementGeneration{
	public void generateWord() {
		System.out.println("Word");
	}
}
//class Statement Genarator
class StatementGenarator{
	private PDFStatementGeneration pdf;
	private WordStatementGeneration word;
	public StatementGenarator() {
		pdf = new PDFStatementGeneration();
		word =  new WordStatementGeneration();
	}
	
	public void generateByPDF() {
		pdf.generatePDF();
	}
	public void generateByWord() {
		word.generateWord();
	}
}

public class ViolatingDIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
