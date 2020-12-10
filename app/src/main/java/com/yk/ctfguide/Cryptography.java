package com.yk.ctfguide;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.method.ScrollingMovementMethod;
        import android.widget.TextView;
public class Cryptography extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cryptography);
        TextView textView = (TextView) findViewById(R.id.textView);
        String para = "What is Cryptography? \n" +
                " Cryptography is the art of changing a message from a readable format, referred to as “plaintext”, into \n" +
                " an unreadable one, or ciphertext. This process is referred to as encrypting the message. In most cases, there needs to be a \n" +
                " way to change it back to a readable format, or decrypting it, but not always. \n" +
                " \n" +
                " Types of Cryptography: \n" +
                "      1. Symmetric- Symmetric cryptography uses a single key to encrypt a message and also to then decrypt it after it has been delivered. \n" +
                "      2. Asymmetric- Asymmetric cryptography uses two seperate keys. \n" +
                "      3. Hashing- Hashing is changing a message into an unreadable string not for the purpose of hiding the message, but more for verifying the contents of the message. The public key is used to encrypt messages and a private key is used to then decrypt them. \n" +
                " \n" +
                " Topics: \n" +
                "      XOR \n" +
                "      Cesear Cipher \n" +
                "      Substitution Cipher \n" +
                "      Vigenere Cipher \n" +
                "      Hashing Functions Block Ciphers \n" +
                "      Stream Ciphers \n" +
                "      RSA \n" +
                " \n" +
                " Books- \n" +
                "      1.Handbook of Applied Cryptography \n" +
                "      2.Introduction to Modern Cryptography \n" +
                "      3.Cryto101 \n" +
                "      4.Serious Cryptography:A Practical Introduction to Modern Encryption \n" +
                " \n" +
                " Courses- \n" +
                "      1.CryptographyI and II- https://www.coursera.org/learn/crypto \n" +
                "      2.Applied Cryptography- https://www.udacity.com/course/applied-cryptography--cs387 \n" +
                "      3.Introduction to Cryptography- https://www.youtube.com/watch?v=2aHkqB2-46k \n" +
                " \n" +
                " Practice on: \n" +
                "      1.CRYPTOHACK- https://cryptohack.org/challenges/ \n" +
                "      2.Cryptopals crypto- https://cryptopals.com/sets/1 \n" +
                "      3.CTFlearn Crypto Challenges- https://ctflearn.com/challenge/1/browse \n" +
                "      4.Hackthebox- https://www.hackthebox.eu/home/challenges/Crypto \n" +
                "      5.w3challs Crypto Challenges- https://w3challs.com/challenges/list/crypto";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }}