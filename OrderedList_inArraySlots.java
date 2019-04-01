/**
  Represent a list, implemented in a chain of nodes
  Credit to solutionHolmes
 */

public class OrderedList_inArraySlots{
    private List_inArraySlots finalList;

    /**
      Construct an empty list
      The default constructor is fine:
      take zero arguments
      do nothing
     */
    public OrderedList_inArraySlots() {
        finalList = new List_inArraySlots();
    }    
    
    /**
      @return the number of elements in this list
     */
    public int size() {
        // recursive approach seems more perspicuous
        return finalList.size();
    }

     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        return finalList.toString();
    }
     
     public int set( int index, int newValue ) {
        int returned = finalList.get(index);
        this.remove(index);
        this.add(newValue);
        return returned;
    }
    
    public int get( int index ) {//tried nttsst here but can't figure it out
        return finalList.get(index);
    }
    
    public boolean add( int val) {
        for(int index = 0; index < finalList.size(); index++)
            if (finalList.get(index) > val) {
                finalList.add(index, val);
                return true;
            }
            finalList.add(val);
         return true;
     }
    
    public int remove( int index) {
        return finalList.remove(index);
     }
}