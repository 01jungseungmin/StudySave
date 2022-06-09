package testQ1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Document {
    Date now = new Date();
    SimpleDateFormat dayf = new SimpleDateFormat("yyyyMMdd");

    private String day = dayf.format(now).toString();
    private String name;
    private String content;

    public Document(String day, String name, String content) {
        this.day = day;
        this.name = name;
        this.content = content;
    }

    public Document(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getDay() {
        return day;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
