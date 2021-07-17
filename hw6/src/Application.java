import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int balanced = 0;
        int count = 1000000;
        for(int i = 0; i < count; i++){
            MyTreeMap<Integer, Integer> tree = new MyTreeMap<>();
            while(tree.height() < 6){
                tree.put((int)(Math.random()*101-100), 0);
            }
            if(tree.isBalanced()){
                balanced++;
            }
        }

        System.out.println(count-balanced);
        System.out.println(balanced);

        System.out.println(((double)(count-balanced)/count)*100+"%");
    }
}
