package cbedoy.android.ohmylist.business;

import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyTransactionDelegate;
import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyTransactionHandler;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationTransactionDelegate;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationTransactionHandler;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeTransactionDelegate;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeTransactionHandler;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupTransactionDelegate;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupTransactionHandler;
import cbedoy.android.ohmylist.business.list.interfaces.IListTransactionDelegate;
import cbedoy.android.ohmylist.business.list.interfaces.IListTransactionHandler;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginTransactionDelegate;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginTransactionHandler;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteTransactionDelegate;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteTransactionHandler;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileTransactionDelegate;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileTransactionHandler;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupTransactionDelegate;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileTransactionDelegate;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class MasterBusinessController extends BusinessController implements IBestGuyTransactionHandler, ICalificationTransactionHandler, IDegreeTransactionHandler, IGroupTransactionHandler, IListTransactionHandler, ILoginTransactionHandler, INoteTransactionHandler, IProfileTransactionHandler, IUserProfileTransactionHandler
{
    private IBestGuyTransactionDelegate bestGuyTransactionDelegate;
    private ICalificationTransactionDelegate calificationTransactionDelegate;
    private IDegreeTransactionDelegate degreeTransactionDelegate;
    private IGroupTransactionDelegate groupTransactionDelegate;
    private IListTransactionDelegate listTransactionDelegate;
    private ILoginTransactionDelegate loginTransactionDelegate;
    private IProfileTransactionDelegate profileTransactionDelegate;
    private INoteTransactionDelegate noteTransactionDelegate;
    private ISignupTransactionDelegate signupTransactionDelegate;
    private IUserProfileTransactionDelegate transactionDelegate;

    public void setBestGuyTransactionDelegate(IBestGuyTransactionDelegate bestGuyTransactionDelegate) {
        this.bestGuyTransactionDelegate = bestGuyTransactionDelegate;
    }

    public void setCalificationTransactionDelegate(ICalificationTransactionDelegate calificationTransactionDelegate) {
        this.calificationTransactionDelegate = calificationTransactionDelegate;
    }

    public void setDegreeTransactionDelegate(IDegreeTransactionDelegate degreeTransactionDelegate) {
        this.degreeTransactionDelegate = degreeTransactionDelegate;
    }

    public void setGroupTransactionDelegate(IGroupTransactionDelegate groupTransactionDelegate) {
        this.groupTransactionDelegate = groupTransactionDelegate;
    }

    public void setListTransactionDelegate(IListTransactionDelegate listTransactionDelegate) {
        this.listTransactionDelegate = listTransactionDelegate;
    }

    public void setLoginTransactionDelegate(ILoginTransactionDelegate loginTransactionDelegate) {
        this.loginTransactionDelegate = loginTransactionDelegate;
    }

    public void setNoteTransactionDelegate(INoteTransactionDelegate noteTransactionDelegate) {
        this.noteTransactionDelegate = noteTransactionDelegate;
    }

    public void setProfileTransactionDelegate(IProfileTransactionDelegate profileTransactionDelegate) {
        this.profileTransactionDelegate = profileTransactionDelegate;
    }

    public void setSignupTransactionDelegate(ISignupTransactionDelegate signupTransactionDelegate) {
        this.signupTransactionDelegate = signupTransactionDelegate;
    }

    public void setTransactionDelegate(IUserProfileTransactionDelegate transactionDelegate) {
        this.transactionDelegate = transactionDelegate;
    }

    public void startOhMyList(){

    }
}
