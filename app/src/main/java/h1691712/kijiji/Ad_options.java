package h1691712.kijiji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ad_options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_options);
    }
    public void gotohome(View view) {
        Intent next = new Intent(this, BlankMykijiji.class);
        startActivity(next);
    }
}
