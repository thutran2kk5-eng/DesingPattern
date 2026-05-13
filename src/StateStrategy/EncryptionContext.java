package StateStrategy;

public class EncryptionContext {

    private EncryptionStrategy strategy;

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encryptText(String text) {
        strategy.encrypt(text);
    }
}