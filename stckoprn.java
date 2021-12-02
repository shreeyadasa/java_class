import java.util.*;
class stack{
int tos;
int a[]=new int[10];
stack()
{
tos=-1;
}
void push(int ele)
{
tos=tos+1;
a[tos]=ele;
}
int pop()
{
if(tos==-1)
{
System.out.println("stack underflow");
return 0;
}
return a[tos--];
}
void display(int n){
if (tos==n)
{
System.out.println("stack is full");
return;
}
for(tos=0;tos<n;tos++)
System.out.println("elements of stack are"+""+a[tos]);
}}
class stckoprn{
public static void main(String args[])
{
stack s1=new stack();
int n,i,k;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements to push");
n=sc.nextInt();
System.out.println("enter the element to push");
for(i=0;i<n;i++)
{
if(n==10)
break;
k=sc.nextInt();
s1.push(k);
}
System.out.println("the contents of the stack are");
s1.display(n);
for(i=0;i<n;i++)
System.out.println("stack contents are "+""+s1.pop());
}}