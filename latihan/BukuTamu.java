package latihan;

public class BukuTamu {

    private static int ID = 0;
    private final static String DataTamu[][] = new String[100][4];
    public static int getID(){
        return ID;
    }

    public static void setData(String a, String b, String c, String d) {
        DataTamu[ID][0] = a;
        DataTamu[ID][1] = b;
        DataTamu[ID][2] = c;
        DataTamu[ID][3] = d;
        ID++;
    }

    public static String[][] getData() {
        return DataTamu;
    }
}
