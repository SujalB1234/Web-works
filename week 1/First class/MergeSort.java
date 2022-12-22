import java.util.*;
public class MergeSort{

ArrayList getInput(ArrayList<Integer> al){
Scanner sc = new Scanner(System.in);
//ask user to enter list size and get input
System.out.println("Enter your list size: ");
int len = sc.nextInt();
for(int i = 0; i < len; i++){
System.out.println("Enter your element: ");
al.add(sc.nextInt());
}
return al;
}

void getOutput(ArrayList<Integer> al){
//sort the array list and print output
System.out.println("Unsorted Array List: ");
System.out.println(al);
sort(al, 0, al.size()-1);
System.out.println("Sorted Array List: ");
System.out.println(al);

}

void merge(ArrayList<Integer> al,int beg,int mid, int end){
//get the size of the sub arrays

 int n1 = mid - beg + 1;
 int n2 = end - mid;

// Create two new subarrays


ArrayList <Integer> subArray1 = new ArrayList<Integer>(n1);
ArrayList<Integer> subArray2 = new ArrayList<Integer>(n2);

//get element in the two subarrays from al

for(int i = 0; i < n1;i++){
subArray1.add(al.get(beg + i));
}
for(int i = 0; i < n2;i++){
subArray2.add(al.get(mid + 1 + i));
}

//initializing indexing variables
int i = 0, j = 0;
int k = beg;

while(i <n1 && j <n2){
if(subArray1.get(i).compareTo(subArray2.get(j)) < 0){
al.set(k,subArray1.get(i));
i++;
}
else{
al.set(k,subArray2.get(j));
j++;
}
k++;
}
//copying any element if left
while (i < n1)
{
al.set(k,subArray1.get(i));
i++;
k++;
}

while (j < n2)
{
al.set(k,subArray2.get(j));
j++;
k++;
}
}
void sort(ArrayList<Integer> al, int beg, int end){
//control statement for recursion
if(beg == end){
return;
}

if(beg<end){
//split array recursively
int mid = (beg+end)/2;
sort(al,beg,mid);
sort(al,mid+1,end);
//merge the splitted arrays
merge(al,beg,mid,end);
}

}
public static void main(String[] args){
MergeSort obj = new MergeSort();
ArrayList<Integer> input = new ArrayList<Integer>(500);
input = obj.getInput(input);
obj.getOutput(input);
}
}