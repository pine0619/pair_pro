public class Main {
    public static void main(String[] args) {
        System.out.println("main method runs");
        ChatBot bot1 = new ChatBot();
        ChatBot bot2 = new ChatBot("あざま");
        bot1.greeting();
        bot2.greeting();
        bot2.setName("たかと");
        bot2.greeting();

    }
}
