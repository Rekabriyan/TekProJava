/*
 Class ini mencetak nomor dari Classnya sendiri
dan akan dipanggil oleh Class main sebagai tipe yang baru
 */
package kasus3;

public class KelasSatu {
    {
System.out.println(11); 
/* akan muncul setiap kali setelah satu nomor
dari Class KelasSatu muncul yang bertindak
sebagai dari inisialisasi block statis*/
}
static
{
System.out.println(2); // akan muncul satu kali di awal ketika construct dipanggil
}
public KelasSatu(int i)
{
System.out.println(3); // akan muncul ketika constructor KelasSatu dengan parameter dipanggil
}
public KelasSatu()
{
System.out.println(4); // akan muncul ketika constructor KelasSatu dipanggil dan tidak memiliki parameter
}
}

