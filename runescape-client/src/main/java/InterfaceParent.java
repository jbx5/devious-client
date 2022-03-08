import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cf")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
    @ObfuscatedName("ro")
    @ObfuscatedSignature(descriptor = "Leg;")
    @Export("guestClanChannel")
    static ClanChannel guestClanChannel;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -566809681)
    @Export("group")
    int group;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 597308513)
    @Export("type")
    int type;

    @ObfuscatedName("s")
    boolean field1040;

    InterfaceParent() {
        this.field1040 = false;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)[B", garbageValue = "-1118992096")
    @Export("ByteArrayPool_getArray")
    public static synchronized byte[] ByteArrayPool_getArray(int var0) {
        return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-99")
    public static boolean method2086(int var0) {
        return (var0 >= 0) && (var0 < 112) ? KeyHandler.KeyHandler_pressedKeys[var0] : false;
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(Lbi;B)V", garbageValue = "-62")
    @Export("changeWorld")
    static void changeWorld(World var0) {
        if (var0.isMembersOnly() != Client.isMembersWorld) {
            Client.isMembersWorld = var0.isMembersOnly();
            class115.method2638(var0.isMembersOnly());
        }
        if (var0.properties != Client.worldProperties) {
            class131.method2787(Message.archive8, var0.properties);
        }
        HealthBar.worldHost = var0.host;
        Client.worldId = var0.id;
        Client.worldProperties = var0.properties;
        class346.worldPort = (Client.gameBuild == 0) ? 43594 : var0.id + 40000;
        class297.js5Port = (Client.gameBuild == 0) ? 443 : var0.id + 50000;
        class274.currentPort = class346.worldPort;
    }

    @ObfuscatedName("he")
    @ObfuscatedSignature(descriptor = "(IIIIIIIB)V", garbageValue = "-22")
    static final void method2084(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        var5 = class167.method3254(var5, var6);
        int var7 = (2048 - var3) & 2047;
        int var8 = (2048 - var4) & 2047;
        int var9 = 0;
        int var10 = 0;
        int var11 = var5;
        int var12;
        int var13;
        int var14;
        if (var7 != 0) {
            var12 = Rasterizer3D.Rasterizer3D_sine[var7];
            var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
            var14 = ((var10 * var13) - (var12 * var5)) >> 16;
            var11 = ((var13 * var5) + (var10 * var12)) >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            var12 = Rasterizer3D.Rasterizer3D_sine[var8];
            var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
            var14 = ((var12 * var11) + (var9 * var13)) >> 16;
            var11 = ((var13 * var11) - (var9 * var12)) >> 16;
            var9 = var14;
        }
        if (Client.isCameraLocked) {
            class213.field2598 = var0 - var9;
            FriendsChat.field4141 = var1 - var10;
            class139.field1624 = var2 - var11;
            LoginPacket.field3062 = var3;
            Interpreter.field854 = var4;
        } else {
            class414.cameraX = var0 - var9;
            WorldMapDecoration.cameraY = var1 - var10;
            GrandExchangeOfferOwnWorldComparator.cameraZ = var2 - var11;
            class7.cameraPitch = var3;
            class7.cameraYaw = var4;
        }
        if ((((Client.oculusOrbState == 1) && (Client.staffModLevel >= 2)) && ((Client.cycle % 50) == 0)) && (((class29.oculusOrbFocalPointX >> 7) != (WorldMapSprite.localPlayer.x >> 7)) || ((class121.oculusOrbFocalPointY >> 7) != (WorldMapSprite.localPlayer.y >> 7)))) {
            var12 = WorldMapSprite.localPlayer.plane;
            var13 = (class29.oculusOrbFocalPointX >> 7) + Canvas.baseX;
            var14 = (class121.oculusOrbFocalPointY >> 7) + class118.baseY;
            DevicePcmPlayerProvider.method361(var13, var14, var12, true);
        }
    }
}