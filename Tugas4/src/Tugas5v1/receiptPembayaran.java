package Tugas5v1;

import java.util.List;

public interface receiptPembayaran //huruf besar receipt
{
    public List<String> menuPaket();
    public List<String> menuMakanan() ;
    public List<String> menuMinuman() ;
    public List<Integer> hargaPaket() ;
    public List<Integer> hargaMakanan();
    public List<Integer> hargaMinuman();
}
