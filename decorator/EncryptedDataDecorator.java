package decorator;

public class EncryptedDataDecorator implements Data {
    private Data data;

    public EncryptedDataDecorator(Data data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return encrypt(data.getData());
    }

    private String encrypt(String data) {
        return new StringBuilder(data).reverse().toString(); // Simple reversal encryption
    }
}
