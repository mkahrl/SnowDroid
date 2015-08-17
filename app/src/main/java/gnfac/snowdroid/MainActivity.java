/**
 * @(#)MainActivity.java
 *
 *
 * @author Mark Kahrl
 * @version 1.00 2014/7/29
 */
package gnfac.snowdroid;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.main_title));
        setContentView(R.layout.main);
    }
}