package linkedList.question;
//https://leetcode.com/problems/happy-number/
class Number
{
    private int square(int num)
    {
        int ans=0;
        while (num>0)
        {
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
    public boolean isHappy(int n)
    {
        int slow=n;
        int fast=n;
        do {
            slow=square(slow);
            fast=square(square(fast));
        }while (slow!=fast);
        if(slow==1)
        {
            return true;
        }
        return false;
    }

}
public class happyNumber {


}
