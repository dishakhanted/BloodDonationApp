package com.raksha.bmsce.blooddonation.ui.userdetail;

import com.raksha.bmsce.blooddonation.base.BasePresenter;
import com.raksha.bmsce.blooddonation.base.BaseView;
import com.raksha.bmsce.blooddonation.ui.userdetail.model.UserDetail;

/**
 * Created by riteshksingh on Apr, 2018
 */
public interface UserDetailContract {
    interface Presenter extends BasePresenter {
        void onCreateNowClick(UserDetail userDetail);

        void onDobButtonClick();

        void onLocationClick();
    }

    interface View extends BaseView {
        void showDatePickerDialog();

        void getLastLocation();

        void launchHomeScreen();

    }
}
