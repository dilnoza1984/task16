class Main {
  public static void main(String[] args) {
   // call your method and print out its returned value
System.out.println(isEligibleToDate(26 , 700000, 5.9));//true
System.out.println(isEligibleToDate(22, 1000000, 10)); //false
System.out.println(isEligibleToDate(27 , 50000,9.2));//true
    
  }

public static boolean isEligibleToDate (int age,int income, double looks){


return age >= 25 && age <= 40 && (income > 500000 || looks > 8.5);


  
}
}
