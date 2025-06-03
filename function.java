//code for lecture number 6 -functions and methods
 import java.util.Scanner;
public class functions6{

    //functions
    // public static void HelloWorld(){
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    
    //     System.out.println("hello world");
	 //     System.out.println("hello world");
 //     System.out.println("hello world");

    //   
    // }
    // public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
        // HelloWorld();
        //calsum();
        //functions with parameters
        // int a =sc.nextInt();
        //  int b =sc.nextInt();
        //    calsum(a,b);    //arguments or actual parameters


    // public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
    //     funxtions with return type.
    //      int a =sc.nextInt();
    //      int b =sc.nextInt();
    //      int sum=calsum(a,b);
    //      System.out.println("the sum is:"+ sum);


    //swapping of 2numbers
    // public static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;

    //  System.out.println("a is:"+a);   //a=10

    //  System.out.println("b is:"+b);    //b=5
    // }

    // public static void main(String[] args) {
    // Scanner sc =new Scanner(System.in);
    // //swaps
    // int a=5;
    // int b=10;


    // swap(a,b);



    //  public static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;         //using this lines value of a and b changes to 10 and 5


    // }

    // public static void main(String[] args) {
    // Scanner sc =new Scanner(System.in);
    // //swaps
    // int a=5;
    // int b=10;


    // swap(a,b);   //the copy of a=5 and b=10 is passed to swap function

    //  System.out.println("a is:"+a);    //when the value of a and b return to main function to get print original values of a and b gets printed that is 5 and 10 bcz java calls by value

    //  System.out.println("b is:"+b);



 // calculate product of 2 numbers using java programming language
    // public static int product(int a ,int b){

    //     int pro=a*b;
    //     return pro;

    // }

    // public static void main(String[] args) {
    //  Scanner sc =new Scanner(System.in);

    //  //product of a and b
    //  int a =sc.nextInt();
    // int b =sc.nextInt();
    // int pro = product(a,b);
    // System.out.println("the product  of a and b is:" + pro);


// public static int fact(int n){
//       int fact=1;
//       for(int i=1;i<=n;i++){
//         fact=fact*i;
//       }
//       return fact;
// }

//        public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);
//      //find factorial of number,n

//      System.out.println("enter a number:-");
//      int n=sc.nextInt();

//      int fact=fact(n);
//      System.out.println("the factorial of the guven number  is" + fact);


// // maam code
// //binomial coeffient
//     public static int fact(int n){
//       int fact=1;
//       for(int i=1;i<=n;i++){
//         fact=fact*i;
//       }
//       return fact;
// }

// public static int bc(int n, int r){
//     int fact_n=fact(n);
//       int fact_r=fact(r);
//         int fact_nmr=fact(n-r);
//         int bino=fact_n / (fact_r * (fact_nmr));
//         return bino;

// }

//        public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);
//      //find factorial of number ,n
       // only change in the maam code is that she has directly given the inputs in the defined functions
//      int fact=fact(5);
//      System.out.println("the factorial is" + fact);
//      int bino=bc(5,8);
//      System.out.println("the binomial coeefe is:" + bino);


// my code
// //binomial coeffient of the given number very important 
// public static int fact(int n){
//       int fact=1;
//       for(int i=1;i<=n;i++){
//         fact=fact*i;
//       }
//       return fact;
// }

// public static int bc(int n, int r){
//     int fact_n=fact(n);
//       int fact_r=fact(r);
//         int fact_nmr=fact(n-r);
//         int bino=fact_n / (fact_r * (fact_nmr));            binomial coeffient= n!/ k!*(n-k)!
//         return bino;

// }

// public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);
//      //find factorial of number ,n
//      System.out.println("enter n:-");
//     int n=sc.nextInt();
//     System.out.println("enter r:-");
//     int r=sc.nextInt();
//     int fact=fact(n);
//      System.out.println("the factorial is" + fact);
//      int bino=bc(n,r);
//      System.out.println("the binomial coeefe is:" + bino);



//function overloading using parameters
// public static int sum(int a,int b){
//   return a+b;

// }
// public static int sum(int a,int b,int c){
//   return a+b+c;

// // }
// public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);
     // sum of 2 numbers
    //  int a = sc.nextInt() ;
    //  int b = sc.nextInt() ;
    //  int sum=sum(a,b);
    //  System.out.println("the sum of two numbers is:"+ sum);

         // sum of 3 numbers
        //int a = sc.nextInt() ;
        //int b = sc.nextInt() ;
//      int c=sc.nextInt();
//      int sum2=sum(a,b,c);
//     System.out.println("the sum of 3 numbers is:"+ sum2);




//function overloading using data types
// public static int sum(int a,int b){
//   return a+b;

// }
// public static float sum(float a,float b){
//   return a+b;

// }
// public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);

//      float a = sc.nextFloat() ;
//      float b = sc.nextFloat() ;

//      int sum=sum(7,6);
//      float sum2=sum(a,b);
//      System.out.println("the sum of 2 numbers is:"+ sum);
//     System.out.println("the sum of 3 numbers is:"+ sum2);


        //check if the number is prime or not
    //  int n=sc.nextInt();
    // if(n==2){
    //      System.out.println("n is a prime number");
    // }else{
    //     boolean isPrime=true;
    // for(int i=2;i<=Math.sqrt(n);i++){

    //     if(n%i==0){
    //        isPrime=false;
    //     }
    //     }
    //     if(isPrime==true){
    //         System.out.println("n is a prime number");

    //     }else{
    //         System.out.println("n is a composite number");
    //     }




// using functions

//   public static boolean isPrime(int n){

//       if(n == 2){
//       return true;
// }
//       boolean isPrime=true;
//       for(int i=2;i<n-1;i++){
//         if(n%i==0){
//         isPrime=false;
//         }

//       }

//       return  isPrime;
//     }

// public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);
//      System.out.println("enter the number:");
//     int n=sc.nextInt();
//     boolean prime=isPrime(n);
//     System.out.println(prime);


    //optimized code
// public static boolean isPrime(int n) {
//       if(n==2){
//       return true;
// }

//       for(int i=2;i<Math.sqrt(n);i++){
//         if(n%i==0){
//         return false;
//         }

//       }

//       return  true;
//     }

// public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);
//      System.out.println("enter the number:");
//     int n=sc.nextInt();
//     boolean prime=isPrime(n);
//     System.out.println(prime);


// }



//primes in a range
// public static void primesrange(int n){
//   for(int i=2;i<=n;i++){
//     if(isPrime(i)){                  //we will use the isprime function made above.
//       System.out.print(i+" ");
//     }
//   }
//   System.out.println();
// }


// public static void main(String[] args) {
//      Scanner sc =new Scanner(System.in);
//      System.out.println("enter the number:");
//     int n=sc.nextInt();
//     boolean prime=isPrime(n);
//     System.out.println(prime);

//     System.out.println("enter the range:");
//       int range=sc.nextInt();
//       primesrange(range);
//       isPrime(n);
// }




//convert binary to decimal
// public static void binarytodecimal(int n){
//   int pow=0;
//   int dec=0;

//   while(n>0){
//     int lastdigit=n%10;
//     dec=dec+(lastdigit *(int) Math.pow(2,pow));      //(int) converts the result from double to int, because Math.pow returns a double.
//     pow++;
//     n=n/10;
//   }
//   System.out.println("the decimal number of given binary number is:-" +dec);
// }


// public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       System.out.println("enter the binary number:");
//       int n=sc.nextInt();
//     binarytodecimal(n);

// }

//decimal to binary
// public static void decimaltobinary(int n){
//   int pow=0;
//   int result=0;

//   while(n>0){
//     int lastdigit=n%2;
//     result= result+(lastdigit *(int) Math.pow(10,pow));
//     pow++;
//     n=n/2;
//   }
//   System.out.println("the binary number of given binary number is:-" + result);
// }
// public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       System.out.println("enter the decimal number:");
//       int n=sc.nextInt();
//     decimaltobinary(n);



//practice questions
//1.avg of 3 number using functions
// public static int avgofthreenum(int a,int b,int c){
//     int avg=(a+b+c)/3;
//     return avg;
// }

// public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       System.out.println("enter a:");
//       int a =sc.nextInt();
//             System.out.println("enter b:");
//       int b =sc.nextInt();
//             System.out.println("enter c:");
//       int c =sc.nextInt();
//     int avg=avgofthreenum(a,b,c);
//     System.out.println("the avg of three numbers is:" + avg);



//2.if the given number is even or not

// public static boolean isEven(int n){
//     if(n%2==0){
//         return true;
//     }else{
//         return false;
//     }

// }
//  public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       System.out.println("enter n:");
//       int n =sc.nextInt();
//     if(isEven(n)){
//         System.out.println("number is even");
//     }else{
//         System.out.println("number is odd.");
   // }




//3.plaindrome or not

// public static boolean Ispalindrome(int number){
//       int palindrome= number;       //copied num into variable
//       int rev=0;

//         while(palindrome != 0){
//         int lastdigit=palindrome%10;  //reversing the number
//         rev=rev*10+lastdigit;
//         palindrome=palindrome/10;     // reducing the number

//       }
//       if(number == rev){
//         return true;
//       }else{
//         return false;
//       }

// }
//  public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       System.out.println("enter number:");
//       int number =sc.nextInt();

// if(Ispalindrome(number)){
//     System.out.println("number" +  number + "is a palindrome.");
// }else{
//     System.out.println("number"  + number + "is not a palindrome.");
// }
//  }}



//5.sum of integer in a given number
// public static int  sumofintegerinnumber(int n){
//     int sumofdigits=0;
//     while(n>0){
//         int lastdigit=n%10;  //last digit
//         sumofdigits=sumofdigits+lastdigit;   //adding lastdigit into the sum
//         n=n/10;             //reducing the given number
//     }
//     return sumofdigits;
// }

// public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       System.out.println("enter number:");
//       int n =sc.nextInt();

//       int sum=sumofintegerinnumber(n);
//       System.out.println("the sum of integers in a given number is:" + sum);


//  }
//     }
