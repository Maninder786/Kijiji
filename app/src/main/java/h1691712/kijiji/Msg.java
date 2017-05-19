package h1691712.kijiji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Msg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
    }
    public void click1(View view)
    {
        Intent next=new Intent(this,First.class);
        startActivity(next);
    }

    public void click2(View view)
    {
        Intent next=new Intent(this,BlankMykijiji.class);
        startActivity(next);
    }

    public void click3(View view)
    {
        Intent next=new Intent(this,Post_advert.class);
        startActivity(next);
    }

    public void click4(View view)
    {
        Intent next=new Intent(this,Favorites.class);
        startActivity(next);
    }

    public void click5(View view)
    {
        Intent next=new Intent(this,Msg.class);
        startActivity(next);
    }
}
