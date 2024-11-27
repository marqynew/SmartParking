package decorator;

public class UserData implements Data {
    private String data;

    public UserData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}
