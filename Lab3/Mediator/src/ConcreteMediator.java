//Now we will create concrete mediator class, it will have a list of users in the group and provide
// logic for the communication between the users.

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements ChatMediator {

    private List<User> users;

    public ConcreteMediator(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }

}