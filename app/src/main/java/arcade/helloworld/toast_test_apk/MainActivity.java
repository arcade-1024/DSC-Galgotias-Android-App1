package arcade.helloworld.toast_test_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView ShowContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowContent = (TextView) findViewById(R.id.Show_count);
    }
    public void showtoast(View view){
        Toast.makeText(MainActivity.this,
                "Hello Toast!",
                Toast.LENGTH_SHORT).show();

    }
    public void countup(View view){
        ++count;
        if(ShowContent!= null)
            ShowContent.setText(Integer.toString(count));


    }

}
