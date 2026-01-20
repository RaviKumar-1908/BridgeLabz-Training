package com.movietime;

public class MovieMain {

	public static Movie[] insetionSort ( Movie[] a) {
		for ( int i=0 ;i<a.length;i++) {
			for ( int j = i; j > 0 ;j--) {
				if( (a[j].time.compareTo(a[j - 1].time) < 0)) {
					Movie temp = a[j];
				 	a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie[] m = {
				new Movie ("Tiger Zinda hai " , "12:00"),
				new Movie ("Ek tha Tiger", "12:43"),
				new Movie ( "chor machaye shor","10:00")
		};
		Movie [] result = insetionSort(m);
		for ( Movie x : result) {
			System.out.println(x.name + " --- "+ x.time);
		}
		
	}

}
