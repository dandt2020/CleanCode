package graphiceditor.after;

public class GraphicsEditor {
    private Bmp bmp = new Bmp();
    private Gif gif = new Gif();
    private Png png = new Png();
    private Jpg jpg = new Jpg();

    public void openFile(String fileName) throws Exception {
        String extension = fileName.substring(fileName.length() - 3);
        switch (extension) {
            case "bmp":
                bmp.openFile(fileName);
                break;
            case "gif":
                gif.openFile(fileName);
                break;
            case "png":
                png.openFile(fileName);
                break;
            case "jpg":
                jpg.openFile(fileName);
                break;
            default:
                throw (new Exception("Unknown file type"));
        }
    }
}
