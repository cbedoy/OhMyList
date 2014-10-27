package cbedoy.android.ohmylist.interfaces;

/**
 * Created by Carlos on 14/10/2014.
 */
import android.content.Intent;

public interface IActivityResultListener {

    public int getRequestCode();

    public void onActivityResult(int resultCode, Intent intent);

}
