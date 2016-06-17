package mx.com.serviciosinformaticosintegrales.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mx.com.serviciosinformaticosintegrales.ejercicio1.fragmento.FragmentoPerfil;


public class ActivityDetail extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String strUserName= getIntent().getExtras().getString("key_user");
        String strSaludo = String.format(getString(R.string.saludo),strUserName);
        findViewById(R.id.activity_detail_btnFragmento1).setOnClickListener(this);


    }

    @Override
    public void onClick(final View clicked) {
        switch (clicked.getId())
        {
            case R.id.activity_detail_btnFragmento1:
                cambiarFragmento1();
                break;
            case R.id.activity_detail_btnFragmento2:
                cambiarFragmento2();
                break;
        }
    }

    private void cambiarFragmento1() {
        getFragmentManager().beginTransaction().replace(R.id.fragmentHolder,new FragmentoPerfil()).commit();
    }

    private void cambiarFragmento2() {
        
    }
}
