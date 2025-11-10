class CallCenter
{
    int maxSize;         
    String customerID[];    
    int callTime[];         
    int front;              
    int rear;            
    int count;              

    CallCenter(int size)
    {
        maxSize = size;
        customerID = new String[maxSize];
        callTime = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void addCall(String id, int time)
    {
        if(count == maxSize)
        {
            System.out.println("Queue is full. Cannot add more calls.");
        }
        else
        {
            rear = (rear + 1) % maxSize;
            customerID[rear] = id;
            callTime[rear] = time;
            count++;
            System.out.println("Call from Customer " + id + " added (Call Time: " + time + " mins).");
        }
    }

    public void answerCall()
    {
        if(count == 0)
        {
            System.out.println("No calls in the queue to answer.");
        }
        else
        {
            System.out.println("Answering call from Customer " + customerID[front] + " (Duration: " + callTime[front] + " mins).");
            front = (front + 1) % maxSize;
            count--;
        }
    }

    public void viewQueue()
    {
        if(count == 0)
        {
            System.out.println("No calls in the queue.");
        }
        else
        {
            System.out.println("Current Call Queue:");
            for(int i = 0; i < count; i++)
            {
                int index = (front + i) % maxSize;
                System.out.println((i+1) + ". Customer ID: " + customerID[index] + " | Call Time: " + callTime[index] + " mins");
            }
        }
        System.out.println();
    }

    public boolean isQueueEmpty()
    {
        if(count == 0)
        {
            System.out.println("Queue is empty.");
            return true;
        }
        else
        {
            System.out.println("Queue is not empty. Total calls: " + count);
            return false;
        }
    }
}


class CallCenterDemo
{
    public static void main(String args[])
    {
        CallCenter c1 = new CallCenter(5);

        c1.addCall("C101", 5);
        c1.addCall("C102", 3);
        c1.addCall("C103", 7);
        c1.viewQueue();

        c1.answerCall();
        c1.viewQueue();

        c1.isQueueEmpty();

        c1.answerCall();
        c1.answerCall();
        c1.isQueueEmpty();
    }
}
