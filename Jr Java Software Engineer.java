
class Node{
 Node next;
 int value;
}
// Your resolution 

/*Use two extra pointers to keep track of next node and previous nodes

The next node is used to move ahead,
previous node is used to reverse the LinkedList nodes.

*/

// Time complexity:  O(n)

/*Need to traverse the whole list completely 
*/


// Space complexity:  O(1);

/* No extra space is utilized while reversing the nodes. Only Temporary storage of object references are used

*/
public Node reverse(Node head){

Node next;
Node cur = head;
Node prev = null

while(head != null){
next = cur.next;
cur.next = prev;
prev = cur;
cur = next;


}
return prev;
	
}
// JUnit test cases 

Test Case1:  
list1 = null;
assert(null,reverse(list1));

Test Case2:  
list1 = 1;
assert(1,reverse(list1));

Test Case3:
list1 = 1->2
list2 = 2->1;
assert(list2, reverse(list1));

Test Case3:
list1 = 1->2->3->4
list2 = 4->3->2->1;
assert(list2, reverse(list1));




Sum of multidimensional Array. require no extra space, no recursion. 


class MultiDimensionArray {
    // This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
        //... 
        return value;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
   // Your resolution 
   
   int sum = 0;
   
   for each element in lengthOfDeminsion
		for(int i = 0 to lengthOfDeminsion[i]){
			
			for(int i = 0 to lengthOfDeminsion[i+1]){
				
					for(int j = 0 to lengthOfDeminsion[i+2]){
							
							for(int k = 0 to lengthOfDeminsion[i+3]){
								
								.
								.
								.
								for(int x = 0 to lengthOfDeminsion[n-1]){
									
									sum+=mArray[i][j][k]...[x];
								}
							}
					}
				.
				.
				.
			}
		}

  return sum;
    }

			
   
   
   // Time complexity:  
   
  /* 
  
  O( N ^ lengthOfDeminsion.size())
  
   */
   
   // Space complexity: 
   
   /*
   O( lengthOfDeminsion[0] + lengthOfDeminsion[1] + ... + lengthOfDeminsion[n-1] )
   */

  
 
Given a list of numbers, see if you can separate them in to k groups such that each group has the same sum. 


public boolean separate(List<Integer> list, int k){


	public boolean separate(List<Integer> list, int k){
		
		int listSize = list.size();
		
		if(list.size()%k != 0)
			return false;
		else{
			
			Collections.sort(list);
			for(int i=0,j=listSize-1;i<list.size()/2;i++,j--){
				
				int sum1 = (list.get(i) + list.get(j));
				int sum2 = (list.get(i+1) + list.get(j-1));

			}
		}
	
		return false;
		
		
	}
   // Your resolution 
   
   // Time complexity:  O(nlgn)
   *Sorting complexity : Assuming sort() is mergesort.
   // Space complexity: O(1);
}
  // JUnit test cases 
  Test Case1:
  int[] arr = {1,2,3,4}
  aasert(true,separate(arr,2));
  
    Test Case2:
  int[] arr = {1,3,5,2,4}
  aasert(false,separate(arr,3));
  
  
    Test Case2:
  int[] arr = {0,1,2,3,4,5}
  aasert(false,separate(arr,3));
  
  
Implements of  Singleton or Dynamic Proxy
Assume you are using Java 7+

/* One of the Singleton that I made use of for a project.
https://github.com/raksha105/BaltimoreCityData

Implemented HibernateUtil as a Singleton
*/


//Singleton

public class Singleton{}

private static Singleton s;

private Singleton(){};

public synchronized Singleton getInstance(){
	
	if(s == null)
		s = new Singleton();
	return s;
	
}



When the project is using Spring 4.3  and Hibernate 5.2, 
how to write the JUnit test without bounded with concrete DB closely. 
In other words, How to mock DB in JUnit test for service method.  
If not possible give the reason else list cases for the different scenario. 

Use mock db objects and unit test every business logic using the service layer with db.
Prefereably in-memory db and mock service for create, update, insert and run few queries.It is best to mock db layer and write separate tests with
service layer logic.
