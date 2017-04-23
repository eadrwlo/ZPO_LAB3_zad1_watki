package lab3_zad1_watki;

public class MainThread
{

	public static void main(String[] args)
	{
		Synchonizer synch = new Synchonizer();
		ThreadOdd odd = new ThreadOdd(synch);
		ThreadEven even = new ThreadEven(synch);
		even.start();
		odd.start();
	}

}

class Synchonizer
{
	int a = 0;
}
