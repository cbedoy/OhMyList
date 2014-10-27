package cbedoy.android.ohmylist.business.degree;

import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeInformationDelegate;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeInformationHandler;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeRepresentationDelegate;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeRepresentationHandler;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeTransactionDelegate;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class DegreeBusinessController implements IDegreeInformationDelegate, IDegreeRepresentationDelegate, IDegreeTransactionDelegate
{
    private IDegreeTransactionHandler transactionHandler;
    private IDegreeInformationHandler informationHandler;
    private IDegreeRepresentationHandler representationHandler;

    public void setInformationHandler(IDegreeInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }

    public void setRepresentationHandler(IDegreeRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setTransactionHandler(IDegreeTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }
}
