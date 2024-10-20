package Assignment4.Template;

public abstract class QualityCheck {
    public final void performCheck() {
        checkAppearance();
        checkCharacteristics();
        generateReport();
    }

    private void checkAppearance() {
        System.out.println("The appearance inspection was successful");
    }

    protected abstract void checkCharacteristics();

    private void generateReport() {
        System.out.println("A report has been created for the product.");
    }
}

