import com.intellij.util.containers.toMutableSmartList
import com.intellij.util.io.encodeUrlQueryParameter

fun main() {
    var message = "      #0: ViewModelHolder{b16a4f5 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "mFragmentId=#0 mContainerId=#0 mTag=class com.xflag.store.view.ViewModelHolder\n" +
            "        mState=4 mIndex=0 mWho=android:fragment:0 mBackStackNesting=0\n" +
            "        mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "        mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "        mRetainInstance=true mRetaining=false mUserVisibleHint=true\n" +
            "        mFragmentManager=FragmentManager{e0a22c in HostCallbacks{965128a}}\n" +
            "        mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "        Child FragmentManager{c6b20fb in ViewModelHolder{b16a4f5}}:\n" +
            "          FragmentManager misc state:\n" +
            "            mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "            mContainer=android.support.v4.app.Fragment\$2@acbb518\n" +
            "            mParent=ViewModelHolder{b16a4f5 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "            mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "      #1: B0101NavigationFragment{2799b71 #1 id=0x7f0900f9}\n" +
            "        mFragmentId=#7f0900f9 mContainerId=#7f0900f9 mTag=null\n" +
            "        mState=4 mIndex=1 mWho=android:fragment:1 mBackStackNesting=0\n" +
            "        mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "        mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "        mRetainInstance=false mRetaining=false mUserVisibleHint=true\n" +
            "        mFragmentManager=FragmentManager{e0a22c in HostCallbacks{965128a}}\n" +
            "        mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "        mContainer=android.widget.FrameLayout{21795b0 V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "        mView=android.widget.FrameLayout{614ddc3 V.E...... ........ 0,0-1080,2340}\n" +
            "        mInnerView=android.widget.FrameLayout{614ddc3 V.E...... ........ 0,0-1080,2340}\n" +
            "        Child FragmentManager{589cd56 in B0101NavigationFragment{2799b71}}:\n" +
            "          Active Fragments in 589cd56:\n" +
            "            #0: ViewModelHolder{ec0d1d7 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "              mFragmentId=#0 mContainerId=#0 mTag=class com.xflag.store.view.ViewModelHolder\n" +
            "              mState=4 mIndex=0 mWho=android:fragment:1:0 mBackStackNesting=0\n" +
            "              mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "              mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "              mRetainInstance=true mRetaining=false mUserVisibleHint=true\n" +
            "              mFragmentManager=FragmentManager{589cd56 in B0101NavigationFragment{2799b71}}\n" +
            "              mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "              mParentFragment=B0101NavigationFragment{2799b71 #1 id=0x7f0900f9}\n" +
            "              Child FragmentManager{b530ac4 in ViewModelHolder{ec0d1d7}}:\n" +
            "                FragmentManager misc state:\n" +
            "                  mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "                  mContainer=android.support.v4.app.Fragment\$2@73b7dad\n" +
            "                  mParent=ViewModelHolder{ec0d1d7 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "                  mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "            #1: D0101NewsFragment{56d68e2 #1 id=0x7f0900f9}\n" +
            "              mFragmentId=#7f0900f9 mContainerId=#7f0900f9 mTag=null\n" +
            "              mState=4 mIndex=1 mWho=android:fragment:1:1 mBackStackNesting=0\n" +
            "              mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "              mHidden=false mDetached=false mMenuVisible=true mHasMenu=true\n" +
            "              mRetainInstance=false mRetaining=false mUserVisibleHint=true\n" +
            "              mFragmentManager=FragmentManager{589cd56 in B0101NavigationFragment{2799b71}}\n" +
            "              mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "              mParentFragment=B0101NavigationFragment{2799b71 #1 id=0x7f0900f9}\n" +
            "              mContainer=android.widget.FrameLayout{9c68c29 V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "              mView=android.widget.FrameLayout{a460640 V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "              mInnerView=android.widget.FrameLayout{a460640 V.E...... ........ 0,0-1080,2340 #7f0900f9 app:id/content}\n" +
            "              Child FragmentManager{656b473 in D0101NewsFragment{56d68e2}}:\n" +
            "                Active Fragments in 656b473:\n" +
            "                  #0: ViewModelHolder{1d80f30 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "                    mFragmentId=#0 mContainerId=#0 mTag=class com.xflag.store.view.ViewModelHolder\n" +
            "                    mState=4 mIndex=0 mWho=android:fragment:1:1:0 mBackStackNesting=0\n" +
            "                    mAdded=true mRemoving=false mFromLayout=false mInLayout=false\n" +
            "                    mHidden=false mDetached=false mMenuVisible=true mHasMenu=false\n" +
            "                    mRetainInstance=true mRetaining=false mUserVisibleHint=true\n" +
            "                    mFragmentManager=FragmentManager{656b473 in D0101NewsFragment{56d68e2}}\n" +
            "                    mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "                    mParentFragment=D0101NewsFragment{56d68e2 #1 id=0x7f0900f9}\n" +
            "                    Child FragmentManager{cbf47a9 in ViewModelHolder{1d80f30}}:\n" +
            "                      FragmentManager misc state:\n" +
            "                        mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "                        mContainer=android.support.v4.app.Fragment\$2@afd312e\n" +
            "                        mParent=ViewModelHolder{1d80f30 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "                        mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "                Added Fragments:\n" +
            "                  #0: ViewModelHolder{1d80f30 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "                FragmentManager misc state:\n" +
            "                  mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "                  mContainer=android.support.v4.app.Fragment\$2@a5e24cf\n" +
            "                  mParent=D0101NewsFragment{56d68e2 #1 id=0x7f0900f9}\n" +
            "                  mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "          Added Fragments:\n" +
            "            #0: ViewModelHolder{ec0d1d7 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "            #1: D0101NewsFragment{56d68e2 #1 id=0x7f0900f9}\n" +
            "          Fragments Created Menus:\n" +
            "            #0: D0101NewsFragment{56d68e2 #1 id=0x7f0900f9}\n" +
            "          FragmentManager misc state:\n" +
            "            mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "            mContainer=android.support.v4.app.Fragment\$2@66ee5c\n" +
            "            mParent=B0101NavigationFragment{2799b71 #1 id=0x7f0900f9}\n" +
            "            mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n" +
            "    Added Fragments:\n" +
            "      #0: ViewModelHolder{b16a4f5 #0 class com.xflag.store.view.ViewModelHolder}\n" +
            "      #1: B0101NavigationFragment{2799b71 #1 id=0x7f0900f9}\n" +
            "    Fragments Created Menus:\n" +
            "      #0: B0101NavigationFragment{2799b71 #1 id=0x7f0900f9}\n" +
            "    FragmentManager misc state:\n" +
            "      mHost=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "      mContainer=android.support.v4.app.FragmentActivityHostCallbacks@965128a\n" +
            "      mCurState=4 mStateSaved=false mStopped=false mDestroyed=false\n"


    //解析第一层

    var start = message.lastIndexOf("Added Fragments:")
    var end = message.lastIndexOf("FragmentManager misc state:")
    if (start == -1 || end == -1 || start >= end) return
    val firstLayerLog = message.substring(start, end)
    val firstLayerFragments = getAddedFragmentLogs(firstLayerLog)

    var remainingLog = message.substring(0, start)
    val len = firstLayerFragments.size - 1
    for (i in 0..len) {
        start = remainingLog.indexOf(firstLayerFragments[i])
        end = if (i == len) remainingLog.lastIndex else remainingLog.indexOf(firstLayerFragments[i + 1])
        if (start == -1 || end == -1 || start >= end) return
        val fragmentName = firstLayerFragments[i]
        val fragmentLog = remainingLog.substring(start, end)
        FragmentData(fragmentName, fragmentLog)
        remainingLog = remainingLog.substring(end, remainingLog.lastIndex)
    }
}

private fun parsingLog(log: String): FragmentData {
    var start = log.lastIndexOf("Added Fragments:")
    var end = log.lastIndexOf("FragmentManager misc state:")
    if (start == -1 || end == -1 || start >= end) return
    val firstLayerLog = log.substring(start, end)
    val firstLayerFragments = getAddedFragmentLogs(firstLayerLog)

    val childs = ArrayList<FragmentData>()
    var remainingLog = log.substring(0, start)
    val len = firstLayerFragments.size - 1
    for (i in 0..len) {
        start = remainingLog.indexOf(firstLayerFragments[i])
        end = if (i == len) remainingLog.lastIndex else remainingLog.indexOf(firstLayerFragments[i + 1])
        if (start == -1 || end == -1 || start >= end) break

        val fragmentData = FragmentData().apply {
            fragmentLog = remainingLog.substring(start, end)
            fragmentName = firstLayerFragments[i]
        }

        childs.add(fragmentData)
        remainingLog = remainingLog.substring(end, remainingLog.lastIndex)
    }
}

private fun getAddedFragmentLogs(log: String): List<String> {
    val map = HashMap<String, String>()
    Regex("#[0-9]:.*")
            .findAll(log)
            .toList()
            .flatMap { matchResult: MatchResult -> matchResult.groupValues }
            .map {
                val array = it.split(": ")
                Pair(array.first(), it)
            }
            .forEach {
                val key = it.first
                if (!map.containsKey(key)) {
                    map[key] = it.second
                }
            }
    return map.values.toList()
}

class FragmentData {
    var fragmentLog: String? = null
    var fragmentName: String? = null
    var childFragments: List<FragmentData>? = null
}

