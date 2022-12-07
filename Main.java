public class Main
{
    public static void main(String []args)
    {
        List list = new List();
        list.addString("Hello");
        list.addString("Hello");
        list.addString("Hi");
        list.addString("Hello my friend");
        list.addString("Good morning");
        list.addString("Good evening");

     

        System.out.println(list.list);
        System.out.println(list.reverseStrings());
        System.out.println(list.searchSubstring("morning"));
        System.out.println(list.length());
        System.out.println(list.searchStrings("Hello"));
        list.numberOfSymbols();
    }
}
