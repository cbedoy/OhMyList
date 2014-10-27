package cbedoy.android.ohmylist.business.userprofile;

import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileInformationDelegate;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileInformationHandler;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileRepresentationDelegate;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileTransactionDelegate;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class UserProfileBusinessController implements IUserProfileInformationDelegate, IUserProfileRepresentationDelegate, IUserProfileTransactionDelegate
{
    private IUserProfileInformationHandler informationHandler;
    private IUserProfileTransactionHandler transactionHandler;
    private IUserProfileRepresentationDelegate representationDelegate;

    public void setInformationHandler(IUserProfileInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }

    public void setTransactionHandler(IUserProfileTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

    public void setRepresentationDelegate(IUserProfileRepresentationDelegate representationDelegate) {
        this.representationDelegate = representationDelegate;
    }
}
