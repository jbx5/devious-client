import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kb")
public final class class291 {
    @ObfuscatedName("fm")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "5")
    static final void method5478() {
        SceneTilePaint.method4270(class213.field2598, FriendsChat.field4141, class139.field1624);
        class260.method5000(LoginPacket.field3062, Interpreter.field854);
        if (((((class213.field2598 == class414.cameraX) && (FriendsChat.field4141 == WorldMapDecoration.cameraY)) && (class139.field1624 == GrandExchangeOfferOwnWorldComparator.cameraZ)) && (LoginPacket.field3062 == class7.cameraPitch)) && (class7.cameraYaw == Interpreter.field854)) {
            Client.field755 = false;
            Client.isCameraLocked = false;
            class7.field33 = 0;
            class21.field119 = 0;
            class334.field4057 = 0;
            WorldMapSectionType.field2723 = 0;
            WallDecoration.field2573 = 0;
            class4.field17 = 0;
            SceneTilePaint.field2543 = 0;
            Message.field478 = 0;
            class12.field75 = 0;
            class121.field1492 = 0;
        }
    }
}