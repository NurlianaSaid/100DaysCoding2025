package codingan;

public class Day14 {
    public static void main(String[] args) {
        String Biodata = "BIODATA NURLIANA";
        String nama = "NURLIANA";
        
        String usia = "19";
        byte umur = Byte.parseByte(usia);
        
        String bulanLahir = "3"; // September
        short bl = Short.parseShort(bulanLahir);
        
        String tanggalLahir = "9";
        int tglL = Integer.parseInt(tanggalLahir);
        
        String tahunLahir = "2006";
        short thnL = Short.parseShort(tahunLahir);
        
        String nomorwa = "6281244069263";
        long nomor = Long.parseLong(nomorwa);
        
        String nilaiRtIjazah = "90.0";
        float nilaiIjazah = Float.parseFloat(nilaiRtIjazah);
        
        String nilaiujian = "99.7";
        double nilai = Double.parseDouble(nilaiujian);
        
        String jeniskelamin = "P"; //perempuan
        char JK = jeniskelamin.charAt(0);
        
        String status = "true";
        boolean status1 = Boolean.parseBoolean(status);

        System.out.println("==== KONVERSI (MENGUBAH STRING JADI TIPE DATA PRMITIF) ====");
        System.out.println(Biodata);
        System.out.println("NAMA \t= " + nama);
        System.out.println("UMUR \t= " + umur + " TAHUN ");
        System.out.println("TANGGAL LAHIR \t= " + tglL + "-" + bl + "-" + thnL);
        System.out.println("NOMOR WHATSAPP \t= " + nomor);
        System.out.println("NILAI RATA RATA IJAZAH \t= " + nilaiIjazah);
        System.out.println("NILAI UJIAN \t= " + nilai);
        System.out.println("JENIS KELAMIN \t= " + JK);
        System.out.println("STATUS MAHASISWA \t= " + status1);
        System.out.println("-------------------------- end ------------------------");
    }
}
