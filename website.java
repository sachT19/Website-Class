public class WebsiteTester
{
    public static void main(String[] args)
    {
       
        Website test1 = new Website();
        System.out.println(test1);
        Website test2 = new Website("something", "something");
        System.out.println(test2);
        Website test3 = new Website("something", "something", 100);
        System.out.println(test3);
    }
}
