package tw.com.abc.myvediotest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView =(VideoView) findViewById(R.id.vedio);
        videoView.setVideoURI(Uri.parse("http://www.bradchao.com/android/running.mp4"));
        
    }

    public void pause(View view) {

    }
}
