import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kf")
@Implements("GameBuild")
public class GameBuild {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkf;")
    @Export("LIVE")
    public static final GameBuild LIVE;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkf;")
    @Export("BUILDLIVE")
    public static final GameBuild BUILDLIVE;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lkf;")
    @Export("RC")
    public static final GameBuild RC;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lkf;")
    @Export("WIP")
    public static final GameBuild WIP;

    @ObfuscatedName("r")
    @Export("name")
    public final String name;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 1842686617)
    @Export("buildId")
    public final int buildId;

    static {
        LIVE = new GameBuild("LIVE", 0);
        BUILDLIVE = new GameBuild("BUILDLIVE", 3);
        RC = new GameBuild("RC", 1);
        WIP = new GameBuild("WIP", 2);
    }

    GameBuild(String var1, int var2) {
        this.name = var1;
        this.buildId = var2;
    }

    @ObfuscatedName("kg")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "2700")
    static final void method5483() {
        for (int var0 = 0; var0 < Players.Players_count; ++var0) {
            Player var1 = Client.players[Players.Players_indices[var0]];
            var1.clearIsFriend();
        }
        ClanSettings.method2903();
        if (class67.friendsChat != null) {
            class67.friendsChat.clearFriends();
        }
    }
}