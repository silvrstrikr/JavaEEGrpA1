package bean;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Age {

    private Integer ageID;
    private Integer ageGroup;
    private Integer censusYear;
    private Integer geographicArea;
    private Integer combined;
    private Integer male;
    private Integer female;

    public Integer getAgeID() {
        return ageID;
    }

    public void setAgeID(Integer ageID) {
        this.ageID = ageID;
    }

    public Integer getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(Integer ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Integer getCensusYear() {
        return censusYear;
    }

    public void setCensusYear(Integer censusYear) {
        this.censusYear = censusYear;
    }

    public Integer getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(Integer geographicArea) {
        this.geographicArea = geographicArea;
    }

    public Integer getCombined() {
        return combined;
    }

    public void setCombined(Integer combined) {
        this.combined = combined;
    }

    public Integer getMale() {
        return male;
    }

    public void setMale(Integer male) {
        this.male = male;
    }

    public Integer getFemale() {
        return female;
    }

    public void setFemale(Integer female) {
        this.female = female;
    }
}
