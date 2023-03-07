// finding prime numbers by "Sieve of Eratosthenes" way

package kunal_kushwaha;

public class PrimeNum {

	public static void main(String[] args) {
		
		int n = 40;
		boolean[] primes = new boolean[n+1];	//size is (n+1) because you took limits of loops till 40 i.e. i<=40
//		System.out.println(primes[0]);
		sieve(n,primes);
	}
	

//	by default all numbers in array will be false
//	false in array means number is prime
	static void sieve(int n,boolean[] ar) {
//		outer loop for choosing number
		for(int i=2;i*i<=n;i++) {				// i*i=n  is equal to i=sqrt(n)
			if(!ar[i]) {						//is same as if(ar[i]==false)
				
//				loop for discarding all numbers till n which are multiples of "i"th element
				for(int j=i*2;j<=n;j+=i) {
					ar[j]=true;
				}
			}
		}
		
//		loop for printing prime(false) numbers
		for(int k=2;k<=n;k++) {
			if(!ar[k]) {
				System.out.println(k +" is prime");
			}
		}
	}

}
