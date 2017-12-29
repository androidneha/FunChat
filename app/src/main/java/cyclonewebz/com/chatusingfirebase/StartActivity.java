package cyclonewebz.com.chatusingfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void signup(View v){
        startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
        finish();
    }

    public void login(View v){
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}
