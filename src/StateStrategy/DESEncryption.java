package StateStrategy;

public class DESEncryption implements EncryptionStrategy {

    @Override
    public void encrypt(String text) {
        System.out.println("DES Encrypt: " + text);
    }
}