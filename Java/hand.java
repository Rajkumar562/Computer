import java.util.*;
public class hand
{ 
    int f,f1,c1,x,x1,x2,r,a,p,q=0;
    Scanner sc = new Scanner(System.in);
    public void toss()
    {   
        System.out.println("Enter 'O' for Odd and 'E' Even");
        String st=sc.nextLine();
        st=st.toUpperCase();
        if(st.equals("O") || st.equals("E"))
        {
            if(st.equals("O"))
                f=0;
            else
                f=1;
        }
        else
            error1();
    }

    public void error1()
    {
        System.out.println("----------------------------------------------");
        System.out.println("!!!!Wrong Input");
        System.out.println("Please type 'O' for Odd and 'E' Even");
        System.out.println("----------------------------------------------");
        toss();
    }

    public void num()
    {
        System.out.println("Enter the number of your choice till 6");
        int n=sc.nextInt();
        if(n<7 && n>0)
        {
            int n1=(int)(Math.random()*6+1);
            System.out.println("Computer Chooses:"+n1);
            int s=n+n1;
            if(s%2!=0)
                f1=0;
            else
                f1=1;}
        else
            error2();
        if(f1==f)
        {
            System.out.println("You won");
            System.out.println();
        }
    }

    public void error2()
    {
        System.out.println("----------------------------------------------");
        System.out.println("!!!!Wrong Input");
        System.out.println("Please enter the numbers less than 6");
        System.out.println("----------------------------------------------");
        num();
    }

    public void compare()
    {
        if(f1==f)
        { 
            System.out.println("For Batting Enter 1 And For Bowling Enter 2");
            int ch=sc.nextInt();
            if((ch==1)||(ch==2))
            {if(ch==1)
                {bat();bowl();}
                else
                {bowl();bat();}
            }
            else
                error4();
        }
        else
        {
            System.out.println("Computer wins");
            int c=(int)(Math.random()*2+1);
            if(c==1)
            {
                System.out.println("Computer chooses to bat ");
                bowl();bat();
            }
            else
            {
                System.out.println("Computer chooses to bowl");
                bat();bowl();
            }
        }
        if(a==0)
            display();
    }

    public void error4()
    {
        System.out.println("----------------------------------------------");
        System.out.println("!!!!Wrong Input");
        System.out.println("Please Enter 1 for Batting and 2 for Bowling");
        System.out.println("----------------------------------------------");
        compare();
    }

    public void random()
    {
        c1=(int)(Math.random()*6+1);
        System.out.println("Computer Chooses:"+c1);
    }

    public void input()
    {
        r=sc.nextInt();
        if((r>6) ||(r==0))
            error3();
    }

    public void error3()
    {
        System.out.println("----------------------------------------------");
        System.out.println("!!!!Wrong Input");
        System.out.println("Please enter the numbers less than 6");
        System.out.println("----------------------------------------------");
        input();
    }

    public void bat()
    {
        System.out.println();
        System.out.println("Your Batting starts now");
        while(true)
        {
            System.out.println("Enter your number");
            input();
            random();
            if(r!=c1)
            {
                x+=r;
                System.out.println("Your Score:"+x);
                System.out.println();
                if(((x>x2)&&(x2>0))||((x>x2)&&(p==1)))
                {x1=x;display();break;}
                else
                    continue;
            }
            else
            {
                q++;
                x1=x;x=0;
                System.out.println("You're Out");
                System.out.println();
                break;}
        }   
    }

    public void bowl()
    {
        System.out.println();
        System.out.println("Your Bowling starts now");
        while(true)
        {
            System.out.println("Enter your number");
            input();
            random();
            if(r!=c1)
            {
                x+=c1;
                System.out.println("Computer Score:"+x);
                System.out.println();
                if(((x>x1)&& (x1>0))||((x>x1)&&(q==1)))
                {x2=x;display();break;}
                else
                    continue;
            }
            else
            {
                p++;
                x2=x;x=0;
                System.out.println("Computer is Out");
                System.out.println();
                break;}
        }   
    }

    void display()
    {
        a++;
        System.out.println("**********************************************");
        System.out.println("Score Card");
        System.out.println("Your Score:"+x1);
        System.out.println("Computer's Score:"+x2);
        if(x1>x2)
            System.out.println("You Win");
        else if(x1==x2)
            System.out.println("Match Draw");
        else
            System.out.println("Computer Wins");
        System.out.println("Thanks for Playing the Game");
    }

    public static void main()
    {
        hand ha=new hand();
        ha.toss();
        ha.num();
        ha.compare();
    }
}