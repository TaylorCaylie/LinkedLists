public class GenLinkedList<T> {

    Node<T> head;

    public void addFront(T data){ // receives an item to add as a parameter, and adds to the front of the list.
        Node<T> node = new Node<T>();
        node.data = data;

        if(head == null){ //if empty then next element will be empty
            node.next = null;
        }else{ //else if already existing list move head over to be replaced
            node.next = head;
        }
        head = node; //assign new head
    }

    public void addEnd(T data){ //receives an item to add as a parameter, and adds to the end of the list.
        Node<T> node = new Node<T>();
        node.data = data;

        if(head == null){ //if head is null then attach node to head
            head = node;
        }else{
            Node i = head;
            while(i.next!=null){ //traverse through list
                i = i.next;
            }
            i.next = node;  //add to end of list
        }

    }

    public void removeFront(){ //removes a node from the front of the list.
        Node<T> node = new Node<T>();
        Node x = head;

        if(head == null){ //if head is null then attach node to head
            throw new RuntimeException("The list is null, deletion not valid.");
        }else{
            x = x.next;
        }
        head = x;
    }

    public void removeEnd(){ //removes a node from the end of the list.
        Node<T> node = new Node<T>();
        Node y = head;
        if(y == null || y.next == null){ //if head is null then attach node to head
            throw new RuntimeException("The list is null or only one element, resulting list is null.");
        }else{
            Node i = head;  //establish head
            while(i.next.next!=null){ //find the second to last element
                i = i.next; //set the second to last element to i
            }
            i.next = null; //set the last element to null
        }
    }

    public void set(int pos, T data){ //receives a position and item as parameters, sets the element at this
                        //position, provided it is within the current size
    Node<T> node = new Node<T>();
    int counter = 0;
    Node a = head;

        if(pos < 0 || head == null){
            throw new RuntimeException("The list is null or index entered is not valid"); //test case
        }else{
            while(pos != counter){ //increment counter by 1 each loop iteration until desired index has been reached
                a = a.next;          //each time the loop occurs switch to next element to get to the nth position
                counter++;
            }
        }
        a.data = data; //set the index to the value given
    }

    public T get(int pos){
                        // receives a position as a parameter, returns the item at this position,
                         // provided it is within the current size
    Node<T> node = new Node<T>();
    int counter = 0;
    Node z = head;

    if(pos < 0 || head == null){
   throw new RuntimeException("The list is null or index entered is not valid"); //test case
   }else{
       while(pos != counter){ //increment counter by 1 each loop iteration until desired index has been reached
           z = z.next;          //each time the loop occurs switch to next element
           counter++;
       }
    }

        return(T) z.data; //return element at index
    }

    public void swap(int firsPos, int secPos){
        //receives two index positions as parameters, and swaps the nodes at
        //these positions, provided both positions are within the current size
        Node<T> node = new Node<T>();
        int counter = 0;
        Node b = head;

        if(firsPos < 0 || b == null){ //get the element at the first given index
            throw new RuntimeException("The list is null or index entered is not valid"); //test case
        }else{
            while(firsPos != counter){ //increment counter by 1 each loop iteration until desired index has been reached
                b = b.next;          //each time the loop occurs switch to next element
                counter++;
            }
        }

        int secondCounter = 0;

        Node n = head;

        if(secPos < 0 || n == null){ //get the element  at the second given index
            throw new RuntimeException("The list is null or index entered is not valid"); //test case
        }else{
            while(secPos != secondCounter){ //increment counter by 1 each loop iteration until desired index has been reached
                n = n.next;          //each time the loop occurs switch to next element
                secondCounter++;
            }
        }

        T temp = (T) b.data;

        b.data = n.data;

        n.data = temp;

    }

    public void shift(int move){
        //receives an integer as a parameter, and shifts the list forward or
        //        backward this number of nodes, provided it is within the current size

        if(move == 0){ //base case
            return;
        }
        Node<T> prevHead = head;

        Node<T> k = head;  //establish head
        while(k.next.next!=null){ //find the second to last element
            k = k.next; //set the second to last element to i
        }
        head = k.next;
        head.next = prevHead;
        k.next = null;
        shift(move -1 ); //recursion

    }

    public void removeMatching(T element){ // receives a value of the generic type as a parameter and removes all
       // occurrences of this value from the list.
        Node<T> node = new Node<T>();
        node = head;
        Node temp = null;

        while(node!=null){ //until  end of list

            node = node.next; //iterate

            if(node == element){ //if match then delete
               temp = (Node) node.data;

               node.next = node.next.next;

                 System.gc();
            }
        }

    }


    public void erase(int pos, int data){
    //receives an index position and number of elements as parameters, and
        //        removes elements beginning at the index position for the number of
        //        elements specified, provided the index position is within the size
        //        and together with the number of elements does not exceed the size
        Node<T> node = new Node<T>();
        int counter = 0;
        Node a = head;

        if(pos < 0 || head == null){
            throw new RuntimeException("The list is null or index entered is not valid"); //test case
        }else{
            while(pos != counter){ //increment counter by 1 each loop iteration until desired index has been reached
                a = a.next;          //each time the loop occurs switch to next element to get to the nth position
                counter++;
            }
        }




    }

    public void insertList( T list, int pos){
    //receives a generic List (a Java List) and an index position as parameters,
        //        and copies each value of the passed list into the current list starting
        //        at the index position, provided the index position does not exceed the size.
        //        For example, if list has a,b,c and another list having 1,2,3 is inserted at
        //        position 2, the list becomes a,b,1,2,3,c

    }


    public void output(){ //output the list
        Node<T> node = head;

        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data); //output last element
    }

}
