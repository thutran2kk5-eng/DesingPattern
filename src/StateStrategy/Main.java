package StateStrategy;

public class Main {

    public static void main(String[] args) {

        EncryptionContext context = new EncryptionContext();

        context.setStrategy(new AESEncryption());
        context.encryptText("Hello");

        context.setStrategy(new DESEncryption());
        context.encryptText("Hello");
    }
}