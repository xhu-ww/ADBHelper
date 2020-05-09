import cn.xhuww.adb.data.FragmentInfo
import com.intellij.util.containers.toMutableSmartList
import com.intellij.util.io.encodeUrlQueryParameter

fun main() {
    var message = "TASK com.xflag.store.staging.debug id=330 userId=0\n" +
            "  ACTIVITY com.xflag.store.staging.debug/com.xflag.store.view.activity.B0101MainActivity 378f879 pid=27145\n" +
            "    Local Activity 201126b State:\n" +
            "      mResumed=true mStopped=false mFinished=false\n" +
            "      mChangingConfigurations=false\n" +
            "      mCurrentConfig={1.0 460mcc1mnc [zh_CN_#Hans,zh_CN,en_CN] ldltr sw360dp w360dp h755dp 480dpi nrml long port finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 1080, 2340) mAppBounds=Rect(0, 75 - 1080, 2340) mWindowingMode=fullscreen mDisplayWindowingMode=fullscreen mActivityType=standard mAlwaysOnTop=undefined mRotation=ROTATION_0} suim:1 s.3}\n" +
            "      mLoadersStarted=true\n" +
            "      Active Fragments in 89c7728:\n" +
            "        #0: ReportFragment{49d867e #0 android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag}\n" +
            "          mFragmentId=#0 mContainerId=#0 mTag=android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag\n" +
            "          mState=5 mIndex=0 mWho=android:fragment:0 mBackStackNesting=0\n" +
            "          mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "          mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "          mRetainInstance=false mRetaining=false mUserVisibleHint=true\n" +
            "          mFragmentManager=FragmentManager{89c7728 in HostCallbacks{980d7df}}\n" +
            "          mHost=android.app.Activity HostCallbacks@980d7df\n" +
            "          Child FragmentManager{31c0c2c in ReportFragment{49d867e}}:\n" +
            "            FragmentManager misc state:\n" +
            "              mHost=android.app.Activity HostCallbacks@980d7df\n" +
            "              mContainer=android.app.Fragment1@4aec6f5\n" +
            "              mParent=ReportFragment{49d867e #0 android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag}\n" +
            "              mCurState=5 mStateSaved=false mDestroyed=false\n" +
            "        #1: RequestManagerFragment{5878c8a #1 com.bumptech.glide.manager}{parent=null}\n" +
            "          mFragmentId=#0 mContainerId=#0 mTag=com.bumptech.glide.manager\n" +
            "          mState=5 mIndex=1 mWho=android:fragment:1 mBackStackNesting=0\n" +
            "          mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "          mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "          mRetainInstance=false mRetaining=false mUserVisibleHint=true\n" +
            "          mFragmentManager=FragmentManager{89c7728 in HostCallbacks{980d7df}}\n" +
            "          mHost=android.app.Activity HostCallbacks@980d7df\n" +
            "          Child FragmentManager{44512fb in RequestManagerFragment{5878c8a}}:\n" +
            "            FragmentManager misc state:\n" +
            "              mHost=android.app.Activity HostCallbacks@980d7df\n" +
            "              mContainer=android.app.Fragment1@653bf18\n" +
            "              mParent=RequestManagerFragment{5878c8a #1 com.bumptech.glide.manager}{parent=null}\n" +
            "              mCurState=5 mStateSaved=false mDestroyed=false\n" +
            "      Added Fragments:\n" +
            "        #0: ReportFragment{49d867e #0 android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag}\n" +
            "        #1: RequestManagerFragment{5878c8a #1 com.bumptech.glide.manager}{parent=null}\n" +
            "      FragmentManager misc state:\n" +
            "        mHost=android.app.Activity HostCallbacks@980d7df\n" +
            "        mContainer=android.app.Activity HostCallbacks@980d7df\n" +
            "        mCurState=5 mStateSaved=false mDestroyed=false\n" +
            "    ViewRoot:\n" +
            "      mAdded=true mRemoved=false\n" +
            "      mConsumeBatchedInputScheduled=false\n" +
            "      mConsumeBatchedInputImmediatelyScheduled=false\n" +
            "      mPendingInputEventCount=0\n" +
            "      mProcessInputEventsScheduled=false\n" +
            "      mTraversalScheduled=false      mIsAmbientMode=false\n" +
            "      android.view.ViewRootImpl NativePreImeInputStage: mQueueLength=0\n" +
            "      android.view.ViewRootImpl ImeInputStage: mQueueLength=0\n" +
            "      android.view.ViewRootImpl NativePostImeInputStage: mQueueLength=0\n" +
            "    Choreographer:\n" +
            "      mFrameScheduled=false\n" +
            "      mLastFrameTime=134439815 (3501 ms ago)\n" +
            "    \n" +
            "InsetsController:\n" +
            "      InsetsState\n" +
            "        InsetsSource type=TYPE_UNKNOWN_10 frame=[0,0][0,0] visible=false\n" +
            "        InsetsSource type=TYPE_BOTTOM_TAPPABLE_ELEMENT frame=[0,2340][1080,2466] visible=false\n" +
            "        InsetsSource type=TYPE_TOP_TAPPABLE_ELEMENT frame=[0,0][1080,75] visible=true\n" +
            "        InsetsSource type=TYPE_RIGHT_GESTURES frame=[1080,0][1080,2340] visible=false\n" +
            "        InsetsSource type=TYPE_LEFT_GESTURES frame=[0,0][0,2340] visible=false\n" +
            "        InsetsSource type=TYPE_BOTTOM_GESTURES frame=[0,2340][1080,2466] visible=false\n" +
            "        InsetsSource type=TYPE_TOP_GESTURES frame=[0,0][1080,75] visible=true\n" +
            "        InsetsSource type=TYPE_SIDE_BAR_1 frame=[0,2340][1080,2466] visible=false\n" +
            "        InsetsSource type=TYPE_TOP_BAR frame=[0,0][1080,75] visible=true\n" +
            "    View Hierarchy:\n" +
            "      DecorView@a71dd71[B0101MainActivity]\n" +
            "        android.widget.LinearLayout{a59e756 V.E...... ........ 0,0-1080,2340}\n" +
            "          android.view.ViewStub{f47e3d7 G.E...... ......I. 0,0-0,0 #10201ac android:id/action_mode_bar_stub}\n" +
            "          android.widget.FrameLayout{851b4c4 V.E...... ........ 0,0-1080,2340}\n" +
            "            android.support.v7.widget.FitWindowsLinearLayout{375dfad V.E...... ........ 0,0-1080,2340 #7f09000d app:id/action_bar_root}\n" +
            "              android.support.v7.widget.ViewStubCompat{2522e2 G.E...... ......I. 0,0-0,0 #7f090018 app:id/action_mode_bar_stub}\n" +
            "              android.support.v7.widget.ContentFrameLayout{d3ce673 V.E...... ........ 0,0-1080,2340 #1020002 android:id/content}\n" +
            "                android.widget.FrameLayout{1175930 V.E...... ........ 0,0-1080,2340}\n" +
            "                  android.support.v4.widget.DrawerLayout{f3dc9a9 VFE...... ........ 0,0-1080,2340 #7f090121 app:id/drawer_layout}\n" +
            "                    android.widget.FrameLayout{2768b2e V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "                      android.widget.FrameLayout{8ae633c V.E...... ........ 0,0-1080,2340}\n" +
            "                        android.widget.FrameLayout{e7576cf V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "                          android.widget.FrameLayout{e4b8c5 V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "                            android.widget.LinearLayout{550d85c V.E...... ........ 0,0-1080,2340}\n" +
            "                              android.support.design.widget.AppBarLayout{8805765 V.E...... ........ 0,0-1080,243}\n" +
            "                                android.widget.FrameLayout{6642c3a V.E...... ........ 0,0-1080,75}\n" +
            "                                  android.widget.FrameLayout{cfcb0eb V.E...... ........ 0,0-1080,75 #7f0902c7 app:id/statusBarSpace}\n" +
            "                                android.support.v7.widget.Toolbar{6411e48 V.E...... ........ 0,75-1080,243 #7f09038c app:id/toolbar}\n" +
            "                                  android.support.v7.widget.AppCompatImageButton{4a404e1 VFED..C.. ........ 0,0-168,168}\n" +
            "                                  android.support.v7.widget.AppCompatImageView{a58d206 V.ED..... ........ 216,63-540,105}\n" +
            "                                  android.support.v7.widget.ActionMenuView{e7370c7 V.E...... ........ 936,0-1080,168}\n" +
            "                                    android.widget.FrameLayout{46dd6f4 VFE...C.. ........ 0,0-144,168 #7f090201 app:id/menu_cart}\n" +
            "                                      android.support.v7.widget.AppCompatImageView{efb0e1d V.ED..... ........ 36,48-108,120}\n" +
            "                                      com.xflag.store.widget.AppTextView{6a00892 V.ED..... ........ 62,44-86,93 #7f0900c4 app:id/cartNum}\n" +
            "                              android.support.v4.widget.SwipeRefreshLayout{7ac5263 V.ED..... ........ 0,243-1080,2196 #7f090274 app:id/refreshLayout}\n" +
            "                                com.xflag.store.widget.DisableMultiTouchFrameLayout{10b6e60 V.E...... ........ 0,0-1080,1953}\n" +
            "                                  android.support.v7.widget.RecyclerView{bbf6f19 VFED..... ......I. 0,0-1080,1953 #7f090270 app:id/recyclerView}\n" +
            "                                    android.support.constraint.ConstraintLayout{f7c614b VFE...C.. ......I. 48,181-1032,1015}\n" +
            "                                      android.support.v7.widget.AppCompatImageView{f0ce21a V.ED..... ........ 0,0-984,536 #7f090198 app:id/imageView}\n" +
            "                                      com.nex3z.flowlayout.FlowLayout{ab21bde V.E...... ........ 0,566-984,619 #7f090156 app:id/flowLayout}\n" +
            "                                        android.support.v7.widget.AppCompatTextView{e07b1bf V.ED..... ........ 0,0-160,53}\n" +
            "                                        android.support.v7.widget.AppCompatTextView{a29108c V.ED..... ........ 184,0-423,53}\n" +
            "                                        android.support.v7.widget.AppCompatTextView{ecee3d5 V.ED..... ........ 447,0-602,53}\n" +
            "                                      com.xflag.store.widget.AppTextView{34017ea V.ED..... ........ 0,649-984,777 #7f0902fd app:id/textView2}\n" +
            "                                      android.view.View{28faadb V.ED..... ........ 0,831-984,834 #7f0903ce app:id/view37}\n" +
            "                                    android.support.constraint.ConstraintLayout{63fceb3 VFE...C.. ......I. 48,1057-1032,1891}\n" +
            "                                      android.support.v7.widget.AppCompatImageView{fbd8422 V.ED..... ........ 0,0-984,536 #7f090198 app:id/imageView}\n" +
            "                                      com.nex3z.flowlayout.FlowLayout{d9ca978 V.E...... ........ 0,566-984,619 #7f090156 app:id/flowLayout}\n" +
            "                                        android.support.v7.widget.AppCompatTextView{226e851 V.ED..... ........ 0,0-160,53}\n" +
            "                                        android.support.v7.widget.AppCompatTextView{4ffc8b6 V.ED..... ........ 184,0-423,53}\n" +
            "                                        android.support.v7.widget.AppCompatTextView{2d419b7 V.ED..... ........ 447,0-588,53}\n" +
            "                                        android.support.v7.widget.AppCompatTextView{eaee524 V.ED..... ........ 612,0-767,53}\n" +
            "                                      com.xflag.store.widget.AppTextView{820b88d V.ED..... ........ 0,649-984,777 #7f0902fd app:id/textView2}\n" +
            "                                      android.view.View{837ba42 V.ED..... ........ 0,831-984,834 #7f0903ce app:id/view37}\n" +
            "                                    android.support.constraint.ConstraintLayout{9b46dff VFE...C.. ......I. 48,1933-1032,2767}\n" +
            "                                      android.support.v7.widget.AppCompatImageView{e7211e V.ED..... ........ 0,0-984,536 #7f090198 app:id/imageView}\n" +
            "                                      com.nex3z.flowlayout.FlowLayout{b869a53 V.E...... ........ 0,566-984,619 #7f090156 app:id/flowLayout}\n" +
            "                                        android.support.v7.widget.AppCompatTextView{a872f90 V.ED..... ........ 0,0-126,53}\n" +
            "                                      com.xflag.store.widget.AppTextView{56d5089 V.ED..... ........ 0,649-984,777 #7f0902fd app:id/textView2}\n" +
            "                                      android.view.View{10b388e V.ED..... ........ 0,831-984,834 #7f0903ce app:id/view37}\n" +
            "                                  com.bartoszlipinski.recyclerviewheader2.RecyclerViewHeader{8d688af V.E...... ........ 0,0-1080,139 #7f090179 app:id/header}\n" +
            "                                    com.xflag.store.widget.AppViewPager{757b4bc GFED..... ......I. 0,0-0,0 #7f0903d4 app:id/viewPager}\n" +
            "                                    android.widget.LinearLayout{ed16c45 G.E...... ......I. 0,0-0,0 #7f0901b9 app:id/indiactorLinear}\n" +
            "                                    com.xflag.store.widget.AppTextView{864f9a V.ED..... ........ 48,90-258,139}\n" +
            "                                android.support.v4.widget.CircleImageView{8d00cb G.ED..... ......ID 480,-120-600,0}\n" +
            "                              android.widget.Space{a4960a8 I.ED..... ......I. 0,2196-1080,2340}\n" +
            "                        android.widget.FrameLayout{6a187c1 V.E...... ........ 0,2196-1080,2340 #7f090185 app:id/holderLayout}\n" +
            "                          android.support.design.widget.TabLayout{a69cb66 VFED..... ........ 0,0-1080,144 #7f09021a app:id/navigation}\n" +
            "                            android.support.design.widget.TabLayout SlidingTabIndicator{1e8dea7 V.ED..... ........ 0,0-1080,144}\n" +
            "                              android.support.design.widget.TabLayout TabView{27df54 VFE...C.. ..S..A.. 0,0-216,144}\n" +
            "                                android.support.v7.widget.AppCompatImageView{5fddefd G.ED..... ..S..AI. 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AppTextView{bb737f2 G.ED..... ..S..AID 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AnimationTabLayout{73abe43 V.ED..... ..S..A.. 0,9-216,134}\n" +
            "                                  android.support.v7.widget.AppCompatImageView{4cd9cc0 V.ED..... ..S..A.. 72,9-144,81 #1020006 android:id/icon}\n" +
            "                                  com.xflag.store.widget.SelectableTextView{dce6df9 V.ED..... ..S..A.. 0,90-216,125 #1020014 android:id/text1}\n" +
            "                              android.support.design.widget.TabLayout TabView{dfce13e VFE...C.. ........ 216,0-432,144}\n" +
            "                                android.support.v7.widget.AppCompatImageView{540fb9f G.ED..... ......I. 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AppTextView{54fc4ec G.ED..... ......ID 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AnimationTabLayout{b7ef0b5 V.ED..... ........ 0,9-216,134}\n" +
            "                                  android.support.v7.widget.AppCompatImageView{361d34a V.ED..... ........ 72,9-144,81 #1020006 android:id/icon}\n" +
            "                                  com.xflag.store.widget.SelectableTextView{443b2bb V.ED..... ........ 0,90-216,125 #1020014 android:id/text1}\n" +
            "                              android.support.design.widget.TabLayout TabView{8ea43d8 VFE...C.. ........ 432,0-648,144}\n" +
            "                                android.support.v7.widget.AppCompatImageView{d7ae331 G.ED..... ......I. 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AppTextView{771da16 G.ED..... ......ID 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AnimationTabLayout{ef0bf97 V.ED..... ........ 0,9-216,134}\n" +
            "                                  android.support.v7.widget.AppCompatImageView{cabc584 V.ED..... ........ 72,9-144,81 #1020006 android:id/icon}\n" +
            "                                  com.xflag.store.widget.SelectableTextView{369816d V.ED..... ........ 0,90-216,125 #1020014 android:id/text1}\n" +
            "                              android.support.design.widget.TabLayout TabView{a981a2 VFE...C.. ........ 648,0-864,144}\n" +
            "                                android.support.v7.widget.AppCompatImageView{2f7be33 G.ED..... ......I. 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AppTextView{de1b5f0 G.ED..... ......ID 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AnimationTabLayout{629c769 V.ED..... ........ 0,9-216,134}\n" +
            "                                  android.support.v7.widget.AppCompatImageView{ec215ee V.ED..... ........ 72,9-144,81 #1020006 android:id/icon}\n" +
            "                                  com.xflag.store.widget.SelectableTextView{f660a8f V.ED..... ........ 0,90-216,125 #1020014 android:id/text1}\n" +
            "                              android.support.design.widget.TabLayout TabView{f44411c VFE...C.. ........ 864,0-1080,144}\n" +
            "                                android.support.v7.widget.AppCompatImageView{38e7125 G.ED..... ......I. 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AppTextView{1bda2fa G.ED..... ......ID 0,0-0,0}\n" +
            "                                com.xflag.store.widget.AnimationTabLayout{cc2c0ab V.ED..... ........ 0,9-216,134}\n" +
            "                                  android.support.v7.widget.AppCompatImageView{4e25308 V.ED..... ........ 72,9-144,81 #1020006 android:id/icon}\n" +
            "                                  com.xflag.store.widget.SelectableTextView{9d9faa1 V.ED..... ........ 0,90-216,125 #1020014 android:id/text1}\n" +
            "                    android.widget.ScrollView{5b2f4c6 IFED.V... ......ID -888,0-0,2340 #7f090200 app:id/menu}\n" +
            "                      android.support.constraint.ConstraintLayout{aeabc87 V.E...... ......ID 0,0-888,1757 #7f090219 app:id/nav_view}\n" +
            "                        com.xflag.store.widget.CompatibleTextView{2cd97b4 VFED..C.. ......ID 0,0-888,300 #7f0901c0 app:id/item_home}\n" +
            "                        com.xflag.store.widget.CompatibleTextView{efa9fdd VFED..C.. ......ID 0,300-888,486 #7f0901c3 app:id/item_user}\n" +
            "                        com.xflag.store.widget.CompatibleTextView{f599752 GFED..C.. ......ID 0,0-0,0 #7f0901c1 app:id/item_setting}\n" +
            "                        android.widget.LinearLayout{ac9a23 GFE...C.. ......ID 0,0-0,0 #7f0902ec app:id/textView1}\n" +
            "                          com.xflag.store.widget.CompatibleTextView{a867b20 V.ED..... ......ID 0,0-0,0}\n" +
            "                          android.support.v7.widget.AppCompatImageView{f865cd9 V.ED..... ......ID 0,0-0,0}\n" +
            "                        android.support.v7.widget.RecyclerView{555d69e VFE...... ......ID 0,486-888,1044 #7f0902cc app:id/stores}\n" +
            "                          android.widget.FrameLayout{924b57f VFE...C.. ......I. 0,0-888,186}\n" +
            "                            com.xflag.store.widget.CompatibleTextView{328294c V.ED..... ......ID 0,0-888,186 #7f090380 app:id/title}\n" +
            "                            com.xflag.store.widget.AppTextView{176ed95 G.ED..... ......ID 0,0-0,0 #7f09021f app:id/newMarker}\n" +
            "                          android.widget.FrameLayout{244beaa VFE...C.. ......I. 0,186-888,372}\n" +
            "                            com.xflag.store.widget.CompatibleTextView{ad92a9b V.ED..... ......ID 0,0-888,186 #7f090380 app:id/title}\n" +
            "                            com.xflag.store.widget.AppTextView{8548e38 G.ED..... ......ID 0,0-0,0 #7f09021f app:id/newMarker}\n" +
            "                          android.widget.FrameLayout{6a5ce11 VFE...C.. ......I. 0,372-888,558}\n" +
            "                            com.xflag.store.widget.CompatibleTextView{b881b76 V.ED..... ......ID 0,0-888,186 #7f090380 app:id/title}\n" +
            "                            com.xflag.store.widget.AppTextView{495d577 G.ED..... ......ID 0,0-0,0 #7f09021f app:id/newMarker}\n" +
            "                        android.widget.LinearLayout{be055e4 V.E...... ......ID 0,1044-888,1757}\n" +
            "                          android.widget.LinearLayout{b083a4d VFE...C.. ......ID 0,0-888,186 #7f0902d2 app:id/supportGroup}\n" +
            "                            com.xflag.store.widget.CompatibleImageView{8d27902 V.ED..... ......ID 66,66-120,120 #7f09018c app:id/icon}\n" +
            "                            com.xflag.store.widget.CompatibleTextView{c085213 V.ED..... ......ID 165,68-333,117 #7f0902dd app:id/text}\n" +
            "                            com.xflag.store.widget.CompatibleImageView{63eec50 V.ED..... ......ID 363,84-393,102 #7f0902c8 app:id/statusIcon}\n" +
            "                          com.github.aakira.expandablelayout.ExpandableRelativeLayout{aab2e49 V.E...... ......ID 0,186-888,186 #7f090140 app:id/expandableList1}\n" +
            "                            com.xflag.store.widget.AppTextView{873234e VFED..C.. ......ID 0,0-888,0 #7f0902fd app:id/textView2}\n" +
            "                            com.xflag.store.widget.AppTextView{a1bfc6f VFED..C.. ......ID 0,0-888,0}\n" +
            "                          android.widget.LinearLayout{1ae7d7c VFE...C.. ......ID 0,186-888,372 #7f09002f app:id/appInfoGroup}\n" +
            "                            com.xflag.store.widget.CompatibleImageView{b6f6605 V.ED..... ......ID 66,66-120,120 #7f09018c app:id/icon}\n" +
            "                            com.xflag.store.widget.CompatibleTextView{c62265a V.ED..... ......ID 165,68-375,117 #7f0902dd app:id/text}\n" +
            "                            com.xflag.store.widget.CompatibleImageView{115f08b V.ED..... ......ID 405,84-435,102 #7f0902c8 app:id/statusIcon}\n" +
            "                          com.github.aakira.expandablelayout.ExpandableRelativeLayout{c23f568 V.E...... ......ID 0,372-888,372 #7f090141 app:id/expandableList2}\n" +
            "                            com.xflag.store.widget.AppTextView{6855d81 VFED..C.. ......ID 0,0-888,0 #7f090308 app:id/textView3}\n" +
            "                            com.xflag.store.widget.AppTextView{c0c4e26 VFED..C.. ......ID 0,0-888,0 #7f090313 app:id/textView4}\n" +
            "                            com.xflag.store.widget.AppTextView{8710a67 VFED..C.. ......ID 0,0-888,0 #7f09031e app:id/textView5}\n" +
            "                            com.xflag.store.widget.AppTextView{bf70014 VFED..C.. ......ID 0,0-888,0 #7f090329 app:id/textView6}\n" +
            "                            com.xflag.store.widget.AppTextView{da950bd VFED..C.. ......ID 0,0-888,0 #7f09033d app:id/textView8}\n" +
            "                            com.xflag.store.widget.AppTextView{6df26b2 VFED..C.. ......ID 0,0-888,0 #7f090347 app:id/textView9}\n" +
            "                          android.widget.LinearLayout{a79e603 VFE...C.. ......ID 0,372-888,558 #7f090277 app:id/relatedSitesGroup}\n" +
            "                            com.xflag.store.widget.CompatibleImageView{34e0980 V.ED..... ......ID 66,66-120,120 #7f09018c app:id/icon}\n" +
            "                            com.xflag.store.widget.CompatibleTextView{81f3bb9 V.ED..... ......ID 165,68-375,117 #7f0902dd app:id/text}\n" +
            "                            com.xflag.store.widget.CompatibleImageView{394fbfe V.ED..... ......ID 405,84-435,102 #7f0902c8 app:id/statusIcon}\n" +
            "                          com.github.aakira.expandablelayout.ExpandableRelativeLayout{faadf5f V.E...... ......ID 0,558-888,558 #7f090142 app:id/expandableList3}\n" +
            "                            android.widget.LinearLayout{e4a3dac V.E...... ......ID 0,0-888,0}\n" +
            "                              android.widget.LinearLayout{36eda75 VFE...C.. ......ID 0,0-888,186 #7f0901e3 app:id/linearLayout1}\n" +
            "                                com.xflag.store.widget.AppTextView{840da0a V.ED..... ......ID 165,68-303,117}\n" +
            "                                com.xflag.store.widget.CompatibleImageView{3c8127b V.ED..... ......ID 333,78-363,108}\n" +
            "                              android.widget.LinearLayout{7f38898 VFE...C.. ......ID 0,186-888,372 #7f0901e3 app:id/linearLayout1}\n" +
            "                                com.xflag.store.widget.AppTextView{3dfa8f1 V.ED..... ......ID 165,68-513,117}\n" +
            "                                com.xflag.store.widget.CompatibleImageView{71a8cd6 V.ED..... ......ID 543,78-573,108}\n" +
            "                          com.xflag.store.widget.CompatibleTextView{bb5b57 GFED..C.. ......ID 0,0-0,0 #7f090305 app:id/textView27}\n" +
            "                          com.xflag.store.widget.AppTextView{1e49644 V.ED..... ......ID 0,618-888,653 #7f090316 app:id/textView42}\n" +
            "                  android.widget.FrameLayout{b4e32d GFE...C.. ......I. 0,0-0,0}\n" +
            "                    android.widget.ProgressBar{c0aa062 V.ED..... ......ID 0,0-0,0}\n" +
            "    Looper (main, tid 1) {55c07b7}\n" +
            "      Message 0: { when=+261ms what=0 obj=com.google.android.gms.measurement.START target=com.google.android.gms.internal.common.zze }\n" +
            "      (Total messages: 1, polling=false, quitting=false)\n" +
            "    AutofillManager:\n" +
            "      sessionId: 2147483647\n" +
            "      state: UNKNOWN\n" +
            "      context: com.xflag.store.view.activity.B0101MainActivity@201126b\n" +
            "      client: com.xflag.store.view.activity.B0101MainActivity@201126b (android.os.BinderProxy@c1f23ba)\n" +
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
            "      total apks: 1\n" +
            "      resources: 4\n" +
            "      resource impls: 3\n" +
            "    Local FragmentActivity 201126b State:\n" +
            "      mCreated=true mResumed=true mStopped=false    Active Fragments in b3055f3:\n" +
            "      #0: ViewModelHolder{ab6d2b0 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "        mFragmentId=#0 mContainerId=#0 mTag=class com.xflag.store.view.ViewModelHolder\n" +
            "        mState=4 mIndex=0 mWho=android:fragment:0 mBackStackNesting=0\n" +
            "        mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "        mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "        mRetainInstance=true mRetaining=false mUserVisibleHint=true\n" +
            "        mFragmentManager=FragmentManager{b3055f3 in HostCallbacks{8298529}}\n" +
            "        mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "        Child FragmentManager{6f660ae in ViewModelHolder{ab6d2b0}}:\n" +
            "          FragmentManager misc state:\n" +
            "            mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "            mContainer=android.support.v4.app.Fragment2@cf05e4f\n" +
            "            mParent=ViewModelHolder{ab6d2b0 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "            mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "      #1: B0101NavigationFragment{f2e69dc #1 id=0x7f0900f9}\n" +
            "        mFragmentId=#7f0900f9 mContainerId=#7f0900f9 mTag=null\n" +
            "        mState=4 mIndex=1 mWho=android:fragment:1 mBackStackNesting=0\n" +
            "        mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "        mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "        mRetainInstance=false mRetaining=false mUserVisibleHint=true\n" +
            "        mFragmentManager=FragmentManager{b3055f3 in HostCallbacks{8298529}}\n" +
            "        mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "        mContainer=android.widget.FrameLayout{2768b2e V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "        mView=android.widget.FrameLayout{8ae633c V.E...... ........ 0,0-1080,2340}\n" +
            "        mInnerView=android.widget.FrameLayout{8ae633c V.E...... ........ 0,0-1080,2340}\n" +
            "        Child FragmentManager{72c4ae5 in B0101NavigationFragment{f2e69dc}}:\n" +
            "          Active Fragments in 72c4ae5:\n" +
            "            #0: ViewModelHolder{ecbd9ba #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "              mFragmentId=#0 mContainerId=#0 mTag=class com.xflag.store.view.ViewModelHolder\n" +
            "              mState=4 mIndex=0 mWho=android:fragment:1:0 mBackStackNesting=0\n" +
            "              mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "              mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "              mRetainInstance=true mRetaining=false mUserVisibleHint=true\n" +
            "              mFragmentManager=FragmentManager{72c4ae5 in B0101NavigationFragment{f2e69dc}}\n" +
            "              mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "              mParentFragment=B0101NavigationFragment{f2e69dc #1 id=0x7f0900f9}\n" +
            "              Child FragmentManager{8fe906b in ViewModelHolder{ecbd9ba}}:\n" +
            "                FragmentManager misc state:\n" +
            "                  mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "                  mContainer=android.support.v4.app.Fragment2@22647c8\n" +
            "                  mParent=ViewModelHolder{ecbd9ba #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "                  mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "            #1: D0101NewsFragment{dbb061 #1 id=0x7f0900f9}\n" +
            "              mFragmentId=#7f0900f9 mContainerId=#7f0900f9 mTag=null\n" +
            "              mState=4 mIndex=1 mWho=android:fragment:1:1 mBackStackNesting=0\n" +
            "              mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "              mHidden=false mDetached=false mMenuVisible=true mHasMenu=true\n" +
            "              mRetainInstance=false mRetaining=false mUserVisibleHint=true\n" +
            "              mFragmentManager=FragmentManager{72c4ae5 in B0101NavigationFragment{f2e69dc}}\n" +
            "              mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "              mParentFragment=B0101NavigationFragment{f2e69dc #1 id=0x7f0900f9}\n" +
            "              mContainer=android.widget.FrameLayout{e7576cf V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "              mView=android.widget.FrameLayout{e4b8c5 V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "              mInnerView=android.widget.FrameLayout{e4b8c5 V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "              Child FragmentManager{94dd786 in D0101NewsFragment{dbb061}}:\n" +
            "                Active Fragments in 94dd786:\n" +
            "                  #0: ViewModelHolder{573c847 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "                    mFragmentId=#0 mContainerId=#0 mTag=class com.xflag.store.view.ViewModelHolder\n" +
            "                    mState=4 mIndex=0 mWho=android:fragment:1:1:0 mBackStackNesting=0\n" +
            "                    mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "                    mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "                    mRetainInstance=true mRetaining=false mUserVisibleHint=true\n" +
            "                    mFragmentManager=FragmentManager{94dd786 in D0101NewsFragment{dbb061}}\n" +
            "                    mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "                    mParentFragment=D0101NewsFragment{dbb061 #1 id=0x7f0900f9}\n" +
            "                    Child FragmentManager{73c1874 in ViewModelHolder{573c847}}:\n" +
            "                      FragmentManager misc state:\n" +
            "                        mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "                        mContainer=android.support.v4.app.Fragment2@1c1f19d\n" +
            "                        mParent=ViewModelHolder{573c847 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "                        mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "                Added Fragments:\n" +
            "                  #0: ViewModelHolder{573c847 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "                FragmentManager misc state:\n" +
            "                  mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "                  mContainer=android.support.v4.app.Fragment2@39fe612\n" +
            "                  mParent=D0101NewsFragment{dbb061 #1 id=0x7f0900f9}\n" +
            "                  mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "          Added Fragments:\n" +
            "            #0: ViewModelHolder{ecbd9ba #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "            #1: D0101NewsFragment{dbb061 #1 id=0x7f0900f9}\n" +
            "          Fragments Created Menus:\n" +
            "            #0: D0101NewsFragment{dbb061 #1 id=0x7f0900f9}\n" +
            "          FragmentManager misc state:\n" +
            "            mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "            mContainer=android.support.v4.app.Fragment2@71aa1e3\n" +
            "            mParent=B0101NavigationFragment{f2e69dc #1 id=0x7f0900f9}\n" +
            "            mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "    Added Fragments:\n" +
            "      #0: ViewModelHolder{ab6d2b0 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "      #1: B0101NavigationFragment{f2e69dc #1 id=0x7f0900f9}\n" +
            "    Fragments Created Menus:\n" +
            "      #0: B0101NavigationFragment{f2e69dc #1 id=0x7f0900f9}\n" +
            "    FragmentManager misc state:\n" +
            "      mHost=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "      mContainer=android.support.v4.app.FragmentActivity HostCallbacks@8298529\n" +
            "      mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n"

    val logs = message.reader().readLines()
    val list = ArrayList<String>()
    var hasFragments = false
    for (s in logs) {
        if (hasFragments) {
            if (s.contains(Regex("#[0-9]:"))) list.add(s)
        } else {
            hasFragments = s.contains(Regex("Local FragmentActivity.*State:"))
        }
    }

    var lastLevel = -1
    val fragmentInfos = ArrayList<FragmentLogInfo>()

    for (i in 0..list.lastIndex) {
        val str = list[i]
        val level = getLeftSpaceNum(str)

        val parentPosition = when {
            level > lastLevel -> i - 1
            level < lastLevel -> {
                var position = -1
                for (info in fragmentInfos) {
                    if (info.level == level) {
                        position = info.parentPosition
                    }
                }
                position
            }
            else -> fragmentInfos[i - 1].parentPosition
        }
        fragmentInfos.add(FragmentLogInfo(i, parentPosition, level, str))
        lastLevel = level
    }


}


data class FragmentLogInfo(
        val currentPosition: Int,
        // -1 则代表自身为根节点
        val parentPosition: Int,
        val level: Int,
        val name: String
)

private fun getLeftSpaceNum(string: String): Int {
    var spaceNum = 0
    val len = string.length
    for (i in 0..len) {
        if (string[i] == ' ') spaceNum++ else break
    }
    return spaceNum
}


