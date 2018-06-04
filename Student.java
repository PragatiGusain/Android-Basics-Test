package com.example.pragatigusain.studentarraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class Student
{
    String name,address,college;
    int phone;
    Student(String name,String address,int phone,String college)
    {
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.college=college;
    }
}
public class MainActivity extends AppCompatActivity
{
    TextView u_name,u_add,u_phone,u_college;
    EditText name,address,phone,college;
    Button submit,display;
    ArrayList <Student> std=new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u_name=(TextView)findViewById(R.id.tv1);
        u_add=(TextView)findViewById(R.id.tv2);
        u_phone=(TextView)findViewById(R.id.tv3);
        u_college=(TextView)findViewById(R.id.tv4);
        name=(EditText)findViewById(R.id.et1);
        address=(EditText)findViewById(R.id.et2);
        phone=(EditText)findViewById(R.id.et3);
        college=(EditText)findViewById(R.id.et4);
        submit=(Button)findViewById(R.id.b1);
        display=(Button)findViewById(R.id.b2);
        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try {
                    String s_name = String.valueOf(name.getText());
                    String s_address = String.valueOf(address.getText());
                    int s_phone = Integer.parseInt(phone.getText().toString());
                    String s_college = String.valueOf(college.getText());
                    std.add(new Student(s_name,s_address,s_phone,s_college));
                    }
                 catch(NumberFormatException e)
                 {
                     System.out.println("Please Enter Valid Details");
                 }

            }
        });
        display.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               for(int i=0;i<std.size();i++)
               {
                   System.out.println("Student Name:"+std.get(i).s_name);
                   System.out.println("Student Address:"+std.get(i).s_address);
                   System.out.println("Student Phone:"+std.get(i).s_phone);
                   System.out.println("Student College:"+std.get(i).s_college);
               }
            }
        });
    }
}
