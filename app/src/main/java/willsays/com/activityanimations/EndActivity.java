package willsays.com.activityanimations;

import android.os.Bundle;
import android.view.View;

public class EndActivity extends StartActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }

    public void fadeOut(View view){
        this.finish();
        this.overridePendingTransition(R.anim.no_change,R.anim.fade_out);
    }

    public void scaleOut(View view){
        this.finish();
        this.overridePendingTransition( R.anim.no_change,R.anim.scale_out);
    }




}
