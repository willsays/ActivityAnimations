package willsays.com.activityanimations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by jingweiwang on 6/15/15.
 */
public class StartActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_transation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void fadeIn(View view) {
        changeActivity();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void pushInLeft(View view) {
        changeActivity();
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }

    public void pushInRight(View view) {
        changeActivity();
        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
    }

    private void changeActivity() {
        Intent intent = new Intent(this, EndActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        this.startActivity(intent);
    }

    public void scaleIn(View view) {
        changeActivity();
        overridePendingTransition(R.anim.scale_in, R.anim.fade_out);
    }

    public void slideInBottom(View view) {
        changeActivity();
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_bottom);
    }

    public void slideInTop(View view) {
        changeActivity();
        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_top);
    }

    public void endActivity(View view) {
        this.finish();
    }


}
