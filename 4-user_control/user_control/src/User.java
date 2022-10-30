public class User {

    public String name, email;
    public Role[] roles;
    public User(String user_name, String user_email, Role[] user_roles){
        name = user_name;
        email = user_email;
        roles = user_roles;
    }

    public String[] getActions(){
        int counter = 0;
        String[] actions = new String[0];
        for (Role role : roles) {
            for (int j = 0; j < role.modules.length; j++) {
                String[] new_actions = new String[actions.length + 1];
                System.arraycopy(actions, 0, new_actions, 0, actions.length);
                actions = new_actions;
                actions[actions.length - 1] = role.modules[j].message;
            }
        }
        return actions;
    }

}
