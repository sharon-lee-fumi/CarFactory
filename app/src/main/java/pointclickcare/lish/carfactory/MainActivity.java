package pointclickcare.lish.carfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView createdCarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickSedan(View view)
    {
        createdCarView = findViewById(R.id.CreatedCar);
        createdCarView.setText(Car.createSedan());
    }

    public void ClickPickup(View view)
    {
        createdCarView = findViewById(R.id.CreatedCar);
        createdCarView.setText(Car.createPickup());
    }

    public void ClickSUV(View view)
    {
        createdCarView = findViewById(R.id.CreatedCar);
        createdCarView.setText(Car.createSUV());
    }

    public void ClickSportsCar(View view)
    {
        createdCarView = findViewById(R.id.CreatedCar);
        createdCarView.setText(Car.createSportsCar());
    }
}
