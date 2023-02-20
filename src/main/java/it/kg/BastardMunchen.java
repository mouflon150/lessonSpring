package it.kg;

import java.util.Arrays;

public class BastardMunchen {

    private String countryOfOrigin;
    private String[] members;

    public BastardMunchen(String countryOfOrigin, String[] members) {
        this.countryOfOrigin = countryOfOrigin;
        this.members = members;
    }

    public BastardMunchen() {
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
        return "BastardMunchen(" +
                "countryOfOrigin='" + countryOfOrigin + '\'' +
                ", members=" + Arrays.toString(members) +
                ')';
    }
}