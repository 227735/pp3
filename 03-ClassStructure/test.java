public class test {
    public static void main(String[]args) {
        zippo("rattle",13);
    }

    public static void baffle(String[]args) {
        zippo("ping",-5);
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + "zoop");
        } else {
            System.out.println("ik");
            // baffle(quince);
            System.out.println("bpp-wa-ha-ha");
        }
    }

}
