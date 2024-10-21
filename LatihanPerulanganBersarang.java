/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopwhile;
import java.util.Scanner;
/**
 *
 * @author izzaa
 */
public class LatihanPerulanganBersarang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double total=0, grandtotal=0, bayar=0, kembalian=0, diskon, uangbayar;
        double TotalPemasukanOwner=0;
        
        int Pilihposisi=0, pilihmenu=0, pilihsubmenu=0, jumlah=0,kartumember;
        
        double sateayam=1500, satekambing=3000, pecellaukayam=13000, pecellaukempal=15000,
                penyetantahu=5000, penyetantelur=7000, penyetanayam=10000, harga=0;
        
        do{
            System.out.println("PROGRAM KASIR");
            
            System.out.println("1. Kasir\n2. Admin\n3. Owner\n4. Exit");
            System.out.print("Pilih Posisi Anda : ");
            Pilihposisi = input.nextInt();
            
            switch(Pilihposisi){
                case 1: //Kasir
                    grandtotal=0;
                    
                    System.out.println("PROGRAM KASIR (POSISI KASIR)");
                    
                    do{
                        System.out.println("DAFTAR MENU");
                        System.out.println("1. sate");
                        System.out.println("2. pecel");
                        System.out.println("3. penyetan");
                        System.out.println("4. selesai");
                        
                        System.out.println("___________________________");
                        
                        System.out.print("Pilih : ");
                        pilihmenu=input.nextInt();
                        switch(pilihmenu){
                            case 1:
                                
                                do{
                                    System.out.println("sate : ");
                                    System.out.println("[1] Ayam : [Rp. "+ sateayam +"] per tusuk");
                                    System.out.println("[2] kambing : [Rp. "+ satekambing + "] per tusuk");
                                    System.out.println("[3] Selesai\n");
                                    
                                    System.out.print("PILIH SUB MENU : ");
                                    pilihsubmenu = input.nextInt();
                                    
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Sate Ayam[Rp."+ sateayam +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*sateayam;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                            
                                            break;
                                            
                                        case 2:
                                            System.out.println("Sate Kambing[Rp."+ satekambing +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*satekambing;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                            
                                            break;
                                        
                                        case 3:
                                            System.out.println("TERIMA KASIH TELAH BERBELANJA");
                                            break;
                                        default:
                                            System.out.println("MAAF, COBA LAGI");
                                    }
                                }while(pilihsubmenu!=3);
                                
                            break;
                            
                            case 2:
                                do{
                                    System.out.println("pecel :");
                                    System.out.println("[1] Lauk Ayam :[Rp. "+pecellaukayam+"]");
                                    System.out.println("[2] Lauk Empal :[Rp. "+pecellaukempal+"]");
                                    System.out.println("[3] Selesai");
                                    
                                    System.out.println("");
                                    
                                    System.out.print("Pilih Sub Menu :");
                                    pilihsubmenu=input.nextInt();
                                    
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Lauk Ayam [Rp. "+pecellaukayam+"]");
                                            System.out.println("Jumlah : ");
                                            jumlah=input.nextInt();
                                            
                                            total=jumlah*pecellaukayam;
                                            System.out.println("TOTAL FINAL : Rp. "+ grandtotal);
                                            
                                            break;
                                        case 2:
                                            System.out.println("Lauk Empal [Rp. "+pecellaukempal+"]");
                                            System.out.println("Jumlah : ");
                                            jumlah=input.nextInt();
                                            
                                            total=jumlah*pecellaukempal;
                                            System.out.println("TOTAL FINAL : Rp. "+ grandtotal);
                                            
                                            break;
                                        case 3:
                                            System.out.println("TERIMA KASIH TELAH BERBELANJA");
                                            break;
                                        default:
                                            System.out.println("MAAF, COBA LAGI");
                                    }               
                                }while(pilihsubmenu !=3);
                                
                            break;
                            
                            case 3:
                                do{
                                    System.out.println("penyetan :");
                                    System.out.println("[1] Lauk Tahu / Tempe :[Rp. "+penyetantahu+"]per porsi");
                                    System.out.println("[2] Lauk Telur :[Rp. "+penyetantelur+"]per porsi");
                                    System.out.println("[3] Lauk Ayam[Rp. "+penyetantelur+"per porsi");
                                    System.out.println("[4] Selesai");
                                    
                                    System.out.println("");
                                    
                                    System.out.print("Pilih Sub Menu : ");
                                    pilihsubmenu=input.nextInt();
                                    
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Lauk Tahu /Tempe : [Rp. "+penyetantahu+"]");
                                            System.out.println("Jumlah : ");
                                            jumlah=input.nextInt();
                                            
                                            total=jumlah*penyetantahu;
                                            System.out.println("TOTAL FINAL : Rp. "+ grandtotal);
                                            
                                            break;
                                        case 2:
                                            System.out.println("Lauk Telur: [Rp. "+penyetantelur+"]");
                                            System.out.println("Jumlah : ");
                                            jumlah=input.nextInt();
                                            
                                            total=jumlah*penyetantelur;
                                            System.out.println("TOTAL FINAL : Rp. "+ grandtotal);
                                            
                                            break;
                                        case 3:
                                            System.out.println("Lauk Ayam : [Rp. "+penyetanayam+"]");
                                            System.out.println("Jumlah : ");
                                            jumlah=input.nextInt();
                                            
                                            total=jumlah*penyetanayam;
                                            System.out.println("TOTAL FINAL : Rp. "+ grandtotal);
                                            
                                            break;
                                        case 4:
                                            System.out.println("TERIMA KASIH TELAH BERBELANJA");
                                            break;
                                        default:
                                            System.out.println("MAAF, COBA LAGI");
                                    }
                                    
                                }while(pilihsubmenu !=4);
                            break;
                            
                            case 4:
                                System.out.println("Apakah Anda Mempunyai Kartu Member IYA/TIDAK?");
                                System.out.println("[1. IYA]");
                                System.out.println("[2. TIDAK]");
                                System.out.println("Pilih [1,2] :");
                                kartumember = input.nextInt();
                                
                                System.out.println();
                                
                                if (kartumember==1){
                                    System.out.println("SELAMAT, ANDA MENDAPAT DISKON SEBESAR [5%]");
                                    System.out.println("Total Semua : Rp."+grandtotal);
                                    diskon=0.05*grandtotal;
                                    System.out.println("Diskon : Rp."+diskon);
                                    grandtotal=grandtotal-diskon;
                                    System.out.println("Total Akhir : Rp."+ grandtotal);
                                    System.out.println();
                                }else if(kartumember==2){
                                    System.out.println("MAAF, ANDA TIDAK MENDAPAT DISKON");
                                    diskon=0*grandtotal;
                                    System.out.println("Diskon : Rp."+diskon);
                                    grandtotal=grandtotal-diskon;
                                    System.out.println("Total Akhir : Rp."+ grandtotal);
                                    System.out.println();
                                
                                }else{
                                    System.out.println("MOHON MAAF, JAWABAN ANDA TIDAK VALID");
                                }
                                
                                System.out.println("_______________________________________");
                                
                                System.out.print("Uang Yang Di Bayar : ");
                                    uangbayar = input.nextDouble();

                                    if (uangbayar == grandtotal) {
                                        System.out.println("Uang Yang Di Bayarkan Pas, Terima Kasih");
                                    } else if (uangbayar > grandtotal){
                                        kembalian = uangbayar - grandtotal;
                                        System.out.println("Uang Kembalian : Rp. " + kembalian);
                                    } else {
                                        System.out.println("Mohon maaf, Uang Yang Dibayarkan Kurang");
                                    }

                                    TotalPemasukanOwner += grandtotal;
                                    System.out.println();
                                    
                                break;
                            }
                            
                        }while(pilihmenu!=4);
                    break;
                    
                case 2: //admin
                    
                    System.out.println(" PROGRAM KASIR( POSISI ADMIN)");
                    
                    do {
                         System.out.println("Daftar Menu");
                        System.out.println("1. Sate");
                        System.out.println("2. Pecel");
                        System.out.println("3. Penyetan");
                        System.out.println("4. Selesai");
                        
                        System.out.println("________________________________");

                        System.out.print("Pilih : ");
                        pilihmenu = input.nextInt();
                        switch(pilihmenu){
                             case 1:

                                do{
                                    System.out.println("Sate     :");
                                    System.out.println("[1] Ayam    : [Rp. " + sateayam + "] per tusuk");
                                    System.out.println("[2] Kambing : [Rp. " + satekambing + "] per tusuk");
                                    System.out.println("[3] Selesai");

                                    System.out.println();
                                    System.out.print("Pilih Sub Menu Yang Akan Dirubah Harga : ");
                                    pilihsubmenu = input.nextInt();

                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Sate Ayam [Rp. " + sateayam + "]");
                                            System.out.print("Masukkan Harga Baru Sate Ayam : ");
                                            sateayam = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + sateayam);

                                            System.out.println();

                                            break;
                                        case 2:
                                            System.out.println("Sate Kambing [Rp. " + satekambing + "]");
                                            System.out.print("Masukkan Harga Baru Sate Kambing : ");
                                            satekambing = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + satekambing);

                                            System.out.println();
                                            break;
                                        case 3:
                                            System.out.println("SELESAI !");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("MOHON MAAF, COBA LAGI");
                                    }
                                }while(pilihsubmenu != 3 );
                                
                            break;
                                
                            case 2: 
                                do{
                                    System.out.println("Pecel     :");
                                    System.out.println("    [1] Lauk Ayam    : [Rp. " + pecellaukayam + "] per tusuk");
                                    System.out.println("    [2] Lauk Empal   : [Rp. " + pecellaukempal + "] per tusuk");
                                    System.out.println("    [3] Selesai");

                                    System.out.println();
                                    System.out.print("Pilih Sub Menu : ");
                                    pilihsubmenu = input.nextInt();
                                        
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Lauk Ayam [Rp. " + pecellaukayam + "]");
                                            System.out.print("Masukkan Harga Baru Pecel Lauk Ayam : ");
                                            pecellaukayam = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + pecellaukayam);

                                            System.out.println();

                                            break;
                                        case 2:
                                            System.out.println("Lauk Empal [Rp. " + pecellaukempal + "]");
                                            System.out.print("Masukkan Harga Baru Pecel Lauk Empal : ");
                                            pecellaukempal = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + pecellaukempal);

                                            System.out.println();
                                            break;  
                                        case 3:
                                            System.out.println("Selesai !");
                                            System.out.println();
                                            break;
                                          default:
                                            System.out.println("Pilihan Anda Tidak Valid !");
                                        }
                                }while(pilihsubmenu != 3 );
                             break;
                                
                            case 3:
                                do{
                                    System.out.println("3. Penyetan     :");
                                    System.out.println("    [1] Lauk Tahu / Tempe : [Rp. " + penyetantahu + "]  per porsi");
                                    System.out.println("    [2] Lauk Telur        : [Rp. " + penyetantelur + "]  per porsi");
                                    System.out.println("    [3] Lauk Ayam         : [Rp. " + penyetanayam + "] per porsi");
                                    System.out.println("    [4] Selesai\n");
                                    System.out.print("Pilih Sub Menu : ");
                                    pilihsubmenu = input.nextInt();
                                    
                                    System.out.println();

                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Lauk Tahu / Tempe : [Rp. " + penyetantahu + "]");
                                            System.out.print("Masukkan Harga Baru Penyetan Lauk Tahu / Tempe : ");
                                            penyetantahu = input.nextDouble();

                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + penyetantahu + "\n");

                                            break;
                                        case 2:
                                            System.out.println("Lauk Telur        : [Rp. " + penyetantelur + "]");
                                            System.out.print("Masukkan Harga Baru Penyetan Lauk Telur : ");
                                            penyetantelur = input.nextDouble();

                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + penyetantelur + "\n");
                                            break;
                                        case 3:
                                            System.out.println("Lauk Ayam         : [Rp. " + penyetanayam + "]");
                                            System.out.print("Masukkan Harga Baru Penyetan Lauk Ayam : ");
                                            penyetanayam = input.nextDouble();

                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + penyetantelur + "\n");
                                            break;
                                        case 4:
                                            System.out.println("Selesai !");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("Pilihan Anda Tidak Valid !");
                                    }
                                }while(pilihsubmenu != 4 );
                            break;
                            
                            case 4:
                            break;
           
                           }
                    }while(pilihmenu!=4);
                    break;
                                    
                case 3: //Owner
                    System.out.println("PROGRAM KASIR (POSISI OWNER)");
                    
                    System.out.println("Total Semua Pemasukan : Rp. " + TotalPemasukanOwner );
                    break;
                case 4:
                    break;
                default:
                    System.out.println("MOHON MAAF, COBA LAGI");
                                        
                                            
              }
                                    
        }while(Pilihposisi!=4);
    }
}