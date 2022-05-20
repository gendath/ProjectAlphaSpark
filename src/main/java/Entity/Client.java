package Entity;

import java.util.List;

public class Client extends User{
    // Fields
    private List<Proposal> proposals = null;

    // Constructors


    public Client() {
    }

    public Client(String userName, String password) {
        super(userName, password);
    }
}
