package bean;

public class GeographicArea {
    private Integer geographicAreaID;
    private String code;
    private String level;
    private String name;
    private String alternativeCode;

    public Integer getGeographicAreaID() {
        return geographicAreaID;
    }

    public void setGeographicAreaID(Integer geographicAreaID) {
        this.geographicAreaID = geographicAreaID;
    }

    //Code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


//Level
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


//Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//Alternative Code
    public String getAlternativeCode() {
        return alternativeCode;
    }

    public void setAlternativeCode(String alternativeCode) {
        this.alternativeCode = alternativeCode;
    }
}
