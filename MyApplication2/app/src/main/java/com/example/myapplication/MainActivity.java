package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Books> BookCatograiz =new ArrayList<>();

        Books edara =new Books("حياة في الإدارة" ,"الإدارة",4.0,"غازي القصيبي",R.drawable.fialedara);
        Books three =new Books("ثلاثية غرناطة" ,"رواية",5.0,"رضوى عاشور",R.drawable.three);
        Books adb =new Books("الأدب الصغير " ,"الأدب",4.3,"عبدالله المقفع",R.drawable.aladb);
        Books hmam =new Books("حمام الدار" ,"رواية",4.0,"سعود السنععوسي",R.drawable.hmam);

        BookCatograiz.add(edara);
        BookCatograiz.add(three);
        BookCatograiz.add(adb);
        BookCatograiz.add(hmam);

        //BookCatograiz.get(0);
        //BookCatograiz.get(1);
        //BookCatograiz.get(2);
        //BookCatograiz.get(3);


        //connect
        RecyclerView List =(findViewById(R.id.recv));


        //fix size
        List.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        List.setLayoutManager(lm);


        BooksAdap bb = new BooksAdap(BookCatograiz,MainActivity.this);
        List.setAdapter(bb);





    }
}