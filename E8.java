public class E8 {
    public static void main(String[] args) {

        ArrayInList a = new ArrayInList(6);
        ArrayInList b = new ArrayInList(6,6);
        ArrayInList c = new ArrayInList(6,6,6);
        ArrayInList d = new ArrayInList(6,6,6,6);

        System.out.println("测试Find：");
        System.out.println(a.Find(0));

        System.out.println("测试Delete：");
        b.Delete(2);
        System.out.println(b);

        System.out.println("测试Insert：");
        c.Insert(3,7);
        System.out.println(c);

        System.out.println("测试Append：");
        d.Append(8);
        System.out.println(d);
    }
}
