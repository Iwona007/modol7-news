package iwona.pl.modol7news.model;

import com.fasterxml.jackson.annotation.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "type",
        "sectionId",
        "sectionName",
        "webPublicationDate",
        "webTitle",
        "webUrl",
        "apiUrl",
        "isHosted",
        "pillarId",
        "pillarName"
})
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("sectionId")
    private String sectionId;
    @JsonProperty("sectionName")
    private String sectionName;
    @JsonProperty("webPublicationDate")
    private String webPublicationDate;
    @JsonProperty("webTitle")
    private String webTitle;
    @JsonProperty("webUrl")
    private String webUrl;
    @JsonProperty("apiUrl")
    private String apiUrl;
    @JsonProperty("isHosted")
    private Boolean isHosted;
    @JsonProperty("pillarId")
    private String pillarId;
    @JsonProperty("pillarName")
    private String pillarName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private long resId;

    public Result(long resId, String type, String sectionName, String webTitle, String webUrl) {
        this.resId = resId;
        this.type = type;
        this.sectionName = sectionName;
        this.webTitle = webTitle;
        this.webUrl = webUrl;
    }

    public Result(long resId,  String webUrl) {
        this.resId = resId;
        this.webUrl = webUrl;
    }

    public Result(String type, String sectionName, String webPublicationDate, String webTitle, String webUrl) {
        this.type = type;
        this.sectionName = sectionName;
        this.webPublicationDate = webPublicationDate;
        this.webTitle = webTitle;
        this.webUrl = webUrl;
    }

    public Result() {
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("sectionId")
    public String getSectionId() {
        return sectionId;
    }

    @JsonProperty("sectionId")
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    @JsonProperty("sectionName")
    public String getSectionName() {
        return sectionName;
    }

    @JsonProperty("sectionName")
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @JsonProperty("webPublicationDate")
    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    @JsonProperty("webPublicationDate")
    public void setWebPublicationDate(String webPublicationDate) {
        this.webPublicationDate = webPublicationDate;
    }

    @JsonProperty("webTitle")
    public String getWebTitle() {
        return webTitle;
    }

    @JsonProperty("webTitle")
    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    @JsonProperty("webUrl")
    public String getWebUrl() {
        return webUrl;
    }

    @JsonProperty("webUrl")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @JsonProperty("apiUrl")
    public String getApiUrl() {
        return apiUrl;
    }

    @JsonProperty("apiUrl")
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @JsonProperty("isHosted")
    public Boolean getIsHosted() {
        return isHosted;
    }

    @JsonProperty("isHosted")
    public void setIsHosted(Boolean isHosted) {
        this.isHosted = isHosted;
    }

    @JsonProperty("pillarId")
    public String getPillarId() {
        return pillarId;
    }

    @JsonProperty("pillarId")
    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    @JsonProperty("pillarName")
    public String getPillarName() {
        return pillarName;
    }

    @JsonProperty("pillarName")
    public void setPillarName(String pillarName) {
        this.pillarName = pillarName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Result{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", sectionId='" + sectionId + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", webPublicationDate='" + webPublicationDate + '\'' +
                ", webTitle='" + webTitle + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", apiUrl='" + apiUrl + '\'' +
                ", isHosted=" + isHosted +
                ", pillarId='" + pillarId + '\'' +
                ", pillarName='" + pillarName + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    public long getResId() {
        return resId;
    }

    public void setResId(long resId) {
        this.resId = resId;
    }
}
