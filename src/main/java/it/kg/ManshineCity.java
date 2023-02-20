package it.kg;

import java.util.Arrays;

public class ManshineCity {

    private String countryOfOrigin;
    private String[] members;

    public ManshineCity(String countryOfOrigin, String[] members) {
        this.countryOfOrigin = countryOfOrigin;
        this.members = members;
    }

    public ManshineCity() {
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "ManshineCity(" +
                "countryOfOrigin='" + countryOfOrigin + '\'' +
                ", members=" + Arrays.toString(members) +
                ')';
    }
}
