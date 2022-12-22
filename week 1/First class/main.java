class Main{
    //create a method
    public int addnumbers(int a, int b){
     int sum = a+b;
     //return value
     return sum;
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        
        //create an object of main
        Main obj = new Main();
        //calling method
        int result = obj.addnumbers(num1,num2);
        System.out.println("Sum is:" + result);
        
    }
    
        
    }
