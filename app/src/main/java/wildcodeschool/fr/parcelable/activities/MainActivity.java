package wildcodeschool.fr.parcelable.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import wildcodeschool.fr.parcelable.R;
import wildcodeschool.fr.parcelable.activities.model.Vehicle;

public class MainActivity extends AppCompatActivity {

    public String marque;
    public String km;
    public Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonGo);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textMarque = findViewById(R.id.plainMarque);
                TextView textKm = findViewById(R.id.plainKm);
                marque = textMarque.getText().toString();
                km = textKm.getText().toString();
                vehicle = new Vehicle(marque, km);
                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                intent.putExtra("VEHICLE_EXTRA", vehicle);
                startActivity(intent);
            }
        });
    }
}
