
package Tugas;

public class sekolah {
    private String pengajar;
    private String pelajaran;
    private String pengajar2;
    private String pelajaran2;

    public String getPengajar() {
        return pengajar;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public void setPengajar(String pengajar) {
        this.pengajar = pengajar;
    }

    public void setPelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }

    public String getPengajar2() {
        return pengajar2;
    }

    public String getPelajaran2() {
        return pelajaran2;
    }

    public void setPengajar2(String pengajar2) {
        this.pengajar2 = pengajar2;
    }

    public void setPelajaran2(String pelajaran2) {
        this.pelajaran2 = pelajaran2;
    }
    
    
    public void tampilkanData(){
        System.out.println("Pelajaran "+ getPelajaran() + " Diajar oleh "+ getPengajar());
        System.out.println("Pelajaran "+ getPelajaran2() + " Diajar oleh "+ getPengajar2());
    }
    public void inputData(String pel1, String pel2, String guru1, String guru2){
        setPelajaran(pel1);
        setPelajaran2(pel2);
        setPengajar(guru1);
        setPengajar2(guru2);
    }
}
