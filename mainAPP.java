public class mainAPP {
    public static void main(String[] args) {

        karyawan karyawan=new karyawan(" wulan ", " jorong ", " 26 januari 2002 ");
        karyawan.cetakkaryawan(karyawan.nama);

        penggajian penggajian=new penggajian(100000000, 500000000, 600000000);
        penggajian.cetakpenggajian(penggajian.gajiPokok);

        pendidikan pendidikan=new pendidikan("Serjana komputer", "Magister Komputer");
        pendidikan.cetakSetatusPendidikan(pendidikan.S2);

        jabatan jabatan =new jabatan ("backEnd", " UMUM ");
        jabatan.cetakjabatan(jabatan.devlover);
    }
}
