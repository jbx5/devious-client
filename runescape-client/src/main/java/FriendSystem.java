import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bw")
@Implements("FriendSystem")
public class FriendSystem {
    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "Lpt;")
    @Export("rightTitleSprite")
    static SpritePixels rightTitleSprite;

    @ObfuscatedName("bf")
    @ObfuscatedGetter(intValue = 1759557777)
    static int field812;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lok;")
    @Export("loginType")
    final LoginType loginType;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lmi;")
    @Export("friendsList")
    public final FriendsList friendsList;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lmn;")
    @Export("ignoreList")
    public final IgnoreList ignoreList;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1992863507)
    int field810;

    @ObfuscatedSignature(descriptor = "(Lok;)V")
    FriendSystem(LoginType var1) {
        this.field810 = 0;
        this.loginType = var1;
        this.friendsList = new FriendsList(var1);
        this.ignoreList = new IgnoreList(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1303902658")
    boolean method1675() {
        return this.field810 == 2;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "66")
    final void method1704() {
        this.field810 = 1;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "1785729800")
    @Export("readUpdate")
    final void readUpdate(Buffer var1, int var2) {
        this.friendsList.read(var1, var2);
        this.field810 = 2;
        GameBuild.method5483();
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-814185820")
    @Export("processFriendUpdates")
    final void processFriendUpdates() {
        for (FriendLoginUpdate var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.last())); var1 != null; var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.previous()))) {
            if (((long) (var1.field4148)) < ((DirectByteArrayCopier.getServerTime() / 1000L) - 5L)) {
                if (var1.world > 0) {
                    LoginScreenAnimation.addGameMessage(5, "", var1.username + " has logged in.");
                }
                if (var1.world == 0) {
                    LoginScreenAnimation.addGameMessage(5, "", var1.username + " has logged out.");
                }
                var1.remove();
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-62")
    @Export("clear")
    final void clear() {
        this.field810 = 0;
        this.friendsList.clear();
        this.ignoreList.clear();
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lpb;ZI)Z", garbageValue = "104721685")
    @Export("isFriended")
    final boolean isFriended(Username var1, boolean var2) {
        if (var1 == null) {
            return false;
        } else if (var1.equals(WorldMapSprite.localPlayer.username)) {
            return true;
        } else {
            return this.friendsList.isFriended(var1, var2);
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lpb;B)Z", garbageValue = "-51")
    @Export("isIgnored")
    final boolean isIgnored(Username var1) {
        if (var1 == null) {
            return false;
        } else {
            return this.ignoreList.contains(var1);
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1465117831")
    @Export("addFriend")
    final void addFriend(String var1) {
        if (var1 != null) {
            Username var2 = new Username(var1, this.loginType);
            if (var2.hasCleanName()) {
                StringBuilder var10000;
                String var4;
                if (this.friendsListIsFull()) {
                    var10000 = null;
                    var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
                    LoginScreenAnimation.addGameMessage(30, "", var4);
                } else if (WorldMapSprite.localPlayer.username.equals(var2)) {
                    var10000 = null;
                    var4 = "You can't add yourself to your own friend list";
                    LoginScreenAnimation.addGameMessage(30, "", var4);
                } else {
                    Object var10001;
                    if (this.isFriended(var2, false)) {
                        var10000 = new StringBuilder().append(var1);
                        var10001 = null;
                        var4 = var10000.append(" is already on your friend list").toString();
                        LoginScreenAnimation.addGameMessage(30, "", var4);
                    } else if (this.isIgnored(var2)) {
                        var10000 = new StringBuilder();
                        var10001 = null;
                        var10000 = var10000.append("Please remove ").append(var1);
                        var10001 = null;
                        var4 = var10000.append(" from your ignore list first").toString();
                        LoginScreenAnimation.addGameMessage(30, "", var4);
                    } else {
                        PacketBufferNode var3 = class135.getPacketBufferNode(ClientPacket.field2917, Client.packetWriter.isaacCipher);
                        var3.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var1));
                        var3.packetBuffer.writeStringCp1252NullTerminated(var1);
                        Client.packetWriter.addNode(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-702179209")
    @Export("friendsListIsFull")
    final boolean friendsListIsFull() {
        return this.friendsList.isFull() || ((this.friendsList.getSize() >= 200) && (Client.field772 != 1));
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-80")
    @Export("addIgnore")
    final void addIgnore(String var1) {
        if (var1 != null) {
            Username var2 = new Username(var1, this.loginType);
            if (var2.hasCleanName()) {
                StringBuilder var10000;
                String var3;
                if (this.canAddIgnore()) {
                    var10000 = null;
                    var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
                    LoginScreenAnimation.addGameMessage(30, "", var3);
                } else if (WorldMapSprite.localPlayer.username.equals(var2)) {
                    var10000 = null;
                    var3 = "You can't add yourself to your own ignore list";
                    LoginScreenAnimation.addGameMessage(30, "", var3);
                } else if (this.isIgnored(var2)) {
                    WorldMapArea.method4446(var1);
                } else if (this.isFriended(var2, false)) {
                    var10000 = new StringBuilder();
                    Object var10001 = null;
                    var10000 = var10000.append("Please remove ").append(var1);
                    var10001 = null;
                    var3 = var10000.append(" from your friend list first").toString();
                    LoginScreenAnimation.addGameMessage(30, "", var3);
                } else {
                    class414.method7279(var1);
                }
            }
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-96")
    @Export("canAddIgnore")
    final boolean canAddIgnore() {
        return this.ignoreList.isFull() || ((this.ignoreList.getSize() >= 100) && (Client.field772 != 1));
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "2034559615")
    @Export("removeFriend")
    final void removeFriend(String var1) {
        if (var1 != null) {
            Username var2 = new Username(var1, this.loginType);
            if (var2.hasCleanName()) {
                if (this.friendsList.removeByUsername(var2)) {
                    class412.method7241();
                    PacketBufferNode var3 = class135.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher);
                    var3.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var1));
                    var3.packetBuffer.writeStringCp1252NullTerminated(var1);
                    Client.packetWriter.addNode(var3);
                }
                GameBuild.method5483();
            }
        }
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "122")
    @Export("removeIgnore")
    final void removeIgnore(String var1) {
        if (var1 != null) {
            Username var2 = new Username(var1, this.loginType);
            if (var2.hasCleanName()) {
                if (this.ignoreList.removeByUsername(var2)) {
                    class412.method7241();
                    PacketBufferNode var3 = class135.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher);
                    var3.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var1));
                    var3.packetBuffer.writeStringCp1252NullTerminated(var1);
                    Client.packetWriter.addNode(var3);
                }
                MouseRecorder.FriendSystem_invalidateIgnoreds();
            }
        }
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(Lpb;I)Z", garbageValue = "-1241513602")
    @Export("isFriendAndHasWorld")
    final boolean isFriendAndHasWorld(Username var1) {
        Friend var2 = ((Friend) (this.friendsList.getByUsername(var1)));
        return (var2 != null) && var2.hasWorld();
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "([BIII)Z", garbageValue = "-528431965")
    static final boolean method1689(byte[] var0, int var1, int var2) {
        boolean var3 = true;
        Buffer var4 = new Buffer(var0);
        int var5 = -1;
        label68 : while (true) {
            int var6 = var4.readIncrSmallSmart();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                int var9;
                while (!var8) {
                    var9 = var4.readUShortSmart();
                    if (var9 == 0) {
                        continue label68;
                    }
                    var7 += var9 - 1;
                    int var10 = var7 & 63;
                    int var11 = (var7 >> 6) & 63;
                    int var12 = var4.readUnsignedByte() >> 2;
                    int var13 = var11 + var1;
                    int var14 = var10 + var2;
                    if ((((var13 > 0) && (var14 > 0)) && (var13 < 103)) && (var14 < 103)) {
                        ObjectComposition var15 = ParamComposition.getObjectDefinition(var5);
                        if (((((var12 != 22) || (!Client.isLowDetail)) || (var15.int1 != 0)) || (var15.interactType == 1)) || var15.boolean2) {
                            if (!var15.needsModelFiles()) {
                                ++Client.field559;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                } 
                var9 = var4.readUShortSmart();
                if (var9 == 0) {
                    break;
                }
                var4.readUnsignedByte();
            } 
        } 
    }
}