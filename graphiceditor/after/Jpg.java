package graphiceditor.after;

public class Jpg implements IFile {
    public static final String EXTENSION = "jpg";
    private String fileOpenned;

    @Override
    public void openFile(String fileName) {
        fileOpenned = fileName;
        System.out.println(EXTENSION + ":  openF " + fileName);
    }

    @Override
    public String getFileOpenned() {
        return fileOpenned;
    }

    @Override
    public void parseFile() {
        System.out.println(EXTENSION + ": readF");
    }

    @Override
    public void saveFile() {
        if (fileOpenned != null) {
            System.out.println(EXTENSION + ":  saveF");
        } else {
            System.out.println("Nothing to save");
        }
    }

}
