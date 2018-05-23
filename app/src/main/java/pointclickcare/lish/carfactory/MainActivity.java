package pointclickcare.lish.carfactory;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pointclickcare.lish.carfactory.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void ClickSedan(View view) {
        mBinding.setCreatedCar(CarFactory.createSedan());
    }

    public void ClickPickup(View view) {
        mBinding.setCreatedCar(CarFactory.createPickup());
    }

    public void ClickSUV(View view) {
        mBinding.setCreatedCar(CarFactory.createSUV());
    }

    public void ClickSportsCar(View view) {
        mBinding.setCreatedCar(CarFactory.createSportsCar());
    }
}
