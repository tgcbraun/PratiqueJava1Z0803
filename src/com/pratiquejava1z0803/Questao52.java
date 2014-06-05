package com.pratiquejava1z0803;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Questao52 extends Activity {
	
	private CheckBox checkbox_questao52A;
    private CheckBox checkbox_questao52B;
    private CheckBox checkbox_questao52C;
    private CheckBox checkbox_questao52D;
    private CheckBox checkbox_questao52E;
    private CheckBox checkbox_questao52F;
    private CheckBox checkbox_questao52G;
    private CheckBox checkbox_questao52H;
    private CheckBox checkbox_questao52I;
    private TextView RespostaQuestao52;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_questao52);
	   
	}
	
  public void abrirResposta(View view){
		
		checkbox_questao52A = (CheckBox) findViewById(R.id.checkbox_questao52A);
		checkbox_questao52B = (CheckBox) findViewById(R.id.checkbox_questao52B);
		checkbox_questao52C = (CheckBox) findViewById(R.id.checkbox_questao52C);
		checkbox_questao52D = (CheckBox) findViewById(R.id.checkbox_questao52D);
		checkbox_questao52E = (CheckBox) findViewById(R.id.checkbox_questao52E);
		checkbox_questao52F = (CheckBox) findViewById(R.id.checkbox_questao52F);
		checkbox_questao52G = (CheckBox) findViewById(R.id.checkbox_questao52G);
		checkbox_questao52H = (CheckBox) findViewById(R.id.checkbox_questao52H);
		checkbox_questao52I = (CheckBox) findViewById(R.id.checkbox_questao52I);
		RespostaQuestao52 =(TextView)findViewById(R.id.RespostaQuestao52);
		
		if (checkbox_questao52G.isChecked() && checkbox_questao52A.isChecked()==false && checkbox_questao52B.isChecked()==false
				&& checkbox_questao52C.isChecked()==false && checkbox_questao52D.isChecked()==false 
				&& checkbox_questao52E.isChecked()==false && checkbox_questao52F.isChecked()==false
				&& checkbox_questao52H.isChecked()==false && checkbox_questao52I.isChecked()==false) {
		Toast.makeText(getApplicationContext(), R.string.toastRespostaCerta, Toast.LENGTH_LONG).show();
		} else {
		
			Toast.makeText(getApplicationContext(), R.string.toastRespostaErrada, Toast.LENGTH_LONG).show();
		}
		
		RespostaQuestao52.setVisibility(View.VISIBLE);
		
	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
