package Assignment4.Visitor;

public class AntivirusVisitor implements Visitor {
    @Override
    public void scanTextFile(TextFile textFile) {
        System.out.println("Checking the text file for prohibited words. " + textFile.getContent());
    }

    @Override
    public void scanExecutableFile(ExecutableFile executableFile) {
        System.out.println("Scanning the executable for malware. " + executableFile.getBinaryData());
    }
}

