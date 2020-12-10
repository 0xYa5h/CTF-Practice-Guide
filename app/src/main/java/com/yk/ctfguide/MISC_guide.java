package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
public class MISC_guide extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_i_s_c_guide);
        TextView textView = (TextView) findViewById(R.id.textView);
        String para = "What are Miscellaneous Challenges? \n Many challenges in CTFs will be completely random and unprecedented, requiring simply logic, knowledge, and patience to be solved. \n" +
                " There is no sure-fire way to prepare for these, but as you complete more CTFs, \n" +
                " you will be able to recognize and hopefully have more clues on how to solve them.\n" +
                " Topics:\n" +
                "      Some techie skills \n" +
                "      any Communication techniques \n" +
                "      Unfamiliar ways to represent data \n" +
                "      Logical and anaytical Skills \n" +
                " \n" +
                " Tools and Resources: \n" +
                "      The Combination of all the other tools and techniques. \n" +
                "      GOOGLE\n" +
                "      Look at the hints ClOsElY.\n" +
                "      Technicsl Know-how to use most tools, GUI or terminal based. \n" +
                " \n" +
                " Practice on: \n" +
                "       1. Hackthebox- https://www.hackthebox.eu/home/challenges/MIsc \n" +
                "       2. w3challs Crypto Challenges- https://w3challs.com/challenges/list/misc \n" +
                "       3. CTFlearn MIsc- https://ctflearn.com/challenge/1/browse";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }}