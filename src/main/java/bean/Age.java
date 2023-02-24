package bean;

public class Age {
    private String ageGroup;
    private String censusYear;
    private String geographicArea;
    private String combined;
    private String male;
    private String female;

//Age Group
    public String getAgeGroup() {
        return ageGroup;
    }
    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

//Census Year
    public String getCensusYear() {
        return censusYear;
    }

    public void setCensusYear(String censusYear) {
        this.censusYear = censusYear;
    }


//Geographical Area
    public String getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(String geographicArea) {
        this.geographicArea = geographicArea;
    }


//Combined
    public String getCombined() {
        return combined;
    }

    public void setCombined(String combined) {
        this.combined = combined;
    }


//Male
    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }


//Female
    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }
}
