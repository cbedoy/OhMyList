package cbedoy.android.ohmylist.viewcontrollers;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

import cbedoy.android.ohmylist.interfaces.IAppViewManager;
import cbedoy.android.ohmylist.interfaces.IMessageRepresentationHandler;
import cbedoy.android.ohmylist.widgets.NavigationBar;


/**
 * Created by Carlos on 14/10/2014.
 */
public abstract class AbstractViewController implements NavigationBar.INavigationBarDelegate
{
    protected Context context;
    protected CONTROLLER tag;
    protected IAppViewManager appViewManager;
    protected View view;
    protected Bitmap backgroundBitmap;
    protected IMessageRepresentationHandler messageRepresentation;
    protected NavigationBar navigationBar;
    protected boolean buttonStatus;

    public enum CONTROLLER
    {
        LOGIN,
        SINGUP,
        PROFILE,
        DEGREE,
        GRADE,
        GROUP,
        LIST,
        USER_PROFILE,
        NOTES,
        BESTGUYS,
        CALIFICATION
    }

    protected abstract View init();
    public abstract void reload();

    public void setTag(CONTROLLER tag) {
        this.tag = tag;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setAppViewManager(IAppViewManager appViewManager) {
        this.appViewManager = appViewManager;
    }

    public void setBackgroundBitmap(Bitmap backgroundBitmap) {
        this.backgroundBitmap = backgroundBitmap;
    }

    protected void setButtonStatus(boolean buttonStatus) {
        this.buttonStatus = buttonStatus;
    }

    public void setMessageRepresentation(IMessageRepresentationHandler messageRepresentation) {
        this.messageRepresentation = messageRepresentation;
    }

    public View getView() {
        if(view == null)
            view = init();
        return view;
    }

    public void backPressed() {
        this.appViewManager.getActivity().finish();
    }

    public void nextPressed() {

    }

    public void toogleButtons(boolean status) {
        this.buttonStatus = status;
    }

    public boolean onBackPressed() {
        return true;
    }

    public void setNavigationBar(NavigationBar navigationBar) {
        this.navigationBar = navigationBar;
    }
}
