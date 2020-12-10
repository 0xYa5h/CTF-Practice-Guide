package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
public class Rev_guide extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev_guide);
        TextView textView = (TextView) findViewById(R.id.textView);
        String para = "What is reverse engineering? \n" +
                " When referring to computer science/programming, reverse engineering means to “break down” the programming code. \n" +
                " This allows a programmer/reverse engineer to analyse and study how the program is working, thus allowing programmer/reverse engineer to find potential bugs/vulnerability and to fix errors in the software engineer’s code, or create a program like the one being deconstructed.\n" +
                " Topics: Assembly / Machine Code \n" +
                " The C Programming Language \n" +
                " Disassemblers \n" +
                " Decompilers \n" +
                " \n" +
                " List of reverse engineering resources- \n" +
                " \n" +
                " Books: \n" +
                "    1. Reverse Engineering for Beginners \n" +
                "    2. The Art of Assembly Language \n" +
                "    3. Practical Reverse Engineering \n" +
                "    4. Radare2 Book \n" +
                "    5. Hacking: The Art of Exploitation \n" +
                " \n" +
                " For fundamentals: \n" +
                "    1. LiveOverflow Binary Hacking - https://www.youtube.com/watch?v=iyAyN3GFM7A&list=PLhixgUqwRTjxglIswKp9mpkfPNfHkzyeN \n" +
                "    2. RPISEC: Modern Exploitation - http://security.cs.rpi.edu/courses/binexp-spring2015/ \n" +
                " \n" +
                " Practice on: \n" +
                "    1. Crackmes.de - https://reverse.put.as/crackmes/ \n" +
                "    2. Reversing.Kr - http://reversing.kr/challenge.php \n" +
                "    3. Flare-on Challenges - http://flare-on.com/ \n" +
                "    4. CTFlearn Reversing Challenges- https://ctflearn.com/challenge/1/browse \n" +
                "    5. Hackthebox- https://www.hackthebox.eu/home/challenges/Reversing";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }}