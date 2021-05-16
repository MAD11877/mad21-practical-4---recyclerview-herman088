package sg.edu.np.madweek3practical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

       // ImageView button = findViewById(R.id.imgProfile);
        //button.setOnClickListener(new View.OnClickListener(){

           // @Override

           // public void onClick(View v ){

              //userQuery();


           // }
        //});

      //week4

        ArrayList<User> UserList =  new ArrayList<>();

        for (int i = 0;i < 20;i ++){
            User  u = new User() ;
            u.name = "Name" + generateRandNum();
            u.description = "Description" + generateRandNum();
            u.followed = generateRandbool();
            UserList.add(u);



        }

        //week 4

        RecyclerView recyclerView =  findViewById(R.id.recyclerView);
        Adapter sAdapter = new Adapter(UserList);
        LinearLayoutManager mLayoutManager =  new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(sAdapter);



    }



    private int generateRandNum() {

        Random ran = new Random();
        int ranVal = ran.nextInt();
        return ranVal;

    }

    private boolean generateRandbool() {

        Random ran = new Random();
        boolean ranbool = ran.nextBoolean();
        return ranbool;

    }


    /*private void userQuery(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

       builder.setTitle("Profile");
       builder.setMessage("MADness");
       builder.setCancelable(true);
       builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {


               generateRandNum();
               Intent intent = new Intent(ListActivity.this, MainActivity.class);
               int number = generateRandNum();
               intent.putExtra("Integer", number);
               startActivity(intent);

           }
       });

        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();

    }*/

}



