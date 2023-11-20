class Student{
    int num1;
    String name;
    int marks; 
}



public class Arrays {
    
    // enhanced for loop: (not need to specify the size of the array.)
    public static void  display(int arr[][]){
        for(int a[]: arr){
            for (int b: a){
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
    
    // 1D array

    int arr1[] = new int[4];
    // or
    int arr2[] = {1,2,3,4};
    
    
    
    //2D array

    int arr[][] = new int[3][4];

    int random = 0;
    for (int i =0 ;i<arr.length;i++){
        for (int j=0;j<arr[0].length;j++){
            random = (int)(Math.random() * 10);        
            arr[i][j] = random;
        }
        
    }

    for (int i =0 ;i<arr.length;i++){
        for (int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println("");
    }
    display(arr);
    
    // jagged array
    // column size not specified during initialization
    int arr3[][] = new int[4][];
    // column size specified seperately.
    arr3[0] = new int[3];
    arr3[1] = new int[4];
    arr3[2] = new int[5];



    Student n1 = new Student();
    System.out.println(n1.num1);
    // instance variable --> default is 0
    
    
    // Array of objects----->

    Student s1 = new Student();
    s1.name = "Griffin";
    s1.marks = 90;

    Student s2 = new Student();
    s2.name = "Golphin";
    s2.marks = 90;

    Student students[] = new Student[2];
    students[0] = s1;
    students[1] = s2;

    for( Student stu : students){
        System.out.println(stu.name + " : " + stu.marks);
    }

    }
}


/*
Drawbacks of array.

-> fixed size only.
-> To expand the array we have to make a copy of the array,
which is expensive.
-> Searching requires traversing the elements.
-> There can't be multiple datatype in a array.
But this is overcomed by "COLLECTIONS"



 */
