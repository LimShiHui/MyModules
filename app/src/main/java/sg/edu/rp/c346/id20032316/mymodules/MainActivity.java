package sg.edu.rp.c346.id20032316.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.tvC346);
        tvC203 = findViewById(R.id.tvC203);
        tvC206 = findViewById(R.id.tvC206);
        tvC218 = findViewById(R.id.tvC218);
        tvC235 = findViewById(R.id.tvC235);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent346 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent346.putExtra("code", "C346");
                intent346.putExtra("name", "Android Programming");
                intent346.putExtra("year", 2021);
                intent346.putExtra("sem", 1);
                intent346.putExtra("credit", 4);
                intent346.putExtra("venue", "E62E");
                startActivity(intent346);
            }
        });


        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent203 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent203.putExtra("code", "C203");
                intent203.putExtra("name", "Web Application Development in php");
                intent203.putExtra("year", 2021);
                intent203.putExtra("sem", 1);
                intent203.putExtra("credit", 4);
                intent203.putExtra("venue", "W67M");
                startActivity(intent203);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent206 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent206.putExtra("code", "C206");
                intent206.putExtra("name", "Software Development Process");
                intent206.putExtra("year", 2021);
                intent206.putExtra("sem", 1);
                intent206.putExtra("credit", 4);
                intent206.putExtra("venue", "W67M");
                startActivity(intent206);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent218 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent218.putExtra("code", "C218");
                intent218.putExtra("name", "UI/UX Design for Apps");
                intent218.putExtra("year", 2021);
                intent218.putExtra("sem", 1);
                intent218.putExtra("credit", 4);
                intent218.putExtra("venue", "W64G");
                startActivity(intent218);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent235 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent235.putExtra("code", "C203");
                intent235.putExtra("name", "IT Security and management");
                intent235.putExtra("year", 2021);
                intent235.putExtra("sem", 1);
                intent235.putExtra("credit", 4);
                intent235.putExtra("venue", "W67M");
                startActivity(intent235);
            }
        });




    }
}