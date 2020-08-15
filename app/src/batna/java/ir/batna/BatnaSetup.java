package ir.batna;

import org.linphone.core.Core;
import org.linphone.core.MediaEncryption;
import org.linphone.core.ProxyConfig;
import org.linphone.settings.LinphonePreferences;

public class BatnaSetup {

    // This piece of code helps avoid prepending country code to outgoing number(call)
    public static void removeCountryCode(Core core) {
        ProxyConfig mProxyConfig = null;
        ProxyConfig[] proxyConfigs = core.getProxyConfigList();
        for (int i = 0; i < proxyConfigs.length; i++) {
            if (proxyConfigs[i] != null) {
                mProxyConfig = proxyConfigs[i];
            }
        }
        mProxyConfig.edit();
        mProxyConfig.setDialPrefix("");
        mProxyConfig.done();
    }

    // Configures ZRTP and media encryption by default
    public static void configureEncryption() {
        LinphonePreferences linphonePreferences = LinphonePreferences.instance();
        MediaEncryption encryption = MediaEncryption.fromInt(2);
        linphonePreferences.setMediaEncryption(encryption);
        linphonePreferences.setMediaEncryptionMandatory(false);
    }
}
