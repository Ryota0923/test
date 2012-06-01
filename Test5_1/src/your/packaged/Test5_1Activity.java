package your.packaged;

import android.app.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Test5_1Activity extends Activity {
	
	ImageView[] iv = new ImageView[3];
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout lay = new LinearLayout(this);
		lay.setOrientation(LinearLayout.HORIZONTAL);
		lay.setGravity(Gravity.CENTER);
		setContentView(lay);
        
		Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.car);
		
		for(int i =0; i<iv.length; i++){
			
			iv[i] = new ImageView(this);
			iv[i].setImageBitmap(bmp);
			lay.addView(iv[i]);
		}
    }
}