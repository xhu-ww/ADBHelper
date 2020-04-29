import java.util.regex.Matcher
import java.util.regex.Pattern


fun main() {
    val input = "  No ContentCaptureManager\n" +
            "    ResourcesManager:\n" +
            "      cached apks: 0 [cache disabled]\n" +
            "      total apks: 2\n" +
            "      resources: 6\n" +
            "      resource impls: 4\n" +
            "\n" +
            "TASK com.xflag.store.staging.debug id=25348 userId=0\n" +
            "  ACTIVITY com.xflag.store.staging.debug/com.xflag.store.view.activity.B0101MainActivity 127e841 pid=31243\n" +
            "    Local Activity d0cb391 State:\n" +
            "      mResumed=true mStopped=false mFinished=false\n" +
            "      mChangingConfigurations=false\n" +
            "      mCurrentConfig={1.0 460mcc1mnc [zh_CN_#Han  No ContentCaptureManager\n" +
            "    ResourcesManager:\n" +
            "      cached apks: 0 [cache disabled]\n" +
            "      total apks: 2\n" +
            "      resources: 6\n" +
            "      resource impls: 4\n" +
            "\n" +
            "TASK com.xflag.store.staging.debug id=25348 userId=0\n" +
            "  ACTIVITY com.xflag.store.staging.debug/com.xflag.store.view.activity.B0101MainActivity 127e841 pid=31243\n" +
            "    Local Activity d0cb391 State:\n" +
            "      mResumed=true mStopped=false mFinished=false\n" +
            "      mChangingConfigurations=false\n" +
            "      mCurrentConfig={1.0 460mcc1mnc [zh_CN_#Han  No ContentCaptureManager\n" +
            "    ResourcesManager:\n" +
            "      cached apks: 0 [cache disabled]\n" +
            "      total apks: 2\n" +
            "      resources: 6\n" +
            "      resource impls: 4\n" +
            "\n" +
            "TASK com.xflag.store.staging.debug id=25348 userId=0\n" +
            "  ACTIVITY com.xflag.store.staging.debug/com.xflag.store.view.activity.B0101MainActivity 127e841 pid=31243\n" +
            "    Local Activity d0cb391 State:\n" +
            "      mResumed=true mStopped=false mFinished=false\n" +
            "      mChangingConfigurations=false\n" +
            "      mCurrentConfig={1.0 460mcc1mnc [zh_CN_#Han"

    val strs = input.split("\n\nTASK")
    for (s in strs) {
        print(s)
        print("-----------------------------")
    }
}
