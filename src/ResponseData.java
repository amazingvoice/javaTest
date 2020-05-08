import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResponseData {

    @SerializedName("videoConfigList")
    private TestBean mVideoConfigList;
    public TestBean getVideoConfigList() {
        return mVideoConfigList;
    }

    static class TestBean {
        public String getMinAppVersion() {
            return mMinAppVersion;
        }

        @SerializedName("minAppVersion")
        private String mMinAppVersion;

        public String getConfigVersion() {
            return mConfigVersion;
        }

        @SerializedName("configVersion")
        private String mConfigVersion;

        public String getMTKDefault() {
            return mMTKDefault;
        }

        @SerializedName("MTKDefault")
        private String mMTKDefault;

        public String getQCOMDefault() {
            return mQCOMDefault;
        }

        @SerializedName("QCOMDefault")
        private String mQCOMDefault;

        public ArrayList<String> getCustomizedList() {
            return mCustomizedList;
        }

        @SerializedName("Customized")
        private ArrayList<String> mCustomizedList;
    }

}
