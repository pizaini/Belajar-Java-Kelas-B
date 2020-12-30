/**
Tipe data dan variable vs kontanta
Tipe data primitif --> 8 jenis
Varibel / konstanta

Formula: <access modifer> <tipe data> <name>
access modifer: public, private, protected, default
tipe data: 8 tipe primitif atau NON primitif
name: nama variable/konstanta

Contoh:
public int umur
private char a
double b

Implementasi:
double b;
b = 8.9;

int c = 10;

Konstatnta:
final int a = 20;

*/
public class TipeData1{
	public static void main (String[] abc){
		int a = 10;
		int b;
		b = 20;
		char c = 'A';
	
		
		System.out.println("Nilai dari a adalah "+a);
		System.out.println("Nilai dari b adalah "+b);
		System.out.println("Nilai dari c adalah "+c);
		a = 200 + b;
		System.out.println("Nilai dari a after "+a);
	}
}