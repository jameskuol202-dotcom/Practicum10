import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        
        System.out.println("=== 2.3 Heterogeneous Collection ===");
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);
        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
        System.out.println();

        
        System.out.println("=== 2.4 Object Casting ===");
        Pegawai pegawai1 = dosen1; 
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo(); 

        
        Dosen newDosen = (Dosen) pegawai1;
        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();
        System.out.println();

        
        
        

        
        System.out.println("=== 2.5 Polymorphic Arguments & instanceof ===");
        train(dosen1);
        train(tendik1);
    }

    public static void train(Pegawai pegawai) {
        System.out.println("Memberikan pelatihan untuk pegawai");
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");
        
        if (pegawai instanceof Dosen) {
            System.out.println("Memberikan pelatihan pedagogik");
        } else if (pegawai instanceof TenagaKependidikan) {
            System.out.println("Memberikan pelatihan teknis tenaga kependidikan");
        }
        System.out.println("--------------------------------------------------");
    }
}