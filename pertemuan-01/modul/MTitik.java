/**
 * File      : MTitik.java				21/02/24
 * Penulis   : Naufal Dzaki Imtiyaz
 * Deskripsi : Kelas yang berisi main dari Titik
 * 
 */

public class MTitik {
	public static void main(String[] args){
		Titik t1;
		Titik t2;
		
		t1 = new Titik();
		
		t2 = new Titik();
		t2.setAbsis(1);
		t2.setOrdinat(2);
		int counterTitik = Titik.getCounterTitik();
		
		System.out.printf("Jumlah objek titik : %d\n", counterTitik);
		System.out.printf("Titik t1 dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
		System.out.printf("Titik t2 dengan absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
	}
}