package Package_Assigments;

public class Test8_ALL_in_one {
    public static void main(String[] args) {
        // To reverse the number, sum of digits,
        // count the digits
        // Even numbers
        int GivenNumber= 987654321;
        int Storednumber = GivenNumber;
        int count = 0; int lastdigit;   int reverse =0;
        int evencount =0;  int oddcount =0;  int sum =0;

        while(GivenNumber>0){
            count = count+1;
            lastdigit = GivenNumber%10;
            if(lastdigit%2 ==0){
                System.out.println("Even Number      "+lastdigit);
                evencount = evencount +1;
            }else {
                System.out.println("Odd Number       "+lastdigit);
                oddcount =oddcount +1;
            }
            sum = sum+lastdigit;
            reverse = reverse*10 + lastdigit;
            GivenNumber=GivenNumber/10;

        }// whileloop ends

        if(Storednumber ==reverse){
            System.out.println("Given Number is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        System.out.println("Reverse of Given Number     "+reverse);
        System.out.println("count of Given Number      "+count);
        System.out.println("oddcount     "+oddcount);
        System.out.println("evencount    "+evencount);
        System.out.println("sum   "+sum);
    }
}
