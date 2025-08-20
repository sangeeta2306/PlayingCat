public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        // method 1 
    //    if (summer && (temperature >= 25 && temperature <= 45)) {
    //         return true;
    //     } else if (!summer && (temperature >= 25 && temperature <= 35)) {
    //         return true;
    //     } else {
    //         return false;
    //     } 

    // method 2
    int max = summer ? 45 : 35;
    return temperature >= 25 && temperature <=max;
    }
}
