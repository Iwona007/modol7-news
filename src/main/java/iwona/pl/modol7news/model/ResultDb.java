package iwona.pl.modol7news.model;

import java.net.URL;

public class ResultDb {

    private long resId;
    private String type;
    private String sectionName;
    private String webTitle;
    private URL webUrl1;

    public ResultDb(long resId, String type, String sectionName, String webTitle,  URL webUrl1) {
        this.resId = resId;
        this.type = type;
        this.sectionName = sectionName;
        this.webTitle = webTitle;
        this.webUrl1 = webUrl1;
    }

    public ResultDb(String type, String sectionName, String webTitle,  URL webUrl1) {
        this.type = type;
        this.sectionName = sectionName;
        this.webTitle = webTitle;
        this.webUrl1 = webUrl1;
    }

        public ResultDb() {
    }

    public long getResId() {
        return resId;
    }

    public void setResId(long resId) {
        this.resId = resId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public  URL getWebUrl1() {
        return webUrl1;
    }

    public void setWebUrl1( URL webUrl) {
        this.webUrl1 = webUrl1;
    }

    @Override
    public String toString() {
        return "ResultBD{" +
                "resId=" + resId +
                ", type='" + type + '\'' +
                ", sectionName='" + sectionName + '\'' +
                '}';
    }
}
