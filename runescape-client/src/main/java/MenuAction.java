import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bh")
@Implements("MenuAction")
public class MenuAction {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 683087729)
    @Export("param0")
    int param0;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1027855045)
    @Export("param1")
    int param1;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 791610257)
    @Export("opcode")
    int opcode;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1555115433)
    @Export("identifier")
    int identifier;

    @ObfuscatedName("r")
    @Export("action")
    String action;

    MenuAction() {
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lkq;IIIZB)V", garbageValue = "-93")
    public static void method1894(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
        class265.musicPlayerStatus = 1;
        class265.musicTrackArchive = var0;
        class265.musicTrackGroupId = var1;
        class140.musicTrackFileId = var2;
        class167.musicTrackVolume = var3;
        MusicPatch.musicTrackBoolean = var4;
        GrandExchangeOfferNameComparator.pcmSampleLength = 10000;
    }

    @ObfuscatedName("lv")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1125693830")
    static void method1895() {
        class424.clientPreferences.field1231 = Client.field699;
        GameEngine.savePreferences();
    }
}