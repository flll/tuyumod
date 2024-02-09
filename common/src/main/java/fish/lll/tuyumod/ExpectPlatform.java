package fish.lll.tuyumod;

import dev.architectury.platform.Platform;

import java.nio.file.Path;

public class ExpectPlatform {
    /**
     * {@link Platform#getConfigFolder()}を使用することもできますが、これは{@link ExpectPlatform}の例です。
     * <p>
     * これは<b>public static</b>メソッドでなければなりません。プラットフォームに実装された解決策は、
     * プラットフォームのサブパッケージの下に配置され、そのクラス名は{@code Impl}で終わる必要があります。
     * <p>
     * 例:
     * 期待: fish.lll.tuyumod.ExpectPlatform#getConfigDirectory()
     * 実際のFabric: fish.lll.tuyumod.fabric.ExpectPlatformImpl#getConfigDirectory()
     * 実際のForge: fish.lll.tuyumod.forge.ExpectPlatformImpl#getConfigDirectory()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">@ExpectPlatformを支援するためにIntelliJプラグインも入手してください。</a>
     */
//    public static Path getConfigDirectory() {
//        // 単にエラーを投げます。内容は実行時に置き換えられるべきです。
//        throw new AssertionError();
//    }
}
