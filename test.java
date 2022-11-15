//Task 3
import java.util.*;

 class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String abc=sc.next();
        System.out.println("Enter your account number:");
        sc.next();
        System.out.println(" your Login is Successful!!\n\nWelcome "+abc);

        int balance=0,d;
        String history="";
        do{
            System.out.println("\n\nChoose your options \n1.Withdraw \n2.Deposit \n3.Transfer \n4.Transaction History \n5.Exit");
            int ac=sc.nextInt();
        switch(ac)
        {
            case 1: System.out.println("Enter the withdraw amount:");
            int b=sc.nextInt();
            if(balance>=b) 
            {
                balance-=b;
                System.out.println("Operation Successfull");
                history+= String.valueOf(b) +" Amount withdrawn\n";
            }
            else System.out.println("Operation Failed");
            break;

            case 2:System.out.println("Enter deposit amount:");
            int a=sc.nextInt();
            if(a<=60000) 
            {
                balance+=a;
                System.out.println("Operation Successfull");
                history+= String.valueOf(a) +" Amount deposited\n";
            }
            else System.out.println("Amount is too large\n Sorry can't deposit");
break;

            case 3: System.out.println("Enter amount to transfer");
            int v=sc.nextInt();
            System.out.println("Enter account holders username to transfer money to");
            String trans=sc.next();
            balance-=v;
            System.out.println("Operation Successfull");
            history+=String.valueOf(v)+" amount transferred to "+trans+"\n";
break;

            case 4:System.out.println("Your transaction history is:\n"+history);

            case 5:break;
        }
        System.out.println("Do you want to continue?\n1.Yes\n2.No");
        d=sc.nextInt();
    }while(d==1);
    sc.close();
    }
}