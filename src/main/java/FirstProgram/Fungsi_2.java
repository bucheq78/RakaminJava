package FirstProgram;

public class Fungsi_2 {
    public static void main(String[] args){
        int x = 2;
        int y = 4;
        int z = 18;


        Namaku.bucheq("Bucheq");
        Namaku.bucheq("Syifa");
        Namaku.bucheq("Nira");



        tambah(x,y);
        tambah(x,z);
        tambah(y,z);


    }

    public static int tambah (int a , int b ){
        int HasilTambah = a+b ;
        System.out.println("HasilTambah "+a+" dan "+b+" adalah : "+HasilTambah);
        return HasilTambah;
    }
}
