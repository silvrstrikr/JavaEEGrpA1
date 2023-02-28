package bean;

public class HouseHold {
    private Integer Id;
    private Integer geographicArea;
    private Integer householdType;
    private Integer householdSize;
    private Integer householdsByAgeRange;
    private Integer householdEarners;
    private Integer totalIncome;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(Integer geographicArea) {
        this.geographicArea = geographicArea;
    }

    public Integer getHouseholdType() {
        return householdType;
    }

    public void setHouseholdType(Integer householdType) {
        this.householdType = householdType;
    }

    public Integer getHouseholdSize() {
        return householdSize;
    }

    public void setHouseholdSize(Integer householdSize) {
        this.householdSize = householdSize;
    }

    public Integer getHouseholdsByAgeRange() {
        return householdsByAgeRange;
    }

    public void setHouseholdsByAgeRange(Integer householdsByAgeRange) {
        this.householdsByAgeRange = householdsByAgeRange;
    }

    public Integer getHouseholdEarners() {
        return householdEarners;
    }

    public void setHouseholdEarners(Integer householdEarners) {
        this.householdEarners = householdEarners;
    }

    public Integer getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Integer totalIncome) {
        this.totalIncome = totalIncome;
    }
}
