import java.util.LinkedList;

class HashChain
{
    private int size;
    private LinkedList<Integer>[] table;

    public HashChain(int size)
    {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++)
        {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key)
    {
        return key % size;
    }

    public void insert(int key)
    {
        int index = hash(key);
        table[index].add(key);
    }

    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(i + ": ");
            for (int val : table[i])
            {
                System.out.print(val + " -> ");
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args)
    {
        HashChain h1 = new HashChain(5);

        h1.insert(10);
        h1.insert(20);
        h1.insert(30);
        h1.insert(40);
        h1.insert(50);
        h1.display();
    }
}
