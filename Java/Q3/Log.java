package Q3;

import java.util.LinkedList;

public class Log {
    private int logNum;
    private String logcontent;

    private LinkedList<File> fileState = new LinkedList<File>();

    public Log(int logNum, String logcontent, LinkedList<File> fileState) throws CloneNotSupportedException{
        this.logNum = logNum;
        this.logcontent = logcontent;
        for (File file : fileState) {
            this.fileState.add(file.clone());
        }
    }

    public int getLogNum() {
        return logNum;
    }

    public String getLogcontent() {
        return logcontent;
    }

    public LinkedList<File> getFileState() {
        return fileState;
    }
}
