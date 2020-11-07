/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan31.perkenalan;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO2
 */
public class PBO210119066Latihan31Perkenalan {

    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa("10119066", "Risky Adam Kurniawan");
        mhs1.PerkenalanDiri();
    }
}
    class Mahasiswa{
        
        public String nim;
        public String nama;
        
        public Mahasiswa(){
        }
        
        public Mahasiswa(String nim, String nama) {
            this.nim = nim;
            this.nama = nama;
        }
        
        public void setNim(String nim){
            this.nim;
        }
        public void setNama(String nama){
            this.nama;
        }
        
        public String getNim() {
            return nim;
        }
        public String getNama() {
            return nama;
        }
        
        public void PerkenalanDiri(){
            System.out.println("Hello Everyone");
            System.out.println("My NIM Is\t : "+this.nim);
            System.out.println("My Name Is\t : "+this.nama);
        }
    }
