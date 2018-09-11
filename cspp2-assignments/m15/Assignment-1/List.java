import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
*class list.
*
*/

public class List extends Exception{
    //Implement all the methods mentioned to build a ListADT

    /*
     * The goal for the list is to store items.
     * How are we going to store the items in the list?
     * An array would be good. Right?
     * So, assume we are only going to have ints in the list
     * We need to create an array of ints to store the items
     * added to the list.
     *
     * Create a variable of the type int[]
     * Use the private access specifier
     * Why private access specifier and why not public?
     * Well, we don't want the array to be manipulated by
     * methods that are outside the List class.
     * If you allow methods outside the List class to manipulate
     * the array then there is a possibility of having a corrupted
     * list i.e., a list with incorrect items.
     * This is not desirable and so having private access specifer
     * will protect the array such corruption.
     * This is a hard concept to understand. Discuss with your mentor.
     *
    */
    /**
     * list array.
     */
    private int[] list;
    /**
     * size of list.
     */
    private int size;
    // declare a private int[]
    // don't create the array yet using new
    // that's the job of the List constructor

    /*
     * What are the other class variables needed for creating a list?
     * How about keeping track of the size of the list?
     * If you add 2 items to the list then the size should be 2.
     * Let's think about the size of the list by comparing it to the
     * length of the array. Do they mean the same?
     * No, Array length signifies the maximum number of items
     * you can store in the list. Whereas, the size of the list
     * denotes the number of items in the list. Makes sense?
     * Here is an example:
     * array = [1,2,3,0,0,0,0,0,0,0]
     * The length of the array is 10 and size is 3.
     * This means you can store 10 items in the list and
     * currently it has 3 items.
     * So, to keep track of the size we need a variable called size
     * Again, we use private as we don't want that size variable
     * to be accessed by the methods that are outside of the List class.
     *
     */
    // declare a private int size
    // again, don't initialize it here
    // variable initialization should be done in the constructor

    /*
     * The purpose of the constructor is to initialize the class variables with
     * some default values.
     */

    /**
     * Constructs the object.
     */
    public List() {

        // what are the two variables to be initialized here? think about the
        // private variables described above. What should be the default values?
        // In the case of the list, it should be empty but it should be
        // initialized with an array size like 10

        // Think about the initial value for size.
        // How many items do we have in the list when you create it?
        // An empty list has how many items?
        // That is the initial value to use for size.
        final int ten = 10;
        list = new int[ten];
        size = 0;

    }
    /*
     * The add method does what the name suggests. Add an int item to the list.
     * The assumption is to store the item at the end of the list What is the
     * end of the list? Is it the same as the end of the array? Think about how
     * you can use the size variable to add item to the list.
     *
     * The method returns void (nothing)
     */
    /**
     * Constructs the object.
     *
     * @param      capacity  int capacity
     */
    public List(final int capacity) {
        size = 0;
        list = new int[capacity];
    }
    /**
     * add element to list.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        //Inserts the specified element at the end of the list.
        list[size++] = item;
    }

    /*
     * The size method returns the value of the size. The purpose of the method
     * is to announce the size of the list to the objects outside the list
     *
     * The method returns an int. Empty list should return 0.
     *
     */
    /**
     * to get size of list.
     *
     * @return  size of list.
     */
    public int size() {
        // replace the code below to implement the size method
        return size;
    }
    /**
     * resize the list.
     */
    private void resize() {
        list = Arrays.copyOf(list, 2 * size);
    }
    /*
     * The remove method does what the name suggests. Removes an int item,
     * specified by the index argument, from the list It also does an additional
     * step. Think about what happens when an item is removed from the middle of
     * the list It creates a hole in the list, right? This would mean, all the
     * items that are to the right side of the removed item should be moved to
     * the left by one position. Here is an example: array =
     * [1,2,3,0,0,0,0,0,0,0] remove(1) would remove the item 2 which is at index
     * position 1. But how do you remove the item from an array? Well, the way
     * to remove it is to move all the items, that are to the right of the
     * removed item, to the left So, the new array looks like this. array =
     * [1,3,0,0,0,0,0,0,0,0] The method returns void (nothing)
     *
     */
    /**
     * remove element from list through index.
     *
     * @param      index  int index
     */
    public void remove(final int index) {
        // write the logic for remove here. Think about what to do to the size
        // variable.
        try {
        //if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            list[size] = 0;
            size--;
         
    }
    catch(Exception e){
            System.out.println("Invalid Position Exception");
        }
    }

    /*
     * Get method has to return the items that is at the index position passed
     * as an argument to the method. If the item doesn't exist then return a -1
     * to indicate that there is no element at that index. How can an element
     * not be there at a given position? Well, if the position is greater than
     * the number of items in the list then that would mean the item doesn't
     * exist. How do we check if the position is greater than the number of
     * items in the list? Would size variable be useful?
     */
    /**
     * get the element.
     *
     * @param      index  The index
     *
     * @return    element of that index
     */
    public int get(final int index) {
        // Replace the code below to write the code for get
        if (index < 0 || index >= size) {
            return -1;
        } else {
            return list[index];
        }
    }

    /*
     * What happens when you print an object using println? Java provides a
     * method named toString that is internally invoked when an object variable
     * is used in println. For example: List l = new List();
     * System.out.println(l); This statement is a shortcut for
     * System.out.println(l.toString());
     *
     * So, implement the toString method to display the items in the list in the
     * square brackets notation. i.e., if the list has numbers 1, 2, 3 return
     * the string [1,2,3] Caution: The array may be having other elements
     * Example: [1,2,3,0,0,0,0,0,0,0] toString should only return the items in
     * the list and not all the elements of the array.
     */
    /**
     * Returns a string representation of the object.
     *
     * @return     String.
     */
    public String toString() {
        // Replace the code below
        if (size == 0) {
            return "[]";
        }
        String str = "[";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + list[i] + ",";
        }
        str = str + list[size - 1] + "]";
        return str;
    }
    /*
     * Contains return true if the list has the item passed as an argument to
     * the method So, iterate through the list and return true if the item
     * exists and otherwise false
     */
    /**
     *checks for a item in the list.
     *
     * @param      item  The item
     *
     * @return     true if present else false.
     */
    public boolean contains(final int item) {
        // Replace the code below
        return indexOf(item) != -1;
    }
    /*
     * Returns the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element.
     */
    /**
     * Searches for the element.
     *
     * @param      item  The item
     *
     * @return     index of element if preent else -1.
     */
    public int indexOf(final int item) {
        // Replace the code below
        for (int i = 0; i < size; i++) {
            if (item == list[i]) {
                return i;
            }
        }
        return -1;
    }
    /* Returns the count of occurances of a given item in the list*/
/**
 * { count function. }
 *
 * @param      item  int item.
 *
 * @return     { int count }
 */
    public int count(final int item) {
         // write the logic
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (item == list[i]) {
                count++;
            }
        }
        return count;
    }
    /*
    Inserts all the elements of specified int array to the end of list
    */

    /**
     * adds all the elements.
     *
     * @param      newArray  The items
     */
    public void addAll(final int[] newArray) {
        // write the logic
        for (int i = 0; i < newArray.length; i++) {
            list[size] = newArray[i];
            size++;
            if (size == list.length) {
                resize();
            }
        }

    }
    /*
     Removes all of its elements that are contained in the specified int
     array.
    */
   /**
     * removes all.
     *
     * @param      newArray  The items
     */
     public void removeAll(final int[] newArray) {
        // write the logic
        for (int item : newArray) {
            for (int i = 0; i < size; i++) {
                if (list[i] == item) {
                    remove(i);
                    i--;
                }
            }
        }
    }
    /*
    Returns a list object containing elements, including startIndex and
    excluding endIndex. The first parameter indicates the startIndex and the
    second parameter indicates the endIndex. Returns null and print
    "Index Out of Bounds Exception" if any of values start and end are negative
    and also if start is greater than end.
    */
    /**
     *
     *
     * sublist.
     *
     * @param      start  The start
     * @param      end    The end
     *
     * @return     sublist
     */
    public List subList(final int start, final int end) {
    // write the logic for subList
   if (start > end) {
    System.out.println("Index Out of Bounds Exception");
    return null;
   }
   if (start < 0 || end < 0) {
    System.out.println("Index Out of Bounds Exception");
    return null;
   }
   if (start == end) {
    System.out.println("Index Out of Bounds Exception");
    return null;
   }
   if (start > size || end > size) {
    System.out.println("Index Out of Bounds Exception");
    return null;
   }
   List listOne = new List();
   for (int i = start; i < end; i++) {
    listOne.add(list[i]);
   }
     return listOne;
    }
    /*
    Returns a boolean indicating whether the parameter i.e a List object is
    exactly matching with the given list or not.
    */
    /**
     * compares the lists.
     *
     * @param      listOne  The list
     *
     * @return    true or false
     */
    public boolean equals(final List listOne) {
    // Replace the code below
    return this.toString().equals(listOne.toString());
    }
    /*
    * Removes all the elements from list
    * Think about this case and make the method
    * the simpler.
    */
    /**
     * clears the list.
     */
    public void clear() {
    // write the logic for clear.
        size = 0;
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */

    public static void main(final String[] args) {
        // create an object of the list to invoke methods on it
        List l = new List();

        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "add":
                    if (tokens.length == 2) {
                        String[] t = tokens[1].split(",");
                        if (t.length == 1) {
                            l.add(Integer.parseInt(tokens[1]));
                        }
                    }
                break;
                case "size":
                    System.out.println(l.size());
                break;
                case "print":
                    System.out.println(l);
                break;
                case "remove":
                    if (tokens.length == 2) {
                        l.remove(Integer.parseInt(tokens[1]));
                    }
                break;
                case "indexOf":
                    if (tokens.length == 2) {
                        System.out.println(l.indexOf(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "get":
                    if (tokens.length == 2) {
                        System.out.println(l.get(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "contains":
                    if (tokens.length == 2) {
                        System.out.println(l.contains(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "addAll":
                    if (tokens.length == 2) {
                        String[] t1 = tokens[1].split(",");
                        int[] temp = new int[t1.length];
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = Integer.parseInt(t1[i]);
                        }
                        l.addAll(temp);
                    }
                break;
                case "count":
                System.out.println(l.count(Integer.parseInt(tokens[1])));
                break;
                case "removeAll":
                    if (tokens.length == 2) {
                        String[] t2 = tokens[1].split(",");
                        int[] a = new int[t2.length];
                        for (int i = 0; i < t2.length; i++) {
                            a[i] = Integer.parseInt(t2[i]);
                        }
                        l.removeAll(a);
                    }
                break;
                case "subList":
                    if (tokens.length != 2) {
                        break;
                    }
                    String[] arrstring3 = tokens[1].split(",");
                    List object = l.subList(Integer.parseInt(arrstring3[0]),
                        Integer.parseInt(arrstring3[1]));
                    if (object != null) {
                        System.out.println(object);
                    }
                    break;
                case "equals":
                    if (tokens.length == 2) {
                        String[] lt = tokens[1].split(",");
                        List l2 = new List();
                        for (int k = 0; k < lt.length; k++) {
                            l2.add(Integer.parseInt(lt[k]));
                        }
                        System.out.println(l.equals(l2));
                }
                break;
                case "clear":
                    l.clear();
                break;
                default:
                break;
            }
        }
    }
}

