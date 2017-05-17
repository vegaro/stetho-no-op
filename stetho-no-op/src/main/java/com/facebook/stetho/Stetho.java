package com.facebook.stetho;

import android.content.Context;

public class Stetho {
    public static InitializerBuilder newInitializerBuilder(Context context) {
        return null;
    }

    public static void initialize(Initializer initializer) {

    }

    public static DumperPluginsProvider defaultDumperPluginsProvider(Context context) {
        return null;
    }

    public static InspectorModulesProvider defaultInspectorModulesProvider(Context context) {
        return null;
    }

    public static abstract class Initializer {

    }

    public static class InitializerBuilder {
        private InitializerBuilder(Context context) {
        }

        public InitializerBuilder enableDumpapp(DumperPluginsProvider plugins) {
            return this;
        }

        public InitializerBuilder enableWebKitInspector(InspectorModulesProvider modules) {
            return this;
        }

        public Initializer build() {
            return null;
        }
    }

}
