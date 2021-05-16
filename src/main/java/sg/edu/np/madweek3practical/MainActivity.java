package sg.edu.np.madweek3practical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    User u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent receivedData = getIntent();
        String Name = receivedData.getStringExtra("Name");
        String Description = receivedData.getStringExtra("Description");
        boolean Followed = receivedData.getBooleanExtra("followed",true);

        //int Receivednumber =  receivedData.getIntExtra("Integer",0);
        Log.d("Debug", "create");

      /*  u = new User();
        u.name = "MAD" + Receivednumber ;
        u.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        u.id = 1;
        u.followed = false;
     */
        u = new User();
        u.name = Name;
        u.description = Description;
        u.followed = Followed;

        TextView name = findViewById(R.id.txtName);
        name.setText(u.name);
        TextView description = findViewById(R.id.txtDescription);
        description.setText(u.description);
        setFollowBtn();
        System.out.println(u.name);
    }

    private void setFollowBtn() {
        Button b = findViewById(R.id.btnFollow);
        if(u.followed) {
            b.setText("Unfollow");
            Toast toast = Toast.makeText(MainActivity.this,"Followed",Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            b.setText("Follow");
            Toast toast = Toast.makeText(MainActivity.this,"Unfollowed",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void onFollowClick(View v) {
        u.followed = !u.followed;
        setFollowBtn();
    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Debug", "start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Debug", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Debug", "destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Debug", "pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Debug", "resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Debug", "restart");
    }
}
