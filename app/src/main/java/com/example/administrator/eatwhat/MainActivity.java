package com.example.administrator.eatwhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList al = new ArrayList();
    String _strItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        al.add("华味");
        al.add("点猪");
        al.add("点龟");
        al.add("点多喝汤");
        al.add("麦当劳");
        al.add("肯德基");
        al.add("点百度外卖");
        al.add("点口碑");
        al.add("时尚天河");
        al.add("不吃");
        al.add("吃屎");

        TextView tvMsg = (TextView)findViewById(R.id.tvMsg);
        for(int i=0;i<al.size();i++)
        {
            String item=(String)al.get(i);
            String str =tvMsg.getText()+item+"\n";
            tvMsg.setText(str);
        }
        String str =tvMsg.getText()+"\n";
        tvMsg.setText(str);
        _strItem= (String) tvMsg.getText();
    }
    public void BtnStart_Click(View view)
    {
        Random ra =new Random();
        int index = ra.nextInt(al.size())%(al.size()-0+1) + 0;

        String item=(String)al.get(index);

        TextView tvMsg = (TextView)findViewById(R.id.tvMsg);
        tvMsg.setText(_strItem);
        String str =tvMsg.getText()+item+"\n";
        tvMsg.setText(str);
    }
}
