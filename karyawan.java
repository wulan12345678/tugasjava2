public class karyawan{
    String nama, alamat;

    String Ttl;

    karyawan(String nama, String alamat, String Ttl){
        this.nama=nama;
        this.alamat=alamat;
        this.Ttl=Ttl;

        }
    void cetakkaryawan(String nama){System.out.println(
            "nama="+nama+
                    "\n alamat="+alamat+
                    "\n Ttl="+Ttl);
    }
}


