/*
 Pada class ini berisikan metode untuk mencetak nama item
yang akan digunakan pada class UpinIpin
 */
package kasus2;

public class Item {
    // Kedua variabel ini diatur sebagai private untuk enkapsulasi variabel
    
    private String name;
    
    private Item() {
    name = "Ipin";
}
    public Item(String name) {
    this();
    System.out.println(this.name);   
}
}
