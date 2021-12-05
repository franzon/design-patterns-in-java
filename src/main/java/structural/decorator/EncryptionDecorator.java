package structural.decorator;

import java.util.Base64;

class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void write(String text) {
        super.write(caesarCipherEncrypt(text));
    }

    @Override
    public String read() {
        return caesarCipherDecrypte(super.read());
    }

    private String caesarCipherEncrypt(String plain) {
        String b64encoded = Base64.getEncoder().encodeToString(plain.getBytes());

        // Reverse the string
        String reverse = new StringBuffer(b64encoded).reverse().toString();

        StringBuilder tmp = new StringBuilder();
        final int OFFSET = 4;
        for (int i = 0; i < reverse.length(); i++) {
            tmp.append((char) (reverse.charAt(i) + OFFSET));
        }
        return tmp.toString();
    }

    private String caesarCipherDecrypte(String secret) {
        StringBuilder tmp = new StringBuilder();
        final int OFFSET = 4;
        for (int i = 0; i < secret.length(); i++) {
            tmp.append((char) (secret.charAt(i) - OFFSET));
        }

        String reversed = new StringBuffer(tmp.toString()).reverse().toString();
        return new String(Base64.getDecoder().decode(reversed));
    }
}
