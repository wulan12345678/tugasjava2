public class jabatan {
    String devlover;
    String bendahara;

    jabatan(String devlover,String bendahara){
        this.devlover=devlover;
        this.bendahara=bendahara;

    }
    void cetakjabatan(String manajer){System.out.println(
                    "\nDevlover           ="+devlover+
                    "\nBendahara          ="+bendahara);
    }
}
