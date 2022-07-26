package kr.hs.emirim.s2118.mirim_project_0726_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editAngle;
    ImageView imgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngle = findViewById(R.id.edit_angle);
        imgV = findViewById(R.id.imgv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.item_rotate:
                imgV.setRotation(Float.parseFloat(editAngle.getText().toString()));
                return true;
            case R.id.item_yang:
                imgV.setImageResource(R.drawable.yang);
                item.setChecked(true);
                return true;
            case R.id.item_napoli:
                imgV.setImageResource(R.drawable.napo);
                item.setChecked(true);
                return true;
            case R.id.item_thai:
                imgV.setImageResource(R.drawable.thai);
                item.setChecked(true);
                return true;
        }
        return false;
    }
}