package es.usj.task401;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        et1 = (EditText)findViewById(R.id.editText);
        Intent intent = new Intent(this, MensajeRetardado.class);

        intent.putExtra(MensajeRetardado.EXTRA_MESSAGE,et1.getText().toString());
        startService(intent);
    }

    public void runMediaPlayer(View view) {
        Intent intent = new Intent(this, MediaPlayerService.class);

        startService(intent);
    }
}
