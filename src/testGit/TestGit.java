package testGit;

/**
 * Created by student on 07.10.2018.
 */
public class TestGit {
    public static void main(String[] args) {
        char sb = 'a';
        String[][] st = new String[7][8];
        System.out.println("ddddddd");

        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[0].length; j++) {
                st[i][j] = sb + "" + (j + 1);
                System.out.print(st[i][j] + "\t");
            }
            sb++;
            System.out.println("");
        }
    }
}
