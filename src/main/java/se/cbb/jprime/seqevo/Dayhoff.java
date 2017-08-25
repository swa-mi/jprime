package se.cbb.jprime.seqevo;

/**
 * Substitution model definition.
 * @author Gustaf Pihl.
 */
public class Dayhoff {

	/**
	 * Returns the model type described by (Dayhoff, Schwartz and Orcutt, 1978).
	 * @param cacheSize matrix cache size. Probably not useful with more than twice the number
	 * of arcs in tree...?
	 * @return the model type.
	 */
	public static SubstitutionMatrixHandler createDayhoff(int cacheSize) {
		double[] Pi = {
		     0.087127, 0.040904, 0.040432, 0.046872, 0.033474, 0.038255, 0.049530, 0.088612, 0.033618, 0.036886, 0.085357, 0.080482, 0.014753, 0.039772, 0.050680, 0.069577, 0.058542, 0.010494, 0.029916, 0.064718
		};
		
		double[] R = {
		     27.00, 98.00, 120.00, 36.00, 89.00, 198.00, 240.00, 23.00, 65.00, 41.00, 26.00, 72.00, 18.00, 250.00, 409.00, 371.00, 0.00, 24.00, 208.00, 
		     32.00, 0.00, 23.00, 246.00, 1.00, 9.00, 240.00, 64.00, 15.00, 464.00, 90.00, 14.00, 103.00, 154.00, 26.00, 201.00, 8.00, 24.00, 
		     905.00, 0.00, 103.00, 148.00, 139.00, 535.00, 77.00, 34.00, 318.00, 1.00, 14.00, 42.00, 495.00, 229.00, 23.00, 95.00, 15.00, 
		     0.00, 134.00, 1153.00, 125.00, 86.00, 24.00, 0.00, 71.00, 0.00, 0.00, 13.00, 95.00, 66.00, 0.00, 0.00, 18.00, 
		     0.00, 0.00, 11.00, 28.00, 44.00, 0.00, 0.00, 0.00, 0.00, 19.00, 161.00, 16.00, 0.00, 96.00, 49.00, 
		     716.00, 28.00, 606.00, 18.00, 73.00, 153.00, 114.00, 0.00, 153.00, 56.00, 53.00, 0.00, 0.00, 35.00, 
		     81.00, 43.00, 61.00, 11.00, 83.00, 30.00, 0.00, 51.00, 79.00, 34.00, 0.00, 22.00, 37.00, 
		     10.00, 0.00, 7.00, 27.00, 17.00, 15.00, 34.00, 234.00, 30.00, 0.00, 0.00, 54.00, 
		     7.00, 44.00, 26.00, 0.00, 48.00, 94.00, 35.00, 22.00, 27.00, 127.00, 44.00, 
		     257.00, 46.00, 336.00, 196.00, 12.00, 24.00, 192.00, 0.00, 37.00, 889.00, 
		     18.00, 527.00, 157.00, 32.00, 17.00, 33.00, 46.00, 28.00, 175.00, 
		     243.00, 0.00, 33.00, 96.00, 136.00, 0.00, 13.00, 10.00, 
		     92.00, 17.00, 62.00, 104.00, 0.00, 0.00, 258.00, 
		     11.00, 46.00, 13.00, 76.00, 698.00, 12.00, 
		     245.00, 78.00, 0.00, 0.00, 48.00, 
		     550.00, 75.00, 34.00, 30.00, 
		     0.00, 42.00, 157.00, 
		     61.00, 0.00, 
		     28.00
		};

		return new SubstitutionMatrixHandler("Dayhoff", SequenceType.AMINO_ACID, R, Pi, cacheSize);
	}

}