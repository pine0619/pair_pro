public class ChatBot {
    private String name;

    public ChatBot(){
        System.out.println("チャットボットの原型を作成します。");
    }

    public ChatBot(String name){
        this.name = name;
        System.out.println("チャットボット名" + name + "を作成します。");
    }

    public void greeting(){
        System.out.println("はじめまして" + this.name + "です。よろしくおねがいします。");
    }

    public void setName(String name){
        this.name = name;
    }

    pub

}
