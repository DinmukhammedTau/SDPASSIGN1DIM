package Assignment4.Visitor;

public class ReportVisitor implements Visitor {
    @Override
    public void scanTextFile(TextFile textFile) {
        System.out.println("Generating report for text file: " + textFile.getContent());
    }

    @Override
    public void scanExecutableFile(ExecutableFile executableFile) {
        System.out.println("Generating a report for the executable file. " + executableFile.getBinaryData());
    }
}
