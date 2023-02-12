// what is the difference between ListIterator and iterator in java
  Listiterator
  * List Iterator Traverse in both direction forword and backword.
  * List Iterator used in list. 
  * list iterator helps to replace an elemnet.
  *	Certain methods of ListIterator are next(), previous(), hasNext(), hasPrevious(), add(E e).
  
  Iterator
  * iterator can traverse only in forword direction.
  * used in collection framework in java .
  * iterator not helps to iterate an element
  *  Certain methods of Iterator are next(), remove() and hasNext().
  
  eX :
	  List a=new ArrayList();
      a.add(10);
      a.add(12);
      a.add(14);
      
      Iterator i= a.iterator();
      while(i.hasNext()) {
    	  system.out.println(i.next())
      }
      
      ListIterator j=a.listIterator();
      while(j.hasnext()) {
    	  System.out.println(i.next); //for forword
      }
      while(i.hasPrevious()) {
    	  System.out.println(i.previous());  // for backword
      }
  