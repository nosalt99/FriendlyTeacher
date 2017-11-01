package com.leedopoem.ljh.friendlyteacher.homepage.fragment.communicate;

import com.leedopoem.ljh.friendlyteacher.base.BasePresenter;
import com.leedopoem.ljh.friendlyteacher.base.BaseView;
import com.leedopoem.ljh.friendlyteacher.data.entity.LeaveWord;
import com.leedopoem.ljh.friendlyteacher.data.entity.Lecture;

import java.util.List;

/**
 * Created by ljh on 17-10-30.
 */

public class CommunicateContract {
    interface View extends BaseView<CommunicateContract.Presenter> {
        void showLecturesMissing();
        void showLeaveWords(List<LeaveWord> leaveWords);
    }

    interface Presenter extends BasePresenter {
        void loadLeaveWords();
        void addLeaveWords();
        void openLeaveWordsDetails();
    }
}
