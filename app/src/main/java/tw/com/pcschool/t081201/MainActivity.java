package tw.com.pcschool.t081201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click1(View v)
    {
        Log.d("FRAGMENT", "Click1");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("ABC");
    }

}
