package solidprinciples;

//abstract class AllShape {
//    public abstract double area();
//}
//
//class Rectangles extends AllShape {
//    private double width;
//    private double height;
//
//    public Rectangles(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double area() {
//        return width * height;
//    }
//}
//
//class CircleSp extends AllShape {
//    private double radius;
//
//    public CircleSp(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double area() {
//        return Math.PI * radius * radius;
//    }
//}

//class Bird { //parent
//    public void Eat() {
//        System.out.println("This bird can eat.");
//    }
//
//    public void fly() {
//        System.out.println("This bird can fly.");
//    }
//}
//class Parrot extends Bird { //child
//}
//
//class Penguin extends Bird { //child
//    @Override
//    public void fly() {
////        throw new Exception("Penguins cannot fly");
//    	System.out.println("Penguins cannot fly.");
//    }
//}

//abstract class   Bird{
//    public void Eat() {
//        System.out.println("This bird can eat.");
//    }
//    public abstract void move();
//}
//
//class Parrot extends Bird {
//	public void move() {
//        System.out.println("Parrot can fly.");
//    }
//}
//
//class Penguin extends Bird{
//	public void move() {
//        System.out.println("Penguin can fly.");
//    }
//}\

//interface Worker {
//    void work();
//    void manage();
//}
//
//class RegularEmployee implements Worker {
//    @Override
//    public void work() {
//        System.out.println("Regular employee is working");
//    }
//
//    @Override
//    public void manage() {
//        // Regular employee cannot manage
//        throw new UnsupportedOperationException("Regular employee cannot manage");
//    }
//}
//
//class Manager implements Worker {
//    @Override
//    public void work() {
//        System.out.println("Manager is working");
//    }
//
//    @Override
//    public void manage() {
//        System.out.println("Manager is managing");
//    }
//}

//interface ReportGenerator {
//    void generateReport();
//}
//
//class PDFReportGenerator implements ReportGenerator {
//    public void generateReport() {
//        // PDF generation logic
//    }
//}
//
//class HTMLReportGenerator implements ReportGenerator {
//    public void generateReport() {
//        // HTML generation logic
//    }
//}
//
//class ReportService {
//    private ReportGenerator reportGenerator;
//
//    public ReportService(ReportGenerator generator) {
//        this.reportGenerator = generator;
//    }
//
//    public void generateReport() {
//        reportGenerator.generateReport();
//    }
//}

public class LSP {
	
//	public static void main(String args[]) {

		// Creating instances of report generators
//        ReportGenerator pdfReportGenerator = new PDFReportGenerator();
//        ReportGenerator htmlReportGenerator = new HTMLReportGenerator();
//
//        // Creating report service instances with different generators
//        ReportService pdfReportService = new ReportService(pdfReportGenerator);
//        ReportService htmlReportService = new ReportService(htmlReportGenerator);
//
//        // Generating reports
//        pdfReportService.generateReport();
//        htmlReportService.generateReport();
        
	
        
//		AllShape rectangle = new Rectangles(5.0, 4.0);
//		CircleSp circle = new CircleSp(2.0);
//        System.out.println(rectangle.area()); 
//        System.out.println(circle.area()); 
//	}
}
