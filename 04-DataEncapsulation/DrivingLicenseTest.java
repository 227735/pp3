public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.setName("jack");
        dl.setSurname("Doe");
        dl.setAddress("123 Main St");
        dl.setPostalCode("12345");
        dl.setCity("Sample City");
        dl.setLicenseNumber("A123456");
        dl.setYearOfIssue(2020);
        dl.setLicenseCategory("B");

        System.out.println(dl.display());
    }
}