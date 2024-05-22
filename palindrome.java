public class palindrome {
    int num = input.nextInt();   //131

    int reverseNum = 0;
    int temp = num;  //131

    while (temp != 0) {  //131!=0 true,    13!=0 true,   1 ! = 0
        int digit = temp % 10;  //digit = 1    digit = 3   digit = 1
        reverseNum = reverseNum * 10 + digit; // 0*10+1 = 1   1*10+3 = 13     13*10+1 = 131
        temp = temp / 10;  // temp = 13, temp = 1;  1= 1/10;
    }

    if (num == reverseNum) {
        System.out.println(" Yes, "+ num +" is a palindrome number");
    } else {
        System.out.println(" No, "+ num +" is not a palindrome number.");
    }
}
}
}
