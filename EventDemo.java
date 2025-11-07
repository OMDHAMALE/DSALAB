
class Event
{
	int maxSize;
	String eventList[];
	int front;
	int rear;
	int count;
	
	Event(int size)
	{
		maxSize=size;
		eventList=new String[maxSize];
		front=0;
		rear=-1;
		count=0;
	}
	
	public void addEvent(String Name)
	{
		if(count==maxSize)
		System.out.println("Event limit is full. you can't add more event");
		else
		{
			rear=(rear+1)%maxSize;
			eventList[rear]=Name;
			System.out.println(Name+" event is added in list");
			count++;
		}
	}
	public void eventCompleted()
	{
		if(count==0)
			System.out.println("no event is sheduled");
		else
		{
			System.out.println(eventList[front]+" is process and  removed as it is completed");
			front=(front+1)%maxSize;
			count--;	
		}
	}
	
	public void eventslist()
	{
		if(count==0)
		{
			System.out.println(" there is no event");
		}
		else
		{
			System.out.println("upcoming events :");
			for(int i=0;i<count;i++)
			{
				int index=(front+i)%maxSize;
				System.out.println((i+1)+" : " +eventList[index]);
			}
		}
		System.out.println();
	}
	 public void cancelEvent(int number)
	 {
	 	if(number>=count)
	 	{
	 		System.out.println("seraial number not found");
	 	}
	 	else
	 	{
	 		String temp=eventList[number-1];
	 		eventList[number-1]=temp+" (canceled)";
	 	}
	 }
	
}

class EventDemo
{

	public static void main(String s[])
	{
		Event a1=new Event(5);
		a1.addEvent("Hackathon");
		a1.addEvent("Java Workshop");
		a1.addEvent("Cyber Security Workshop");
		a1.addEvent("TechManthan");
		a1.eventslist();
		a1.eventCompleted();
		a1.eventslist();
		a1.cancelEvent(2);
		a1.eventslist();
	}
}
