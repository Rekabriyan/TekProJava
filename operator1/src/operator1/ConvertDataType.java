/*
Nama    : Reka Briyan Cahya Heryana
Kelas   : D4-1A Teknik Informatika
 */
package operator1;

public class ConvertDataType
{
static short methodOne(long l)
{
int i = (int) l;
return (short)i;
}
public static void main(String[] args)
{
double d = 10.25;
float f = (float) d;
byte b = (byte) methodOne((long) f);
System.out.println(b);
}
}

