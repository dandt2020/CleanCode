package graphiceditor.after;

public interface IFile {
    public void openFile(String fileName);
    public String getFileOpenned();
    public void parseFile();
    public void saveFile();
}
