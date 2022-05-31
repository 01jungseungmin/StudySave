package Q3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class FileManagement {
    LinkedList<File> fileArray = new LinkedList<File>();
    ArrayList<Log> logArray = new ArrayList<Log>();

    int logNum = 0;

    public void makeFile (String fileName, String fileLocation, String fileContent) throws CloneNotSupportedException {
        fileArray.add(new File(fileName, fileLocation, fileContent));

        logArray.add(new Log(logNum, "Log number("+ logNum + ") : Make file - " + fileName, fileArray));
        logNum++;
    }

    public void deletFile(String fileName) throws CloneNotSupportedException {
        Iterator<File> iterator = fileArray.iterator();
        boolean work = false;

        while (iterator.hasNext()) {
            File file = iterator.next();

            if (file.getFileName().equals(fileName)) {
                fileArray.remove(file);
                work = true;
            }
        }

        if(work) {
            logArray.add(new Log(logNum, "Log number("+ logNum + ") : Delet file - " + fileName, fileArray));
            logNum++;
        }
    }

    public ArrayList<String[]> searchFile(String fileName) {
        Iterator<File> iterator = fileArray.iterator();
        ArrayList<String[]> arrayList = new ArrayList<String[]>();

        if (fileName.isEmpty()) {
            for (File file : fileArray) {
                String[] stringArray = new String[3];
                
                stringArray[0] = file.getFileName();
                stringArray[1] = file.getFileLocation();
                stringArray[2] = file.getFileContent();

                arrayList.add(stringArray);
            }

            return arrayList;
        }

        while (iterator.hasNext()) {
            File file = iterator.next();
            
            if (file.getFileName().equals(fileName)) {
                String[] stringArray = new String[3];
                
                stringArray[0] = file.getFileName();
                stringArray[1] = file.getFileLocation();
                stringArray[2] = file.getFileContent();

                arrayList.add(stringArray);
            }
        }

        return arrayList;
    }

    public void reNameFile(String fileName, String reName) throws CloneNotSupportedException {
        boolean work = false;

        for (File file : fileArray) {
            if (file.getFileName().equals(fileName)) {
                work = true;
                file.setFileName(reName);
            }
        }

        if (work) {
            logArray.add(new Log(logNum, "Log number("+ logNum + ") : ReName file " + fileName, fileArray));
            logNum++;
        }
    }

    public void reContentFile(String fileName, String reContent) throws CloneNotSupportedException {
        boolean work = false;

        for (File file : fileArray) {
            if (file.getFileName().equals(fileName)) {
                work = true;
                file.setFileContent(reContent);
            }
        }

        if (work) {
            logArray.add(new Log(logNum, "Log number("+ logNum + ") : ReContent file " + fileName, fileArray));
            logNum++;
        }
    }

    public void reLocationFile(String fileName, String reLocation) throws CloneNotSupportedException {
        boolean work = false;

        for (File file : fileArray) {
            if (file.getFileName().equals(fileName)) {
                work = true;
                file.setFileLocation(reLocation);
            }
        }

        if (work) {
            logArray.add(new Log(logNum, "Log number("+ logNum + ") : ReLocation file " + fileName, fileArray));
            logNum++;
        }
    }

    public String[] logPrint() {
        ArrayList<String> arrayList = new ArrayList<>();

        for (Log log : logArray) {
            arrayList.add(log.getLogcontent());
        }

        return arrayList.toArray(new String[arrayList.size()]);
    }

    public String[] logPrint(String key) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (Log log : logArray) {
            if (log.getLogcontent().matches("(.*)" + key + "(.*)")) {
                arrayList.add(log.getLogcontent());
            }
        }

        return arrayList.toArray(new String[arrayList.size()]);
    }

    public void loadLog(int Num) throws CloneNotSupportedException {
        fileArray.clear();
        for (File file : logArray.get(Num).getFileState()) {
            fileArray.add(file.clone());
        }

        logArray.add(new Log(logNum, "Log number("+ logNum + ") : Load log " + Num, fileArray));
        logNum++;
    }
}
