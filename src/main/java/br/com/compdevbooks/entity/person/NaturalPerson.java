package br.com.compdevbooks.entity.person;

public class NaturalPerson extends Person {
	 private String title;
     private String driveLicense; //rg


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(String driveLicense) {
        this.driveLicense = driveLicense;
    }
}
