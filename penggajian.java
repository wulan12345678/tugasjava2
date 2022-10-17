public class penggajian {
    int gajiPokok;
    int gajiTunjanganjabatan;
    int gajiLembur;


    penggajian(int gajiTunjanganJabatan, int gajiPokok, int gajiLembur){
        this.gajiPokok=gajiPokok;
        this.gajiTunjanganjabatan=gajiTunjanganJabatan;
        this.gajiLembur=gajiLembur;


    }
    void cetakpenggajian(int gajiLembur) {System.out.println(
                    "\n gaji pokok              = " + gajiPokok +
                    "\n gaji tunjangajabatan    ="+ gajiTunjanganjabatan +
                    "\n gaji lembur             =" + gajiLembur);

        }
    }