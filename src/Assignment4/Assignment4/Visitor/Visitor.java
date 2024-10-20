package Assignment4.Visitor;

public interface Visitor {
    void scanTextFile(TextFile textFile);
    void scanExecutableFile(ExecutableFile executableFile);
}
