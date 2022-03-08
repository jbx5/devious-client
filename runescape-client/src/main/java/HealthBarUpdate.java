import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cd")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
    @ObfuscatedName("w")
    @Export("SpriteBuffer_spritePalette")
    public static int[] SpriteBuffer_spritePalette;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 474414413)
    @Export("ItemDefinition_fileCount")
    public static int ItemDefinition_fileCount;

    @ObfuscatedName("dy")
    static boolean field1178;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -816446717)
    @Export("cycle")
    int cycle;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 499681629)
    @Export("health")
    int health;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1965761205)
    @Export("health2")
    int health2;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 2010428701)
    @Export("cycleOffset")
    int cycleOffset;

    HealthBarUpdate(int var1, int var2, int var3, int var4) {
        this.cycle = var1;
        this.health = var2;
        this.health2 = var3;
        this.cycleOffset = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "57")
    @Export("set")
    void set(int var1, int var2, int var3, int var4) {
        this.cycle = var1;
        this.health = var2;
        this.health2 = var3;
        this.cycleOffset = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Lfl;", garbageValue = "-224224957")
    @Export("getParamDefinition")
    public static ParamComposition getParamDefinition(int var0) {
        ParamComposition var1 = ((ParamComposition) (ParamComposition.ParamDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
            var1 = new ParamComposition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            var1.postDecode();
            ParamComposition.ParamDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;ZIB)V", garbageValue = "8")
    static void method2182(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
        if (Login.clearLoginScreen) {
            if (var3 == 4) {
                Player.method2159(4);
            }
        } else {
            if (var3 == 0) {
                Tiles.method2027(var2);
            } else {
                Player.method2159(var3);
            }
            Rasterizer2D.Rasterizer2D_clear();
            byte[] var4 = var0.takeFileByNames("title.jpg", "");
            class260.leftTitleSprite = class125.method2743(var4);
            FriendSystem.rightTitleSprite = class260.leftTitleSprite.mirrorHorizontally();
            class131.method2787(var1, Client.worldProperties);
            Login.titleboxSprite = class91.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
            class259.titlebuttonSprite = class91.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
            Login.field894 = class91.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
            class138.field1613 = class91.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
            class91.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
            Login.runesSprite = Huffman.method5278(var1, "runes", "");
            class371.title_muteSprite = Huffman.method5278(var1, "title_mute", "");
            Script.options_buttons_0Sprite = class91.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
            class143.field1638 = class91.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
            class1.options_buttons_2Sprite = class91.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
            Bounds.field4220 = class91.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
            FriendSystem.field812 = Script.options_buttons_0Sprite.subWidth;
            class133.field1560 = Script.options_buttons_0Sprite.subHeight;
            Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
            if (var2) {
                Login.Login_username = "";
                Login.Login_password = "";
            }
            GameObject.field2588 = 0;
            class145.otp = "";
            Login.field893 = true;
            Login.worldSelectOpen = false;
            if (!class424.clientPreferences.titleMusicDisabled) {
                Archive var5 = WorldMapLabelSize.archive6;
                int var6 = var5.getGroupId("scape main");
                int var7 = var5.getFileId(var6, "");
                class259.method4997(2, var5, var6, var7, 255, false);
            } else {
                class259.method4998(2);
            }
            UserComparator4.method2434(false);
            Login.clearLoginScreen = true;
            Login.xPadding = (DirectByteArrayCopier.canvasWidth - 765) / 2;
            Login.loginBoxX = Login.xPadding + 202;
            class4.loginBoxCenter = Login.loginBoxX + 180;
            class260.leftTitleSprite.drawAt(Login.xPadding, 0);
            FriendSystem.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
            class28.logoSprite.drawAt((Login.xPadding + 382) - (class28.logoSprite.subWidth / 2), 18);
        }
    }
}