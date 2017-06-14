package com.google.android.gms.internal;

import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.common.internal.zzac;

public final class zzats {
    public static zza<Boolean> zzbrM;
    public static zza<Boolean> zzbrN;
    public static zza<Boolean> zzbrO;
    public static zza<Boolean> zzbrP;
    public static zza<Boolean> zzbrQ;
    public static zza<Boolean> zzbrR;
    public static zza<String> zzbrS;
    public static zza<Long> zzbrT;
    public static zza<Long> zzbrU;
    public static zza<Long> zzbrV;
    public static zza<String> zzbrW;
    public static zza<String> zzbrX;
    public static zza<Integer> zzbrY;
    public static zza<Integer> zzbrZ;
    public static zza<Integer> zzbsa;
    public static zza<Integer> zzbsb;
    public static zza<Integer> zzbsc;
    public static zza<Integer> zzbsd;
    public static zza<Integer> zzbse;
    public static zza<Integer> zzbsf;
    public static zza<Integer> zzbsg;
    public static zza<Integer> zzbsh;
    public static zza<String> zzbsi;
    public static zza<Long> zzbsj;
    public static zza<Long> zzbsk;
    public static zza<Long> zzbsl;
    public static zza<Long> zzbsm;
    public static zza<Long> zzbsn;
    public static zza<Long> zzbso;
    public static zza<Long> zzbsp;
    public static zza<Long> zzbsq;
    public static zza<Long> zzbsr;
    public static zza<Long> zzbss;
    public static zza<Long> zzbst;
    public static zza<Integer> zzbsu;
    public static zza<Long> zzbsv;
    public static zza<Integer> zzbsw;
    public static zza<Integer> zzbsx;
    public static zza<Long> zzbsy;

    public static final class zza<V> {
        private final String zzAX;
        private final V zzaga;
        private final zzaca<V> zzagb;

        private zza(String str, zzaca<V> com_google_android_gms_internal_zzaca_V, V v) {
            zzac.zzw(com_google_android_gms_internal_zzaca_V);
            this.zzagb = com_google_android_gms_internal_zzaca_V;
            this.zzaga = v;
            this.zzAX = str;
        }

        static zza<Integer> zzB(String str, int i) {
            return zzo(str, i, i);
        }

        static zza<String> zzY(String str, String str2) {
            return zzm(str, str2, str2);
        }

        static zza<Long> zzb(String str, long j, long j2) {
            return new zza(str, zzaca.zza(str, Long.valueOf(j2)), Long.valueOf(j));
        }

        static zza<Boolean> zzb(String str, boolean z, boolean z2) {
            return new zza(str, zzaca.zzj(str, z2), Boolean.valueOf(z));
        }

        static zza<Long> zzj(String str, long j) {
            return zzb(str, j, j);
        }

        static zza<Boolean> zzl(String str, boolean z) {
            return zzb(str, z, z);
        }

        static zza<String> zzm(String str, String str2, String str3) {
            return new zza(str, zzaca.zzB(str, str3), str2);
        }

        static zza<Integer> zzo(String str, int i, int i2) {
            return new zza(str, zzaca.zza(str, Integer.valueOf(i2)), Integer.valueOf(i));
        }

        public V get() {
            return this.zzaga;
        }

        public V get(V v) {
            return v != null ? v : this.zzaga;
        }

        public String getKey() {
            return this.zzAX;
        }
    }

    static {
        zzbrM = zza.zzl("measurement.service_enabled", true);
        zzbrN = zza.zzl("measurement.service_client_enabled", true);
        zzbrO = zza.zzl("measurement.log_third_party_store_events_enabled", false);
        zzbrP = zza.zzl("measurement.log_installs_enabled", false);
        zzbrQ = zza.zzl("measurement.log_upgrades_enabled", false);
        zzbrR = zza.zzl("measurement.log_androidId_enabled", false);
        zzbrS = zza.zzm("measurement.log_tag", "FA", "FA-SVC");
        zzbrT = zza.zzj("measurement.ad_id_cache_time", 10000);
        zzbrU = zza.zzj("measurement.monitoring.sample_period_millis", 86400000);
        zzbrV = zza.zzb("measurement.config.cache_time", 86400000, 3600000);
        zzbrW = zza.zzY("measurement.config.url_scheme", "https");
        zzbrX = zza.zzY("measurement.config.url_authority", "app-measurement.com");
        zzbrY = zza.zzB("measurement.upload.max_bundles", 100);
        zzbrZ = zza.zzB("measurement.upload.max_batch_size", AccessibilityNodeInfoCompat.ACTION_CUT);
        zzbsa = zza.zzB("measurement.upload.max_bundle_size", AccessibilityNodeInfoCompat.ACTION_CUT);
        zzbsb = zza.zzB("measurement.upload.max_events_per_bundle", PointerIconCompat.TYPE_DEFAULT);
        zzbsc = zza.zzB("measurement.upload.max_events_per_day", 100000);
        zzbsd = zza.zzB("measurement.upload.max_error_events_per_day", PointerIconCompat.TYPE_DEFAULT);
        zzbse = zza.zzB("measurement.upload.max_public_events_per_day", 50000);
        zzbsf = zza.zzB("measurement.upload.max_conversions_per_day", 500);
        zzbsg = zza.zzB("measurement.upload.max_realtime_events_per_day", 10);
        zzbsh = zza.zzB("measurement.store.max_stored_events_per_app", 100000);
        zzbsi = zza.zzY("measurement.upload.url", "https://app-measurement.com/a");
        zzbsj = zza.zzj("measurement.upload.backoff_period", 43200000);
        zzbsk = zza.zzj("measurement.upload.window_interval", 3600000);
        zzbsl = zza.zzj("measurement.upload.interval", 3600000);
        zzbsm = zza.zzj("measurement.upload.realtime_upload_interval", 10000);
        zzbsn = zza.zzj("measurement.upload.debug_upload_interval", 1000);
        zzbso = zza.zzj("measurement.upload.minimum_delay", 500);
        zzbsp = zza.zzj("measurement.alarm_manager.minimum_interval", 60000);
        zzbsq = zza.zzj("measurement.upload.stale_data_deletion_interval", 86400000);
        zzbsr = zza.zzj("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        zzbss = zza.zzj("measurement.upload.initial_upload_delay_time", 15000);
        zzbst = zza.zzj("measurement.upload.retry_time", 1800000);
        zzbsu = zza.zzB("measurement.upload.retry_count", 6);
        zzbsv = zza.zzj("measurement.upload.max_queue_time", 2419200000L);
        zzbsw = zza.zzB("measurement.lifetimevalue.max_currency_tracked", 4);
        zzbsx = zza.zzB("measurement.audience.filter_result_max_count", 200);
        zzbsy = zza.zzj("measurement.service_client.idle_disconnect_millis", 5000);
    }
}
