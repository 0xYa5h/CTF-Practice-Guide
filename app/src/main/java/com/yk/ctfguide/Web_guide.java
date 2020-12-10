package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
public class Web_guide extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_guide);
        TextView textView = (TextView) findViewById(R.id.textView);
        String para = "What are Web Challenges? \n" +
                "In order to practice your skills, we recommend going through the process of finding and exploiting vulnerabilities in the Damn Vulnerable Web App (DVWA) and the Siberia Exploit Kit. DVWA is a collection of vulnerable test cases implemented in PHP and serves as an easy introduction to the many things that can go wrong in web applications. The Siberia Exploit Kit is a \"crimeware pack\" used by criminals to perform massive compromises. It includes a package of browser exploits and a command and control panel intended to manage compromised hosts. Siberia contains several pre- and post-authentication vulnerabilities that allow an attacker to gain administrative access to the panel, then take over the server on which it is hosted. \n" +
                "Download and run the OWASP Broken Web Apps virtual machine in VMware to start this workshop. BWA includes many web applications many for security testing, including DVWA. Once you have mastered DVWA, feel free to move on to other vulnerable web applications! Try auditing Siberia's source code to find the vulnerabilities, paying attention to sources of input in PHP. \n" +
                "OWASP Broken Web Apps \n" +
                "Siberia Crimeware Pack \n" +
                "Tools:\n" +
                "Burp Suite is a local HTTP proxy intended for security testing. Burp Suite is made for web penetration testers and simplifies many common tasks in a point-and-click GUI. The features available in the free version are more than enough to complete this and many other web security challenges. \n" +
                "Resources:\n" +
                "Many simple testing methods and common web application flaws are available in the walkthrough. Ensure that you understand the fundementals of HTTP, HTML, and PHP to do well on this section.\n" +
                "OWASP Top 10 Tools and Tactics\n" +
                "The Tangled Web: Chapter 3\n" +
                "PHP Primer";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }}