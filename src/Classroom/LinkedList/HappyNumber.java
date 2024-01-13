package Classroom.LinkedList;

public class HappyNumber {
    public boolean isHappy(int n) {
    int slow = n;
    int fast = n;
    do{
        slow = sumOfSquare(slow);
        fast = sumOfSquare(sumOfSquare(fast));
    }while(slow != fast);
    if (slow == 1)
        return true;
    return  false;
    }

    private int sumOfSquare(int num) {
    int ans =  0;
    while(num>0){
        int rem = num%10;
        ans += rem * rem;
        num = num/10;
    }
    return ans;
    }
}
