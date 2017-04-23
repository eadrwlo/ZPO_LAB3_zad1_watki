package lab3_zad1_watki;

class ThreadEven extends Thread
{
	Synchonizer synch;
	int num = 0;
	public ThreadEven()
	{
	}
	ThreadEven(Synchonizer synch)
	{
		this.synch = synch;
	}
	@Override
	public void run()
	{
		synchronized(synch)
		{
            for(int i=0; i<100 ; i++)
            {
            	try 
    			{
    				synch.wait();
    			} 
    			catch(InterruptedException exc) {}
            	try
				{
					sleep(500);
				} catch (InterruptedException e){}

        		System.out.println("ThreadEven:\t" + synch.a);
        		synch.a ++;
        		synch.notify();
            }
		}
	}
}