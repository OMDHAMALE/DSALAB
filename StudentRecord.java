class Node
{
    int rollno;
    String name;
    double marks;
    Node next;
    Node(int rollno,String name,double marks )
    {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
        this.next=null;
    }
}
class Student
{
    Node head;
    public void add(int rollno,String name,double marks)
    {
        Node n1=new Node(rollno,name,marks);
        if(head==null)
        {
            head=n1;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=n1;
    }
    public void update(int rollno,String newname,double newmarks)
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        while(temp!=null)
        {
            if(temp.rollno==rollno)
            {
                temp.rollno=rollno;
                temp.name=newname;
                temp.marks=newmarks;
                System.out.println("updated record"+temp.rollno+""+temp.name+""+temp.marks);
                return;
            }
                temp=temp.next;
        }
                System.out.println("record not found");
    }
    public void search(int rollno)
    {
        Node temp=head;
        if(head==null)
        {
              System.out.println("List is empty");
              return;
        }
        while(temp!=null)
        {
            if(temp.rollno==rollno)
            {
                 System.out.println("updated record"+temp.rollno+""+temp.name+""+temp.marks);
                 return;
            }
                 temp=temp.next;
        }
                 System.out.println("record not found");
    }
    public void SortAssending()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        for(Node i=head;i!=null;i=i.next)
        {
            for(Node j=i.next;j!=null;j=j.next)
            {
                if(i.marks<j.marks)
                {
                    double tempmarks=i.marks;
                    i.marks=j.marks;
                    j.marks=tempmarks;

                    int temprollno=i.rollno;
                    i.rollno=j.rollno;
                    j.rollno=temprollno;

                    String tempname=i.name;
                    i.name=j.name;
                    j.name=tempname;
                }
            }
        }
        System.out.println("list is sorted by marks in assending order");
    }
     public void SortDesending()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        for(Node i=head;i!=null;i=i.next)
        {
            for(Node j=i.next;j!=null;j=j.next)
            {
                if(i.marks>j.marks)
                {
                    double tempmarks=i.marks;
                    i.marks=j.marks;
                    j.marks=tempmarks;

                    int temprollno=i.rollno;
                    i.rollno=j.rollno;
                    j.rollno=temprollno;

                    String tempname=i.name;
                    i.name=j.name;
                    j.name=tempname;
                }
            }
        }
        System.out.println("list is sorted by marks in desending order");
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        System.out.println("student record list is");
        System.out.println("head--->");
        while(temp!=null)
        {
            System.out.print(temp.rollno+""+temp.marks+""+temp.name+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
class StudentRecord
{
    public static void main(String s[])
    {
        Student s1=new Student();
         s1.add(12,"Joe",9.78);
         s1.add(22,"Taylor",8.78);
         s1.add(23,"Steve",7.78);
         s1.add(13,"Aron",9.21);
         s1.add(17,"Smith",9.58);
         s1.add(19,"Kane",9.47);
         s1.display();
         s1.update(22,"Babar",4.55);
         s1.SortAssending();
         s1.display();
         s1.SortDesending();
         s1.display();
         s1.search(17);
         s1.display();
    }
}