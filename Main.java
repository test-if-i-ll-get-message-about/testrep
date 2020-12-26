import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            //String[] rkgj = {"C:\\Users\\varangian\\Desktop\\lr9d\\src\\a.txt", "C:\\Users\\varangian\\Desktop\\lr9d\\src\\b.txt"};
            String[] rkgj = new String [args.length];
            System.arraycopy(args, 0, rkgj, 0,args.length);
            WordsStatistics we = new WordsStatistics(rkgj, 2);
            we.countStats();
            System.out.println(we.toString());
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
