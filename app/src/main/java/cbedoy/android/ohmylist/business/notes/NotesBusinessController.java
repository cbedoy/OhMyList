package cbedoy.android.ohmylist.business.notes;

import cbedoy.android.ohmylist.business.notes.interfaces.INoteInformationDelegate;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteInformationHandler;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteRepresentationDelegate;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteRepresentationHandler;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteTransactionDelegate;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class NotesBusinessController implements INoteInformationDelegate, INoteRepresentationDelegate, INoteTransactionDelegate
{
    private INoteInformationHandler informationHandler;
    private INoteRepresentationHandler representationHandler;
    private INoteTransactionHandler transactionHandler;

    public void setTransactionHandler(INoteTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

    public void setRepresentationHandler(INoteRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setInformationHandler(INoteInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }
}
