public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int yearOfIssue;
    private String licenseCategory;

    public DrivingLicense() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        int currentYear = java.time.Year.now().getValue();
        if (yearOfIssue >= 1980 && yearOfIssue <= currentYear) {
            this.yearOfIssue = yearOfIssue;
        }
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public String display() {
        return String.format("Driver's name: %s %s\nAddress: %s, %s %s\nLicense Number: %s\nYear of Issue: %d\nLicense Category: %s",
            name, surname, address, postalCode, city, licenseNumber, yearOfIssue, licenseCategory);
    }
}