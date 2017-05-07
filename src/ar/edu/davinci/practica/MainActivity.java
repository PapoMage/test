package ar.edu.davinci.practica;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	//Primero instanciamos los tipos de labels a utilizar en el layout de la activity
	EditText txtUsuario;
	EditText txtPass;
	Button btnIngresar;
	Button btnLimpiar;
	TextView tvInfoLogin;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mediante casteo se utiliza el metodo findViewById y dentro de ese metodo buscamos en R el id correspondiente al del xml
        txtUsuario=(EditText)findViewById(R.id.txtUsuario);
        txtPass=(EditText)findViewById(R.id.txtPass);
        btnIngresar=(Button)findViewById(R.id.btnIngresar);
        btnLimpiar=(Button)findViewById(R.id.btnLimpiar);
        tvInfoLogin=(TextView)findViewById(R.id.tvInfoLogin);
        
        btnIngresar.setOnClickListener(this);
        btnLimpiar.setOnClickListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		String nombreUser =txtUsuario.getText().toString();		
		switch(v.getId()){
		case R.id.btnIngresar:
			
			if(nombreUser.isEmpty()){
				tvInfoLogin.setText("Por favor ingrese su nombre para el Ingreso");
			}else{
				tvInfoLogin.setText(nombreUser + " se ha logueado exitosamente");
			}
			break;
		case R.id.btnLimpiar:
			tvInfoLogin.setText("accion no disponible");
			
			break;
		}
		
			
		
	}
    
}
