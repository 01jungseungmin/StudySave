package Q3;

public class File implements Cloneable{

    private String fileName;
    private String fileLocation;
    private String fileContent;

    public File(String fileName, String fileLocation, String fileContent){
        this.fileName = fileName;
        this.fileLocation = fileLocation;
        this.fileContent = fileContent;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    protected File clone() throws CloneNotSupportedException {
        return (File) super.clone();
    }

}
