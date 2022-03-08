import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bd")
@Implements("Message")
public class Message extends DualNode {
    @ObfuscatedName("sv")
    @ObfuscatedGetter(intValue = 1210639323)
    static int field478;

    @ObfuscatedName("ej")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive8")
    static Archive archive8;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 22593719)
    @Export("count")
    int count;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1858764081)
    @Export("cycle")
    int cycle;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1974054315)
    @Export("type")
    int type;

    @ObfuscatedName("e")
    @Export("sender")
    String sender;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lpb;")
    @Export("senderUsername")
    Username senderUsername;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lmc;")
    @Export("isFromFriend0")
    TriBool isFromFriend0;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lmc;")
    @Export("isFromIgnored0")
    TriBool isFromIgnored0;

    @ObfuscatedName("w")
    @Export("prefix")
    String prefix;

    @ObfuscatedName("v")
    @Export("text")
    String text;

    Message(int var1, String var2, String var3, String var4) {
        this.isFromFriend0 = TriBool.TriBool_unknown;
        this.isFromIgnored0 = TriBool.TriBool_unknown;
        this.set(var1, var2, var3, var4);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = "-1055264133")
    @Export("set")
    void set(int var1, String var2, String var3, String var4) {
        int var5 = (++Messages.Messages_count) - 1;
        this.count = var5;
        this.cycle = Client.cycle;
        this.type = var1;
        this.sender = var2;
        this.fillSenderUsername();
        this.prefix = var3;
        this.text = var4;
        this.clearIsFromFriend();
        this.clearIsFromIgnored();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-761093100")
    @Export("clearIsFromFriend")
    void clearIsFromFriend() {
        this.isFromFriend0 = TriBool.TriBool_unknown;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-117")
    @Export("isFromFriend")
    final boolean isFromFriend() {
        if (this.isFromFriend0 == TriBool.TriBool_unknown) {
            this.fillIsFromFriend();
        }
        return this.isFromFriend0 == TriBool.TriBool_true;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-29")
    @Export("fillIsFromFriend")
    void fillIsFromFriend() {
        this.isFromFriend0 = (ClanSettings.friendSystem.friendsList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1530358618")
    @Export("clearIsFromIgnored")
    void clearIsFromIgnored() {
        this.isFromIgnored0 = TriBool.TriBool_unknown;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-940344008")
    @Export("isFromIgnored")
    final boolean isFromIgnored() {
        if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
            this.fillIsFromIgnored();
        }
        return this.isFromIgnored0 == TriBool.TriBool_true;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-7389410")
    @Export("fillIsFromIgnored")
    void fillIsFromIgnored() {
        this.isFromIgnored0 = (ClanSettings.friendSystem.ignoreList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1271337219")
    @Export("fillSenderUsername")
    final void fillSenderUsername() {
        if (this.sender != null) {
            this.senderUsername = new Username(PlayerComposition.method5380(this.sender), VarcInt.loginType);
        } else {
            this.senderUsername = null;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-625577603")
    @Export("changeWorldSelectSorting")
    static void changeWorldSelectSorting(int var0, int var1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = var0;
        var3[0] = var1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; ++var5) {
            if (World.World_sortOption1[var5] != var0) {
                var2[var4] = World.World_sortOption1[var5];
                var3[var4] = World.World_sortOption2[var5];
                ++var4;
            }
        }
        World.World_sortOption1 = var2;
        World.World_sortOption2 = var3;
        Players.sortWorlds(class33.World_worlds, 0, class33.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
    }
}