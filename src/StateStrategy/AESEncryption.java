package StateStrategy;

public class AESEncryption implements EncryptionStrategy {

    @Override
    public void encrypt(String text) {
        System.out.println("AES Encrypt: " + text);
    }
}