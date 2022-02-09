import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ov")
@Implements("Fonts")
public class Fonts {
    @ObfuscatedName("i")
    @Export("SpriteBuffer_spriteHeights")
    public static int[] SpriteBuffer_spriteHeights;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("spritesArchive")
    AbstractArchive spritesArchive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("fontsArchive")
    AbstractArchive fontsArchive;

    @ObfuscatedName("s")
    @Export("map")
    HashMap map;

    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;)V")
    public Fonts(AbstractArchive var1, AbstractArchive var2) {
        this.spritesArchive = var1;
        this.fontsArchive = var2;
        this.map = new HashMap();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "([Lox;I)Ljava/util/HashMap;", garbageValue = "1264329107")
    @Export("createMap")
    public HashMap createMap(FontName[] var1) {
        HashMap var2 = new HashMap();
        FontName[] var3 = var1;
        for (int var4 = 0; var4 < var3.length; ++var4) {
            FontName var5 = var3[var4];
            if (this.map.containsKey(var5)) {
                var2.put(var5, this.map.get(var5));
            } else {
                AbstractArchive var7 = this.spritesArchive;
                AbstractArchive var8 = this.fontsArchive;
                String var9 = var5.name;
                int var10 = var7.getGroupId(var9);
                int var11 = var7.getFileId(var10, "");
                Font var6 = DynamicObject.method1996(var7, var8, var10, var11);
                if (var6 != null) {
                    this.map.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("kt")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1409007711")
    @Export("Clan_joinChat")
    static final void Clan_joinChat(String var0) {
        if (!var0.equals("")) {
            PacketBufferNode var1 = class135.getPacketBufferNode(ClientPacket.field2860, Client.packetWriter.isaacCipher);
            var1.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var0));
            var1.packetBuffer.writeStringCp1252NullTerminated(var0);
            Client.packetWriter.addNode(var1);
        }
    }
}