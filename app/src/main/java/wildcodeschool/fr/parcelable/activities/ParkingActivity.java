package wildcodeschool.fr.parcelable.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import wildcodeschool.fr.parcelable.R;
import wildcodeschool.fr.parcelable.activities.model.Vehicle;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        Intent intent = getIntent();
        Vehicle vehicle = intent.getParcelableExtra("VEHICLE_EXTRA");
        TextView textMarque = findViewById(R.id.marque);
        TextView textKm = findViewById(R.id.km);
        textMarque.setText(vehicle.getMarque());
        textKm.setText(vehicle.getKm());
    }
}
