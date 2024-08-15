/*
 * Unlike arrays, ArrayList can grow and shrink dynamically as elements are added or removed.
 * ArrayList can contain duplicate
 * Maintains Insertion Order
 * Allows Null Values
  ArrayList<String> fruits = new ArrayList<>();
  // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Adding an element at a specific index
        fruits.add(2, "Grapes"); // Adds "Grapes" at index 2, shifting subsequent elements to the right.

        // Printing the ArrayList
        System.out.println("ArrayList: " + fruits);

        // Accessing elements from the ArrayList
        String firstFruit = fruits.get(0); // Gets the element at index 0
        System.out.println("First Fruit: " + firstFruit);

        // Changing an element at a specific index
        fruits.set(1, "Strawberry"); // Changes the element at index 1 to "Strawberry"
        System.out.println("Updated ArrayList: " + fruits);

        // Removing an element from the ArrayList
        fruits.remove("Mango"); // Removes the first occurrence of "Mango" from the ArrayList.
        System.out.println("After removing Mango: " + fruits);

        // Removing an element at a specific index
        fruits.remove(2); // Removes the element at index 2 ("Grapes")
        System.out.println("After removing element at index 2: " + fruits);

        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Iterating over the ArrayList
        System.out.println("Fruits in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if the ArrayList contains a specific element
        if (fruits.contains("Banana")) {
            System.out.println("ArrayList contains Banana");
        } else {
            System.out.println("ArrayList does not contain Banana");
        }

        // Clearing all elements from the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }

*Advantages of ArrayList
Dynamic Resizing: ArrayList automatically resizes itself 
Random Access: similar to arrays.
Ease of Use: It provides many built-in methods
*Disadvantages of ArrayList
Performance: Inserting or removing elements from the middle of an ArrayList can be slow, as it requires shifting elements.
Memory Overhead: Since ArrayList grows dynamically, it may allocate more memory than necessary, leading to some overhead.
*When to Use ArrayList
a resizable array-like structure.
to frequently add and remove elements, especially at the end.
to maintain the order of elements.

 */
//* O(N) - O(N) for storing the elements in Map, vector */
import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
    Pair()
    {
        
    }
}

class Problem19b{
static void Sortelementsbyfreq(int arr[], int n)
{
  Map<Integer,Integer> map=new HashMap<>();
  for (int i = 0; i < n; i++) {
    map.put(arr[i], map.getOrDefault(arr[i],0)+1);
  }

  ArrayList<Pair> vec=new ArrayList<>();
  for(int x:map.keySet()){
    vec.add(new Pair(x,map.get(x)));
  }
/* How a & b comparision happens?
 * - : remain in same order
 * + : later comes before first one
 * = : means they are equal in order
 */
  Collections.sort(vec,(a,b)->{
    if(a.second==b.second){
      return a.first-b.first;
    }else{
      return b.second-a.second;
    }
  });

  for (int i = 0; i < vec.size(); i++)
  {
    while (vec.get(i).second > 0)
    {
      System.out.print(vec.get(i).first+" ");
      vec.get(i).second--;
    }
  }
  
}
public static void main(String args[])
{
  int arr[] = {3, 3, 5, 2, 1, 1, 2};
  int n = 7;
  Sortelementsbyfreq(arr, n);
 
}
}
