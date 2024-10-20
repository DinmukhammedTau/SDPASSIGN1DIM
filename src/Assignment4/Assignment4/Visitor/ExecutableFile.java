package Assignment4.Visitor;

public class ExecutableFile implements File {
    private String binaryData;

    public ExecutableFile(String binaryData) {
        this.binaryData = binaryData;
    }

    public String getBinaryData() {
        return binaryData;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.scanExecutableFile(this);
    }
}

