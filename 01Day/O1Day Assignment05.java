/*5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable*/
int a=6;
int b=8;
int temp;

temp =a;
a=b;
b=temp;

//B - Second program without using any third variable:
int a=6;
int b=8;

a=a+b;
b=a-b;
a=a-b;
