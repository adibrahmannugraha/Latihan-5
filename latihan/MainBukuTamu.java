package latihan;

import java.util.Scanner;

public class MainBukuTamu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data[][] = new String [100][4];
        boolean menu = true;
        int input;
        String a,b,c,d;
        System.out.println("============= Buku Tamu =============");
        System.out.println("1.Isi Buku Tamu   2.Lihat Daftar Tamu\n3.Selesai");
        while (menu) {
            System.out.print("Menu : ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("ID ke-"+(BukuTamu.getID()+1));
                    System.out.print("Nama Lengkap : ");
                    a = scan.nextLine();
                    a = scan.nextLine();
                    System.out.print("Alamat       : ");
                    b = scan.nextLine();
                    System.out.print("Jabatan      : ");
                    c = scan.nextLine();
                    System.out.print("Keperluan    : ");
                    d = scan.nextLine();
                    BukuTamu.setData(a, b, c, d);
                    System.out.println("====================================================================");
                    break;
                case 2:
                    data = BukuTamu.getData();
                    System.out.println("ID. | Nama Lengkap | Alamat | Jabatan | Keperluan");
                    System.out.println("--------------------------------------------------------------------");
                    for(int i=1;i<=BukuTamu.getID();i++){
                        if(i<10)
                            System.out.println((i)+".  | "+data[i][0]+" | "+data[i][1]+" | "+data[i][2]+" | "+data[i][3]);
                        else
                            System.out.println((i)+". | "+data[i][0]+" | "+data[i][1]+" | "+data[i][2]+" | "+data[i][3]);
                    }
                    System.out.println("====================================================================");
                    break;
                case 3:
                    menu = false;
                    System.out.println("====================================================================");
                    break;
            }
        }

    }
}
