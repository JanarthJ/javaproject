package dependencyInversion;

//high level
interface StatementGeneration{
	void generateStatement();
}

//statement generation 1
class PDFStatementGenerationDIP implements StatementGeneration{
	@Override
	public void generateStatement() {
		// TODO Auto-generated method stub
		System.out.println("PDF");		
	}
}
//statement generation 2
class WordStatementGenerationDIP implements StatementGeneration{
	@Override
	public void generateStatement() {
		// TODO Auto-generated method stub
		System.out.println("Word");
	}
}

//low level
//class Statement Genarator
class StatementGenaratorDIPService{
	private StatementGeneration st;
	public StatementGenaratorDIPService(StatementGeneration generator) {
		this.st  =  generator;
	}
	public void generateStatementDIP() {
		st.generateStatement();
	}
}

public class NonViolatingDIP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instance for both class 
		StatementGeneration pdfGen =  new PDFStatementGenerationDIP();
		StatementGeneration wordGen =  new WordStatementGenerationDIP();
		
		StatementGenaratorDIPService genService  = new StatementGenaratorDIPService(wordGen);
		genService.generateStatementDIP();
	}

}
