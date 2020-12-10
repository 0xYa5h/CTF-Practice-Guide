package com.yk.ctfguide;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.method.ScrollingMovementMethod;
        import android.widget.TextView;
public class Forensic_guide extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forensic_guide);
        TextView textView = (TextView) findViewById(R.id.textView);
        String para = "What is Forensics? \n" +
                " Forensics is the art of recovering the digital trail left on a computer. There are plently of methods to find data which is seemingly deleted, not stored, or worse, covertly recorded. \n" +
                " An important part of Forensics is having the right tools, as well as being familair with the following topics: \n" +
                "      File Formats \n" +
                "      EXIF data \n" +
                "      Wireshark & PCAPs \n" +
                "      Stegonagraphy \n" +
                "      Imaging\n" +
                "      Working of an Operating System. \n" +
                " \n" +
                " Also I recommend using a good binary viewer/editor: \n" +
                "      eg.HxD: https://mh-nexus.de/en/hxd/ \n" +
                " For file and disk carving use linux terminal itself. \n" +
                " \n" +
                " Courses: \n" +
                " Computer Forensics Fundamentals: https://www.udemy.com/course/computer-forensics-fundamentals/ \n" +
                " \n" +
                " Tools and Resources: \n" +
                "      Binwalk\n" +
                "      Volatility\n" +
                "      Binary Viewer/Editor \n" +
                "      Process Explorers\n" +
                "      Disk imagers \n" +
                " \n" +
                " Practice on: \n" +
                "      1. Hackthebox- https://www.hackthebox.eu/home/challenges/forensics \n" +
                " 2. w3challs Forensics Challenges- https://w3challs.com/challenges/list/forensics \n" +
                " 3. CTFlearn Forensics- https://ctflearn.com/challenge/1/browse";

        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }}