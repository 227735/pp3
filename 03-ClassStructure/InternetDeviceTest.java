public class InternetDeviceTest {
    public static void main(String[] args) {
    InternetDevice laptop = new InternetDevice("laptop");
    InternetDevice klawiatura = new InternetDevice("klawiatura");
    InternetDevice lodowka = new InternetDevice("lodowka");
    InternetDevice telewizor = new InternetDevice("telewizor");
    InternetDevice odkurzacz = new InternetDevice("odkurzacz");

      laptop.connect();
      telewizor.connect();
      lodowka.connect();

      laptop.displayStatus();
      klawiatura.displayStatus();
      lodowka.displayStatus();
      telewizor.displayStatus();
      odkurzacz.displayStatus();

      InternetDevice.displayConnections();

  }  
}
