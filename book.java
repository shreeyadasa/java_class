import java.util.*;



public class Book {
    String name;
    String author;
    int price;
    int num_pages;

    static Scanner sc=new Scanner(System.in);

    Book(){
        name="Days Of Our Lives";
        author="Mansi V Jain";
        price=100;
        num_pages=120;
    }


    void get(){
        System.out.println("Enter Name");
        this.name=sc.nextLine();
        System.out.println("Enter Author");
        this.author=sc.nextLine();
        System.out.println("Enter Price");
        this.price=sc.nextInt();
        System.out.println("Enter Number Of Pages");
        this.num_pages=sc.nextInt();
    }

    public String toString(){
        return ("Name "+this.name+"\nAuthor "+this.author+"\nPrice "+this.price +"\nNumber of Pages "+this.num_pages);
    }

    public static void main(String args[]){

        System.out.println("Enter number of books");
        int n=sc.nextInt();

        Book obj[]=new Book[n];

        for(int i=0;i<n;i++){
            obj[i]=new Book();
            String x=sc.nextLine();
            System.out.println("Enter Book "+(i+1)+" details");
            obj[i].get();
        }

        for(int i=0;i<n;i++){
            System.out.println("Book "+(i+1)+" details");
            System.out.println(obj[i]);
        }
    }

}
