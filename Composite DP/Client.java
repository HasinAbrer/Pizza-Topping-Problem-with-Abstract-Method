public class Client {
    public static void main (String args[]) {
        File f0 = new File(22);
        File f1 = new File(70);
        File f2 = new File(98);

        Directory dir1 = new Directory();
        Directory root = new Directory();

        root.add(dir1);
        root.add(f0);
        root.add(f1);
        dir1.add(f2);

        System.out.println(root.fs());

    }
}
