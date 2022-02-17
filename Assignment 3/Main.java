package com.company;

class Link {
    public int iData;
    public double dData;
    public Link next;


public Link (int id, double dd){
    iData = id;
    dData = dd;            // constructor

}

public void displayLink(){
    System.out.println("{"+iData+", "+dData+"}");

 }
}

class LinkList{

    private Link first;

    public LinkList()
    {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, double dd){
        Link newLink = new Link(id,dd);
        newLink.next = first;
        first = newLink;

    }

    public Link deleteFirst()
    {
        Link temp = first;
        first = first.next;
        return temp;


    }

    public void displayList(){
        System.out.println("List (first --> last:) ");
        Link current = first;
        while ( current != null){
            current.displayLink();
            current = current.next;

        }
        System.out.println(" ");


    }

}

class Queue {
    Link start, end;

    public Queue()
    {
        start = end = null;
    }

    // add node to list at the end
    void Addqueue(int id, double dd)
    {

        // Create a new Linked List
        Link temp = new Link(id,dd);

        // If queue is empty, the node is both the start and end
        if ( end == null) {
            start = end = temp;
            return;
        }

        // Add the new node at the end of queue and change end pointer
        end.next = temp;
        end = temp;
    }

    // remove a link from start of queue
    void Deletequeue()
    {
        // If queue is empty, return NULL.
        if (this.start == null)
            return;

        // Store previous start and move start one node ahead
        Link temp = start;
        start = start.next;

        // If front becomes NULL, then change end also as NULL
        if (start == null)
            end = null;
    }
    public void displayList(){
        System.out.println("List (first --> last:) ");
        Link current = start;
        while ( current != null){
            current.displayLink();
            current = current.next;

        }
        System.out.println(" ");


    }

}

class List_Stack_and_Queue{

public static void main(String[] args){
    System.out.println("Queue Linked List");
    Queue q_list = new Queue();
    q_list.Addqueue(10,12.321);
    q_list.Addqueue(32,98.12);
    q_list.Addqueue(15,12.321);
    q_list.Addqueue(12,19.32);
    q_list.displayList();
    System.out.println("Delete First Link:");
    q_list.Deletequeue();
    q_list.displayList();

    System.out.println("Stack Linked List");
    LinkList s_list = new LinkList();
    s_list.insertFirst(33,129.12);
    s_list.insertFirst(2,92);
    s_list.insertFirst(8,32.123);
    s_list.insertFirst(22,12);
    s_list.displayList();
    System.out.println("Delete First Link:");
    s_list.deleteFirst();
    s_list.displayList();
    
    }

}

