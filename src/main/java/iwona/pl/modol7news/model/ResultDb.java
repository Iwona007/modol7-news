package iwona.pl.modol7news.model;

public class ResultDb {

    private long resId;
    private String type;
    private String sectionName;
    private String webTitle;
    private String webUrl;

    public ResultDb(long resId, String type, String sectionName, String webTitle, String webUrl) {
        this.resId = resId;
        this.type = type;
        this.sectionName = sectionName;
        this.webTitle = webTitle;
        this.webUrl = webUrl;
    }

    public ResultDb(String type, String sectionName, String webTitle, String webUrl) {
        this.type = type;
        this.sectionName = sectionName;
        this.webTitle = webTitle;
        this.webUrl = webUrl;
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

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
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
