/**
Formula: <access modifier> class <classname>
access modifier: public, private, protected, default

classname: Camel Case style

Variable / constanta

<type data> <name>
Contoh:
int hargaBuku;
int hargaPena = 10000;
*/
public class HelloJava1{ 
	/**
	method main
	method yang pertama kali dicari/dijalankan oleh JRE
	*/
	public static void main(String[] abc){
		HelloJava1 h = new HelloJava1();
		h.iniMethodSaya();
		System.out.println("Selamat datang di Java, ini program pertama saya!");
	}
	
	public void iniMethodSaya(){
		//System.out.println("ini berasal dari method saya!");
		//System.out.println(333);
		//System.out.print(333);
	}
}
