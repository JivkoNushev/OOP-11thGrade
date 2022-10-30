public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Module[] modules = { new Module("manager"), new Module("jivko")};

        Role manager = new Role("manager", modules);

        Role[] roles_for_user_one = { manager };

        User user1 = new User("Jivko", "jivko@gmail.com", roles_for_user_one);

//        user1.roles[0].modules[1].print();
        String[] actions = user1.getActions();
        for (String action : actions) {
            System.out.println(action);
        }
    }

}