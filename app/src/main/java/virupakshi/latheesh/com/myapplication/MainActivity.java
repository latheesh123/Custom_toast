package virupakshi.latheesh.com.myapplication;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=(Button)findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast toast=new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM,0,0);

                LayoutInflater inflater=getLayoutInflater();

              View app=  inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.linear));
                toast.setView(app);
                toast.show();



            }
        });

    }




    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Log.d("msg","Orientation is landscape");
        }

        else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            Log.d("msg","Orientation is potrait");
        }
    }
}
