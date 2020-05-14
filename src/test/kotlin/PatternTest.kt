import com.jetbrains.rd.util.first
import javax.swing.tree.DefaultMutableTreeNode

fun main() {
    var message = "TASK com.zhihu.android id=1134 userId=0\n" +
            "  ACTIVITY com.zhihu.android/.app.ui.activity.HostActivity 37a3e09 pid=22163\n" +
            "    Local Activity b6948f9 State:\n" +
            "      mResumed=true mStopped=false mFinished=false\n" +
            "      mChangingConfigurations=false\n" +
            "      mCurrentConfig={1.0 460mcc1mnc [zh_CN_#Hans,zh_CN,en_CN] ldltr sw360dp w360dp h755dp 480dpi nrml long port finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 1080, 2340) mAppBounds=Rect(0, 75 - 1080, 2340) mWindowingMode=fullscreen mDisplayWindowingMode=fullscreen mActivityType=standard mAlwaysOnTop=undefined mRotation=ROTATION_0} suim:1 s.1}\n" +
            "      mLoadersStarted=true\n" +
            "      Active Fragments in 4f1e6d3:\n" +
            "        #0: s{985c210 #0 androidx.lifecycle.LifecycleDispatcher.report_fragment_tag}\n" +
            "          mFragmentId=#0 mContainerId=#0 mTag=androidx.lifecycle.LifecycleDispatcher.report_fragment_tag\n" +
            "          mState=5 mIndex=0 mWho=android:fragment:0 mBackStackNesting=0\n" +
            "          mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "          mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "          mRetainInstance=false mRetaining=false mUserVisibleHint=true\n" +
            "          mFragmentManager=FragmentManager{4f1e6d3 in HostCallbacks{774b109}}\n" +
            "          mHost=android.app.ActivityHostCallbacks@774b109\n" +
            "          Child FragmentManager{964f0e in s{985c210}}:\n" +
            "            FragmentManager misc state:\n" +
            "              mHost=android.app.ActivityHostCallbacks@774b109\n" +
            "              mContainer=android.app.Fragment\$1@eea1d2f\n" +
            "              mParent=s{985c210 #0 androidx.lifecycle.LifecycleDispatcher.report_fragment_tag}\n" +
            "              mCurState=5 mStateSaved=false mDestroyed=false\n" +
            "      Added Fragments:\n" +
            "        #0: s{985c210 #0 androidx.lifecycle.LifecycleDispatcher.report_fragment_tag}\n" +
            "      FragmentManager misc state:\n" +
            "        mHost=android.app.ActivityHostCallbacks@774b109\n" +
            "        mContainer=android.app.ActivityHostCallbacks@774b109\n" +
            "        mCurState=5 mStateSaved=false mDestroyed=false\n" +
            "    ViewRoot:\n" +
            "      mAdded=true mRemoved=false\n" +
            "      mConsumeBatchedInputScheduled=false\n" +
            "      mConsumeBatchedInputImmediatelyScheduled=false\n" +
            "      mPendingInputEventCount=0\n" +
            "      mProcessInputEventsScheduled=false\n" +
            "      mTraversalScheduled=false      mIsAmbientMode=false\n" +
            "      android.view.ViewRootImplNativePreImeInputStage: mQueueLength=0\n" +
            "      android.view.ViewRootImplImeInputStage: mQueueLength=0\n" +
            "      android.view.ViewRootImplNativePostImeInputStage: mQueueLength=0\n" +
            "    Choreographer:\n" +
            "      mFrameScheduled=false\n" +
            "      mLastFrameTime=370870295 (89789 ms ago)\n" +
            "    Looper (main, tid 1) {d626c40}\n" +
            "      Message 0: { when=+8m28s928ms callback=com.zhihu.android.app.search.preset.f target=android.os.Handler }\n" +
            "      (Total messages: 1, polling=false, quitting=false)\n" +
            "    AutofillManager:\n" +
            "      sessionId: 2147483647\n" +
            "      state: UNKNOWN\n" +
            "      context: com.zhihu.android.app.ui.activity.HostActivity@b6948f9\n" +
            "      client: com.zhihu.android.app.ui.activity.HostActivity@b6948f9 (android.os.BinderProxy@98abe9a)\n" +
            "      enabled: false\n" +
            "      enabledAugmentedOnly: false\n" +
            "      hasService: true\n" +
            "      hasCallback: false\n" +
            "      onInvisibleCalled false\n" +
            "      last autofilled data: null\n" +
            "      id of last fill UI shown: null\n" +
            "      tracked views: null\n" +
            "      fillable ids: null\n" +
            "      entered ids: null\n" +
            "      save trigger id: null\n" +
            "      save on finish(): false\n" +
            "      options: logLvl=0, compatMode=false, augmented=false\n" +
            "      compat mode enabled: false\n" +
            "      debug: false verbose: false\n" +
            "    Autofill Compat Mode: false\n" +
            "    No ContentCaptureManager\n" +
            "    ResourcesManager:\n" +
            "      cached apks: 0 [cache disabled]\n" +
            "      total apks: 3\n" +
            "      resources: 4\n" +
            "      resource impls: 3\n" +
            "    Local FragmentActivity b6948f9 State:\n" +
            "      mCreated=true mResumed=true mStopped=false    Active Fragments in 12aa4da:\n" +
            "    ParentFragment{7fecd0b (73a8529b-e1c7-4c21-81af-2e569d73a59c) id=0x7f0a089e HostActivity::ParentFragment}\n" +
            "        mFragmentId=#7f0a089e mContainerId=#7f0a089e mTag=HostActivity::ParentFragment\n" +
            "        mState=4 mWho=73a8529b-e1c7-4c21-81af-2e569d73a59c mBackStackNesting=0\n" +
            "        mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "        mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "        mRetainInstance=false mUserVisibleHint=true\n" +
            "        mFragmentManager=FragmentManager{12aa4da in a{b78d7e8}}\n" +
            "        mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "        mArguments=Bundle[{zhihu:parent_fragment:extra_bundle=Bundle[{UserNavigationClick=1589442061491, extra_tag=fakeurl://answer/answer_1219458172, promotion_extra=[], key_router_raw_url=https://zhihu.com/question/394460693/answer/1219458172, source_preload=HomePage, extra_answer_id=1219458172, extra_question_id=394460693, key_router_module=content}], zhihu:parent_fragment:force_initialize=true, zhihu:parent_fragment:host=com.zhihu.android.answer.module.pager.AnswerPagerFragment}]\n" +
            "        mContainer=com.zhihu.android.base.widget.ZHFrameLayout{b4a8327 V.E...... ........ 0,0-1080,2340 #7f0a089e app:id/fragment_container}\n" +
            "        mView=android.widget.FrameLayout{9d9e9d4 V.E...... ........ 0,0-1080,2340 #7f0a0fab app:id/parent_fragment_content_id}\n" +
            "        mInnerView=android.widget.FrameLayout{9d9e9d4 V.E...... ........ 0,0-1080,2340 #7f0a0fab app:id/parent_fragment_content_id}\n" +
            "        Child FragmentManager{9acce01 in ParentFragment{7fecd0b}}:\n" +
            "          Active Fragments in 9acce01:\n" +
            "          AnswerPagerFragment{2f8d81c (562209fc-561d-46ed-b733-8bd900d1e958) id=0x7f0a0fab host}\n" +
            "              mFragmentId=#7f0a0fab mContainerId=#7f0a0fab mTag=host\n" +
            "              mState=4 mWho=562209fc-561d-46ed-b733-8bd900d1e958 mBackStackNesting=0\n" +
            "              mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "              mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "              mRetainInstance=false mUserVisibleHint=true\n" +
            "              mFragmentManager=FragmentManager{9acce01 in ParentFragment{7fecd0b}}\n" +
            "              mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "              mParentFragment=ParentFragment{7fecd0b (73a8529b-e1c7-4c21-81af-2e569d73a59c) id=0x7f0a089e HostActivity::ParentFragment}\n" +
            "              mArguments=Bundle[{UserNavigationClick=1589442061491, extra_tag=fakeurl://answer/answer_1219458172, promotion_extra=[], key_router_raw_url=https://zhihu.com/question/394460693/answer/1219458172, source_preload=HomePage, extra_answer_id=1219458172, extra_question_id=394460693, key_router_module=content}]\n" +
            "              mContainer=android.widget.FrameLayout{9d9e9d4 V.E...... ........ 0,0-1080,2340 #7f0a0fab app:id/parent_fragment_content_id}\n" +
            "              mView=android.widget.RelativeLayout{4ff577d V.E...... ........ 0,0-1080,2340}\n" +
            "              mInnerView=android.widget.RelativeLayout{4ff577d V.E...... ........ 0,0-1080,2340}\n" +
            "              Child FragmentManager{b1e34a6 in AnswerPagerFragment{2f8d81c}}:\n" +
            "                Active Fragments in b1e34a6:\n" +
            "                AnswerFragment{d60e709 (ead4aa11-9e06-40b7-b349-c126067fd080) id=0x5}\n" +
            "                    mFragmentId=#5 mContainerId=#5 mTag=null\n" +
            "                    mState=4 mWho=ead4aa11-9e06-40b7-b349-c126067fd080 mBackStackNesting=0\n" +
            "                    mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "                    mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "                    mRetainInstance=false mUserVisibleHint=true\n" +
            "                    mFragmentManager=FragmentManager{b1e34a6 in AnswerPagerFragment{2f8d81c}}\n" +
            "                    mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "                    mParentFragment=AnswerPagerFragment{2f8d81c (562209fc-561d-46ed-b733-8bd900d1e958) id=0x7f0a0fab host}\n" +
            "                    mArguments=Bundle[{UserNavigationClick=1589442061491, extra_next_answer_id=0, extra_tag=fakeurl://answer/answer_1219458172, promotion_extra=[], key_router_raw_url=https://zhihu.com/question/394460693/answer/1219458172, source_preload=HomePage, extra_answer={\"attachInfo\":null,\"isEdit\":false,\"readPosition\":0,\"sectionName\":null,\"type\":null,\"url\":null,\"activity_topping_info\":null,\"ad_answer\":null,\"admin_closed_comment\":false,\"annotation_detail\":null,\"banner\":null,\"paid_info\":null,\"tags\":null,\"thumbnail_info\":null,\"answer_type\":null,\"attached_info\":null,\"attached_info_bytes\":null,\"author\":null,\"collection\":null,\"question\":null,\"collaboration_status\":null,\"collapse_reason\":null,\"collapsed_counts\":0,\"collection_count\":0,\"collections\":null,\"comment_count\":0,\"comment_permission\":null,\"can_comment\":null,\"content\":null,\"created_time\":0,\"decorative_labels\":null,\"draft_title\":null,\"editable_content\":null,\"excerpt\":null,\"extras\":null,\"mcn_fp_show\":0,\"from_source\":null,\"has_publishing_draft\":false,\"has_sync_club_post\":false,\"hermes_label\":null,\"id\":1219458172,\"is_collapsed\":false,\"is_copyable\":false,\"is_mine\":false,\"is_sticky\":false,\"is_topic_active_answerer\":false,\"label_info\":null,\"pagination_info\":null,\"pin_content\":null,\"pin_content_thumbnails\":null,\"relationship\":null,\"relevant_info\":null,\"review_info\":null,\"reward_info\":null,\"sticky_info\":null,\"suggest_edit\":null,\"thanks_count\":0,\"thumbnail\":null,\"thumbnail_extra_info\":null,\"title\":null,\"topic_tag\":null,\"topic_thumbnails\":null,\"topic_thumbnails_extra_info\":null,\"updated_time\":0,\"video_info\":null,\"visit_count\":0,\"voteup_count\":0,\"wow_badge\":null}, extra_answer_id=1219458172, extra_question_id=394460693, key_router_module=content}]\n" +
            "                    mContainer=com.zhihu.android.answer.widget.VerticalViewPager{bd5cf40 VFED..... ........ 0,0-1080,2097 #5}\n" +
            "                    mView=com.zhihu.android.base.widget.ZHFrameLayout{aaeee79 V.E...... ........ 0,0-1080,2097}\n" +
            "                    mInnerView=com.zhihu.android.base.widget.ZHFrameLayout{aaeee79 V.E...... ........ 0,0-1080,2097}\n" +
            "                    Child FragmentManager{e4b2ee7 in AnswerFragment{d60e709}}:\n" +
            "                      FragmentManager misc state:\n" +
            "                        mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "                        mContainer=androidx.fragment.app.d\$3@bf78a94\n" +
            "                        mParent=AnswerFragment{d60e709 (ead4aa11-9e06-40b7-b349-c126067fd080) id=0x5}\n" +
            "                        mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "                AnswerFragment{f0ce21a (b9405cb2-d64b-4355-a9fa-d1f1e1e56074) id=0x5}\n" +
            "                    mFragmentId=#5 mContainerId=#5 mTag=null\n" +
            "                    mState=4 mWho=b9405cb2-d64b-4355-a9fa-d1f1e1e56074 mBackStackNesting=0\n" +
            "                    mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "                    mHidden=false mDetached=false mMenuVisible=false mHasMenu=false\n" +
            "                    mRetainInstance=false mUserVisibleHint=false\n" +
            "                    mFragmentManager=FragmentManager{b1e34a6 in AnswerPagerFragment{2f8d81c}}\n" +
            "                    mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "                    mParentFragment=AnswerPagerFragment{2f8d81c (562209fc-561d-46ed-b733-8bd900d1e958) id=0x7f0a0fab host}\n" +
            "                    mArguments=Bundle[{UserNavigationClick=1589442061491, extra_next_answer_id=1220071417, extra_tag=fakeurl://answer/answer_1219458172, promotion_extra=[], key_router_raw_url=https://zhihu.com/question/394460693/answer/1219458172, source_preload=HomePage, extra_answer={\"attachInfo\":null,\"isEdit\":false,\"readPosition\":0,\"sectionName\":null,\"type\":\"answer\",\"url\":\"https://api.zhihu.com/answers/1222017732\",\"activity_topping_info\":null,\"ad_answer\":null,\"admin_closed_comment\":false,\"annotation_detail\":null,\"banner\":null,\"paid_info\":null,\"tags\":null,\"thumbnail_info\":{\"thumbnails\":[{\"attached_info\":null,\"height\":467,\"router\":null,\"type\":\"image\",\"url\":\"https://unicom-free.zhimg.com/80/v2-eab822292cd28812fdd1631e5b11d013_bh.jpg\",\"width\":690},{\"attached_info\":null,\"height\":1250,\"router\":null,\"type\":\"image\",\"url\":\"https://unicom-free.zhimg.com/80/v2-51594137a9c79ed5233699bc34f770ea_bh.jpg\",\"width\":1665},{\"attached_info\":null,\"height\":1250,\"router\":null,\"type\":\"image\",\"url\":\"https://unicom-free.zhimg.com/80/v2-cd95e5e885253af24a1e0daae3b57645_bh.jpg\",\"width\":1665}],\"count\":7,\"type\":\"thumbnail_info\"},\"answer_type\":\"normal\",\"attached_info\":\"ogEQCAQQAxjEhdrGBCCV/Iu8AQ==\",\"attached_info_bytes\":null,\"author\":{\"entrance\":null,\"marketStatistics\":null,\"anonymous\":false,\"type\":\"people\",\"url\":\"https://api.zhihu.com/people/46481faf007737db3866cbbc29529864\",\"account_status\":null,\"agora_published\":false,\"algorithm_right\":null,\"all_verify_apply\":null,\"answer_count\":0,\"articles_count\":0,\"ask_about_count\":0,\"attached_info_bytes\":null,\"auto_sending_creations\":false,\"avatar_url\":\"https://unicom-free.zhimg.com/v2-7fb7f2c7773e2e46cbcff39f7879f042_s.jpg\",\"badge\":[],\"birthday\":null,\"business\":null,\"columns_count\":0,\"cover_url\":null,\"created_at\":0,\"creator_info\":null,\"has_daily_recommend_permission\":false,\"description\":null,\"draft_count\":0,\"edu_member_tag\":null,\"educations\":null,\"email\":null,\"employments\":null,\"exposed_medal\":null,\"favorite_count\":0,\"favorited_count\":0,\"finance_info\":null,\"is_followed\":false,\"follower_count\":0,\"is_following\":false,\"following_columns_count\":0,\"following_count\":0,\"following_favlists_count\":0,\"following_question_count\":0,\"following_topic_count\":0,\"friendly_score\":0.0,\"gender\":1,\"headline\":\"认真而有趣的列文虎克\",\"hosted_live_count\":0,\"id\":\"46481faf007737db3866cbbc29529864\",\"i_articles_count\":0,\"is_active\":false,\"is_advertiser\":false,\"is_apply_renamed\":false,\"is_baned\":false,\"is_blocking\":false,\"is_activity_blocked\":false,\"is_bind_sina\":false,\"is_bind_phone\":false,\"is_enable_double_click_voteup\":false,\"is_enable_spokesman_theme\":false,\"is_enable_watermark\":false,\"is_force_renamed\":false,\"is_force_reset_password\":false,\"is_hanged\":false,\"is_invited\":false,\"is_locked\":false,\"is_event14d_member\":false,\"is_noti_reset_password\":false,\"is_org\":false,\"is_professional\":false,\"is_realname\":false,\"is_subscribing\":false,\"is_unicom_free\":false,\"locations\":null,\"marked_answers_count\":0,\"marked_answers_text\":null,\"mcn_user_info\":null,\"name\":\"锦曦日\",\"open_ebook_feature\":false,\"oppose_right\":null,\"org_detail\":null,\"participated_live_count\":0,\"phone_noull,\"pin_count\":0,\"pin_show_educations\":null,\"pins_count\":0,\"push_channel\":null,\"qq_weibo_name\":null,\"qq_weibo_url\":null,\"question_count\":0,\"reaction_count\":0,\"reactions_count\":0,\"recommend_msg\":null,\"renamed_fullname\":null,\"answered_num\":0,\"shared_count\":0,\"sina_weibo_name\":null,\"sina_weibo_url\":null,\"thanked_count\":0,\"total_creation_count\":0,\"total_favorite_count\":0,\"total_following_count\":0,\"uid\":0,\"url_token\":\"jin-xi-ri-52\",\"use_default_avatar\":false,\"user_type\":\"people\",\"vip_info\":{\"entrance\":null,\"is_vip\":true,\"rename_days\":0,\"vip_icon\":{\"night_mode_url\":\"https://unicom-free.zhimg.com/v2-c9686ff064ea3579730756ac6c289978_r.png\",\"url\":\"https://unicom-free.zhimg.com/v2-4812630bc27d642f7cafcd6cdeca3d7a_r.png\"},\"widget\":null},\"voteup_count\":0,\"infinity\":null,\"zvideo_count\":0},\"collection\":null,\"question\":{\"commercial\":false,\"normal\":true,\"org\":false,\"type\":\"question\",\"url\":\"https://api.zhihu.com/questions/394460693\",\"admin_closed_comment\":false,\"annotation_detail\":null,\"answer_count\":0,\"tags\":null,\"thumbnail_info\":null,\"answer_thumbnail_urls\":null,\"answerer_avatar_urls\":null,\"answers\":null,\"attached_info_bytes\":null,\"author\":null,\"circle_info\":null,\"collapsed_answer_count\":0,\"comment_count\":0,\"comment_permission\":null,\"can_comment\":null,\"created\":1589325202,\"detail\":null,\"draft\":null,\"encourage_video_answer\":null,\"excerpt\":null,\"follower_count\":0,\"has_publishing_draft\":false,\"header_info\":null,\"id\":394460693,\"allow_delete\":false,\"is_editable\":false,\"is_following\":false,\"is_reportable\":false,\"is_topic_active_answerer\":false,\"meta_related_topics\":null,\"mute_info\":null,\"name\":null,\"question_type\":\"normal\",\"redirection\":null,\"relationship\":{\"is_anonymous\":false,\"is_author\":false,\"is_delayed\":false,\"is_favorited\":false,\"is_following\":false,\"is_liked\":false,\"is_nothelp\":false,\"is_thanked\":false,\"my_answer\":null,\"reaction_type\":null,\"voting\":0},\"review_info\":null,\"slideshow_answer\":null,\"status\":null,\"suggest_edit\":null,\"thumbnails\":null,\"title\":\"被称为对称狂魔的岸本，在火影忍者中有过哪l,\"thumbnails_v2\":null,\"topics\":null,\"updated_time\":1589325202,\"visit_count\":0},\"collaboration_status\":null,\"collapse_reason\":null,\"collapsed_counts\":0,\"collection_count\":0,\"collections\":null,\"comment_count\":4,\"comment_permission\":null,\"can_comment\":null,\"content\":null,\"created_time\":1589434655,\"decorative_labels\":[],\"draft_title\":null,\"editable_content\":null,\"excerpt\":\"说岸本是对称狂魔，是因为岸本在人物设计方面非常讲究“对立化”，包括佐助这个角色设计的初衷也是为[图片] 譬如《火影》中最主打的 兄弟宿命、伙伴羁绊的对称，上至远古时期的阿修罗因陀罗兄弟俩，中到忍村初期的柱间和斑，下有主角年代的鸣人佐助，并且在鸣人佐助这一ce\":null,\"has_publishing_draft\":false,\"has_sync_club_post\":false,\"hermes_label\":null,\"id\":1222017732,\"is_collapsed\":false,\"is_copyable\":false,\"is_mine\":false,\"is_sticky\":false,\"is_topic_active_answerer\":false,\"label_info\":{\"foreground_color\":{\"alpha\":1.0,\"group\":\"GYL02A\"},\"icon_url\":\"https://unicom-free.zhimg.com/v2-d66dabdf15e6f8f42919ccb29e8e2ecb_r.png\",\"text\":\"圆桌精选\",\"type\":\"roundtable\"},\"pagination_info\":null,\"pin_content\":null,\"pin_content_thumbnails\":n\"relationship\":{\"is_anonymous\":false,\"is_author\":false,\"is_delayed\":false,\"is_favorited\":false,\"is_following\":false,\"is_liked\":false,\"is_nothelp\":false,\"is_thanked\":false,\"my_answer\":null,\"reaction_type\":null,\"voting\":0},\"relevant_info\":{\"is_relevant\":false,\"relevant_text\":\"\"},\"review_info\":null,\"reward_info\":null,\"sticky_info\":\"\",\"suggest_edit\":null,\"thanks_count\":6,\"thumbnail\":null,\"thumbnail_extra_info\":null,\"title\":null,\"topic_tag\":null,\"topic_thumbnails\":null,\"topic_thumbnails_extra_info\":null,\"updated_time\":1589434893,\"video_info\":null,\"visit_count\":0,\"voteup_count\":55,\"wow_badge\":null}, extra_answer_id=1222017732, extra_question_id=394460693, key_router_module=content}]\n" +
            "                    mContainer=com.zhihu.android.answer.widget.VerticalViewPager{bd5cf40 VFED..... ........ 0,0-1080,2097 #5}\n" +
            "                    mView=com.zhihu.android.base.widget.ZHFrameLayout{3034ab3 V.E...... ........ 1080,0-2160,2097}\n" +
            "                    mInnerView=com.zhihu.android.base.widget.ZHFrameLayout{3034ab3 V.E...... ........ 1080,0-2160,2097}\n" +
            "                    Child FragmentManager{111d283 in AnswerFragment{f0ce21a}}:\n" +
            "                      FragmentManager misc state:\n" +
            "                        mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "                        mContainer=androidx.fragment.app.d\$3@70cbc00\n" +
            "                        mParent=AnswerFragment{f0ce21a (b9405cb2-d64b-4355-a9fa-d1f1e1e56074) id=0x5}\n" +
            "                        mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "                Added Fragments:\n" +
            "                  #0: AnswerFragment{d60e709 (ead4aa11-9e06-40b7-b349-c126067fd080) id=0x5}\n" +
            "                  #1: AnswerFragment{f0ce21a (b9405cb2-d64b-4355-a9fa-d1f1e1e56074) id=0x5}\n" +
            "                FragmentManager misc state:\n" +
            "                  mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "                  mContainer=androidx.fragment.app.d\$3@9b43c39\n" +
            "                  mParent=AnswerPagerFragment{2f8d81c (562209fc-561d-46ed-b733-8bd900d1e958) id=0x7f0a0fab host}\n" +
            "                  mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "          Added Fragments:\n" +
            "            #0: AnswerPagerFragment{2f8d81c (562209fc-561d-46ed-b733-8bd900d1e958) id=0x7f0a0fab host}\n" +
            "          FragmentManager misc state:\n" +
            "            mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "            mContainer=androidx.fragment.app.d\$3@92d327e\n" +
            "            mParent=ParentFragment{7fecd0b (73a8529b-e1c7-4c21-81af-2e569d73a59c) id=0x7f0a089e HostActivity::ParentFragment}\n" +
            "            mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "    Added Fragments:\n" +
            "      #0: ParentFragment{7fecd0b (73a8529b-e1c7-4c21-81af-2e569d73a59c) id=0x7f0a089e HostActivity::ParentFragment}\n" +
            "    FragmentManager misc state:\n" +
            "      mHost=androidx.fragment.app.ea@b78d7e8\n" +
            "      mContainer=androidx.fragment.app.ea@b78d7e8\n" +
            "      mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n"

    message.split(Regex("Local FragmentActivity.*State:"))
            .lastOrNull()?.run {
                val s = reader().readLines()
                        .filter {
                            it.contains(Regex("#[0-9]:"))
                                    || it.contains("Added Fragments:")
                                    || it.contains("mParent=")
                        }.joinToString("\n")
                print(s)
            }
}

private fun getLeftSpaceNum(string: String): Int {
    var spaceNum = 0
    val len = string.length
    for (i in 0..len) {
        if (string[i] == ' ') spaceNum++ else break
    }
    return spaceNum
}


