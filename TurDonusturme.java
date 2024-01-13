package chapter02alistirmalari;

public class TurDonusturme {
	public static void main(String[] args) {
		
		int i = 5;
		long l = i;
		i = l; // long 64 bit,int 32 bir oldugundan tur donusturme yapılmalıdır.
		i = (int)l; // tur donusturme adımı.
		
		System.out.println(i); // cıktı: 5
		System.out.println(l); //cıktı:5
		
		l = 2148000000; //ilk 32 biti kullanıp longa atamak istediği için sığmaz
		l = 2148000000L;// sonuna L koyarak long değeri (64 bit)olduğunu belirtirizve sorun çözülür.
		i = (int)l;
		
	    System.out.println(i); //cıktı: -2146967296 l degeri inte sığmadığı için veri kaybi yasanir.
	    //Buna 'integer overflow' integer taşması denir.
	    
		System.out.println(l); //cıktı: 2148000000
		
		
		// integer overlow a  örnekler:
		int sayi = 2_147_483_647; 
		// okunabilirliği arttırmak için alt çizgi kullanılabilir. 2_147_483_647 alabileceği max değer yani 32 bittir.
		
		sayi = sayi + 1;
		
		System.out.println(sayi); // cıktı: -2147483648
		
		
		byte b = 127; //0111 1111
		b++;
		System.out.println(b); // cıktı: -128 olur çünkü 1111 1111 
		
	}

}
