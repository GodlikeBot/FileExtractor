package FileExtractor;

public class Main {

    public static void main(final String[] args) {

        boolean useGui = false;

        if (useGui) {
            MainFrame.getInstance();
        }
        else {
            final Settings settings = new Settings();
            Controller controller = new Controller();
            controller.startProcess(settings.getExtractionPath(), settings.getSeriesPath());
        }
    }
}
