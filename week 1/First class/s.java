import java.util.*;
public class s{

ArrayList getInput(ArrayList<Integer> al){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your list size: ");
int len = sc.nextInt();
for(int i = 0; i < len; i++){
System.out.println("Enter your element: ");
al.add(sc.nextInt());
}
return al;
}

void getOutput(ArrayList<Integer> al){

sort(al, 0, al.size()-1);
System.out.println("Sorted Array List: ");
System.out.println(al);

}

void merge(ArrayList<Integer> al,int beg,int mid, int end){


 int n1 = mid - beg + 1;
 int n2 = end - mid;




ArrayList <Integer> subArray1 = new ArrayList<Integer>(n1);
ArrayList<Integer> subArray2 = new ArrayList<Integer>(n2);



for(int i = 0; i < n1;i++){
subArray1.add(al.get(beg + i));
}
for(int i = 0; i < n2;i++){
subArray2.add(al.get(mid + 1 + i));
}


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

if(beg == end){
return;
}

if(beg<end){

int mid = (beg+end)/2;
sort(al,beg,mid);
sort(al,mid+1,end);
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