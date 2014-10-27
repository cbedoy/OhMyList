package cbedoy.android.ohmylist.services;


import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyInformationDelegate;
import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyInformationHandler;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationInformationDelegate;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeInformationDelegate;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeInformationHandler;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupInformationDelegate;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupInformationHandler;
import cbedoy.android.ohmylist.business.list.interfaces.IListInformationDelegate;
import cbedoy.android.ohmylist.business.list.interfaces.IListInformationHandler;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginInformationHandler;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteInformationDelegate;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteInformationHandler;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileInformationDelegate;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileInformationHandler;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupInformationDelegate;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupInformationHandler;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileInformationDelegate;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileInformationHandler;
import cbedoy.android.ohmylist.interfaces.IMementoHandler;
import cbedoy.android.ohmylist.interfaces.IRestService;

public class InformationService implements ILoginInformationHandler, IBestGuyInformationHandler, IDegreeInformationHandler, IGroupInformationHandler, IListInformationHandler, INoteInformationHandler, IProfileInformationHandler, ISignupInformationHandler, IUserProfileInformationHandler
{
    private IRestService restService;
    private IMementoHandler mementoHandler;
    private IBestGuyInformationDelegate bestGuyInformationDelegate;
    private ICalificationInformationDelegate calificationInformationDelegate;
    private IDegreeInformationDelegate degreeInformationDelegate;
    private IGroupInformationDelegate groupInformationDelegate;
    private IListInformationDelegate listInformationDelegate;
    private INoteInformationDelegate noteInformationDelegate;
    private IProfileInformationDelegate profileInformationDelegate;
    private ISignupInformationDelegate signupInformationDelegate;
    private IUserProfileInformationDelegate userProfileInformationDelegate;

    public void setBestGuyInformationDelegate(IBestGuyInformationDelegate bestGuyInformationDelegate) {
        this.bestGuyInformationDelegate = bestGuyInformationDelegate;
    }

    public void setCalificationInformationDelegate(ICalificationInformationDelegate calificationInformationDelegate) {
        this.calificationInformationDelegate = calificationInformationDelegate;
    }

    public void setDegreeInformationDelegate(IDegreeInformationDelegate degreeInformationDelegate) {
        this.degreeInformationDelegate = degreeInformationDelegate;
    }

    public void setGroupInformationDelegate(IGroupInformationDelegate groupInformationDelegate) {
        this.groupInformationDelegate = groupInformationDelegate;
    }

    public void setListInformationDelegate(IListInformationDelegate listInformationDelegate) {
        this.listInformationDelegate = listInformationDelegate;
    }

    public void setMementoHandler(IMementoHandler mementoHandler) {
        this.mementoHandler = mementoHandler;
    }

    public void setNoteInformationDelegate(INoteInformationDelegate noteInformationDelegate) {
        this.noteInformationDelegate = noteInformationDelegate;
    }

    public void setProfileInformationDelegate(IProfileInformationDelegate profileInformationDelegate) {
        this.profileInformationDelegate = profileInformationDelegate;
    }

    public void setRestService(IRestService restService) {
        this.restService = restService;
    }

    public void setSignupInformationDelegate(ISignupInformationDelegate signupInformationDelegate) {
        this.signupInformationDelegate = signupInformationDelegate;
    }

    public void setUserProfileInformationDelegate(IUserProfileInformationDelegate userProfileInformationDelegate) {
        this.userProfileInformationDelegate = userProfileInformationDelegate;
    }

    /*
    @Override
    public void performCategoriesRequest() {
        String url = "/apprende/course/get/";
        HashMap<String, Object> parameters = new HashMap<String, Object>();
        IRestService.IRestCallback callback = new IRestService.IRestCallback() {
            @Override
            public void run(HashMap<String, Object> response) {
                categoryInformationDelegate.categoryResponse(response);
            }
        };
        restService.request(url, parameters, callback);
    }
*/

}
