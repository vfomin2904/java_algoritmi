public class Application {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>();

        map.put(1,"str1");
        map.put(10,"str2");
        map.put(6,"str3");
        map.put(43,"str4");
        map.put(5,"str5");
        map.put(34,"str6");
        map.put(12,"str7");
        map.put(53,"str8");

        System.out.println(map.remove(6));
        System.out.println(map.remove(53));

        System.out.println(map);
    }
}
