package graphiceditor.after;

public class Bmp implements IFile {
    public static final String EXTENSION = "bmp";
    private String fileOpenned;

    @Override
    public void openFile(String fileName) {
        fileOpenned = fileName;
        System.out.println(EXTENSION + ":  open " + fileName);
    }

    @Override
    public String getFileOpenned() {
        return fileOpenned;
    }

    @Override
    public void parseFile() {
        System.out.println(EXTENSION + ": parse");
    }

    @Override
    public void saveFile() {
        if (fileOpenned != null) {
            System.out.println(EXTENSION + ":  save");
        } else {
            System.out.println("Nothing to save");
        }
    }

}
