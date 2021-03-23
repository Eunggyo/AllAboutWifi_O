package com.example.allaboutwifi_o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private WifiManager mWifiManager = null;
    private Context mContext = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mWifiManager = (WifiManager) mContext.getSystemService(Context.WIFI_SERVICE);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    private WifiConfiguration setWifiConfiguration() {
        WifiConfiguration wificonf = new WifiConfiguration();
        wificonf.SSID = Config.SSID;
        wificonf.status = WifiConfiguration.Status.DISABLED;
        /*

             wificonf.status 네트워크 구성의 가능한 상태입니다.

            WifiConfiguration.Status.DISABLED
            지원자는 이 네트워크를 사용하려고 시도하지 않습니다.

             WifiConfiguration.Status.CURRENT
            이것이 우리가 현재 연결되어 있는 네트워크입니다.

            WifiConfiguration.Status.ENABLED
            지원자는 이 네트워크를 연결에 사용할 수 있는 것으로 간주합니다.

         */

        wificonf.allowedAuthAlgorithms.clear();
        /*
            config에서 ㅅ사용할 인증 프로토콜 집함.
            기본 값은 자동선택

            WifiConfiguration.AuthAlgorithm
            int LEAP  LEAP/Network EAP (only used with LEAP)
            int OPEN  Open System authentication (required for WPA/WPA2)
            int SAE SAE (Used only for WPA3-Personal)
            int SHARED   API 수준 28에서 더 이상 사용되지 않습니다. 보안 및 성능 제한으로 인해 WEP 네트워크 사용이 중단된다.
            String varName
         */
        wificonf.allowedProtocols.clear();
        wificonf.allowedAuthAlgorithms.clear();
        wificonf.allowedPairwiseCiphers.clear();
        wificonf.allowedGroupCiphers.clear();



    }



}