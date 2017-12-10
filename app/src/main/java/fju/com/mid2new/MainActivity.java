package fju.com.mid2new;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int FUNCTION_MAIN = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNCTION_MAIN)
            Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();

    }

    public void gotofunc1(View v) {
        Intent intent = new Intent(this, Func1Activity.class);
        startActivity(intent);
    }
    public void gotofunc2(View v) {
        Intent intent = new Intent(this, Func2Activity.class);
        startActivity(intent);
    }
    public void gotofunc3(View v) {
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent,FUNCTION_MAIN);
    }
    public void gotofunc4(View v) {
        Intent intent = new Intent(this, Func4Activity.class);
        startActivity(intent);
    }
    public void gotofunc5(View v) {
        Intent intent = new Intent(this, Func5Activity.class);
        startActivity(intent);
    }
    public void gotofunc6(View v) {
        Intent intent = new Intent(this, Func6Activity.class);
        startActivity(intent);
    }
    public void gotofunc7(View v) {
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent,FUNCTION_MAIN);

    }
    public void gotofunc8(View v) {
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent,FUNCTION_MAIN);

    }
}
