
package Tugas;

public class kelas extends sekolah {
    public void tampilkan(){
        String namaKelas="X RPL 6";
        System.out.println("Kelas "+namaKelas);
        
        sekolah s = new sekolah();
        
        s.inputData("Matematika", "Fisika", "Pak Tulus", "Pak Diaur");
        s.tampilkanData();
        

    }
    public static void main(String[] args){
        kelas m = new kelas();
        m.tampilkan();
        
    }
}
