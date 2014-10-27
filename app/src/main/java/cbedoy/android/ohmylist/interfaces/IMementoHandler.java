package cbedoy.android.ohmylist.interfaces;

import java.util.HashMap;

import cbedoy.android.ohmylist.services.Memento;

public interface IMementoHandler {

    public void clearStack();

    public Memento getTopMemento();

    public boolean popDataFor(Object owner);

    public Object getLastOwnerWithBackSupport();

    public void setStateForOwner(HashMap<String, Object> data, Object owner);

}
