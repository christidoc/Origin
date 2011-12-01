
public class Les2 {

	/**
	 * Om code te testen
	 * @param args
	 */
	public static void main(String[] args) {
		Les2 l2 = new Les2();
		System.out.println(l2.e_tot_de_macht_minder_naief(3,50));

	}

	/**
	 * Faculteit functie
	 * @param n
	 * @return
	 */
	public int faculty(int n){
		int result = 1;
		
		for (int i = 1; i < n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	/**
	 * tot de macht functie
	 * 
	 * @param grondtal
	 * @param macht
	 * @return
	 */
	public int pow(int grondtal, int macht){
		int result = 1;
		
		for (int i = 0; i < macht; i++) {
			result *= grondtal;
		}
		
		return result;
	}
	
	/**
	 * 
	 * @param macht
	 * @param precisie
	 * @return
	 */
	public int e_tot_de_macht(int macht, int precisie){
		int result =1;
		
		for (int i = 0; i < precisie; i++) {
			result *= faculty(macht)/pow(macht,i);
		}
		
		return result;
	}
	
	/**
	 * Om dubbel werk te voorkomen zijn in deze methode de methodes fac() en pow() uit elkaar getrokken
	 * Bij elke iteratie worden ze nu berekend en tussentijds opgeslagen.
	 * @param macht
	 * @param precisie
	 * @return
	 */
	public double e_tot_de_macht_minder_naief(int macht, int precisie){
		
		double result = 1.0 ;
		double vorige_fac = 1.0;
		double vorige_pow = 1.0;
		
		for (int i = 1; i <= precisie; i++) {
			vorige_fac *= i;
			vorige_pow *= macht;
			
			result += vorige_pow/vorige_fac;	
			
			System.out.println(vorige_pow +"/"+vorige_fac +"=" +result);
		}
		
		return result;
	}	
}
