package lab3_zad1_watki;

class ThreadOdd extends Thread
{
	Synchonizer synch;
	int num = 1;
	public ThreadOdd()
	{
	}
	ThreadOdd(Synchonizer synch)
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
					sleep(500);
				} catch (InterruptedException e){}
        		System.out.println("ThreadOdd:\t" + synch.a);
                synch.a ++;;
                synch.notify();
    			try 
    			{
    				synch.wait();
    			}  
    			catch(InterruptedException exc) {}
    			
            }
		}
	}
}
