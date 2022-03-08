import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fs")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("HealthBarDefinition_archive")
    static AbstractArchive HealthBarDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkq;")
    static AbstractArchive field1806;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("HealthBarDefinition_cached")
    static EvictingDualNodeHashTable HealthBarDefinition_cached;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("HealthBarDefinition_cachedSprites")
    static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1092173993)
    public int field1809;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1407785135)
    @Export("int1")
    public int int1;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 831494047)
    @Export("int2")
    public int int2;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1486958543)
    @Export("int3")
    public int int3;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 11578163)
    public int field1814;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 741311809)
    @Export("int5")
    public int int5;

    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = 278570643)
    @Export("frontSpriteID")
    int frontSpriteID;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1893029459)
    @Export("backSpriteID")
    int backSpriteID;

    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -2065890545)
    @Export("width")
    public int width;

    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -661758629)
    @Export("widthPadding")
    public int widthPadding;

    static {
        HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
        HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
    }

    HealthBarDefinition() {
        this.int1 = 255;
        this.int2 = 255;
        this.int3 = -1;
        this.field1814 = 1;
        this.int5 = 70;
        this.frontSpriteID = -1;
        this.backSpriteID = -1;
        this.width = 30;
        this.widthPadding = 0;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "1")
    @Export("decode")
    void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }
            this.decodeNext(var1, var2);
        } 
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "2132103547")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            var1.readUnsignedShort();
        } else if (var2 == 2) {
            this.int1 = var1.readUnsignedByte();
        } else if (var2 == 3) {
            this.int2 = var1.readUnsignedByte();
        } else if (var2 == 4) {
            this.int3 = 0;
        } else if (var2 == 5) {
            this.int5 = var1.readUnsignedShort();
        } else if (var2 == 6) {
            var1.readUnsignedByte();
        } else if (var2 == 7) {
            this.frontSpriteID = var1.readNullableLargeSmart();
        } else if (var2 == 8) {
            this.backSpriteID = var1.readNullableLargeSmart();
        } else if (var2 == 11) {
            this.int3 = var1.readUnsignedShort();
        } else if (var2 == 14) {
            this.width = var1.readUnsignedByte();
        } else if (var2 == 15) {
            this.widthPadding = var1.readUnsignedByte();
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)Lpt;", garbageValue = "1989731460")
    @Export("getFrontSprite")
    public SpritePixels getFrontSprite() {
        if (this.frontSpriteID < 0) {
            return null;
        } else {
            SpritePixels var1 = ((SpritePixels) (HealthBarDefinition_cachedSprites.get(((long) (this.frontSpriteID)))));
            if (var1 != null) {
                return var1;
            } else {
                var1 = class126.SpriteBuffer_getSprite(field1806, this.frontSpriteID, 0);
                if (var1 != null) {
                    HealthBarDefinition_cachedSprites.put(var1, ((long) (this.frontSpriteID)));
                }
                return var1;
            }
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)Lpt;", garbageValue = "620286670")
    @Export("getBackSprite")
    public SpritePixels getBackSprite() {
        if (this.backSpriteID < 0) {
            return null;
        } else {
            SpritePixels var1 = ((SpritePixels) (HealthBarDefinition_cachedSprites.get(((long) (this.backSpriteID)))));
            if (var1 != null) {
                return var1;
            } else {
                var1 = class126.SpriteBuffer_getSprite(field1806, this.backSpriteID, 0);
                if (var1 != null) {
                    HealthBarDefinition_cachedSprites.put(var1, ((long) (this.backSpriteID)));
                }
                return var1;
            }
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)Lft;", garbageValue = "0")
    public static VarcInt method3244(int var0) {
        VarcInt var1 = ((VarcInt) (VarcInt.VarcInt_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
            var1 = new VarcInt();
            if (var2 != null) {
                var1.method3202(new Buffer(var2));
            }
            VarcInt.VarcInt_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "0")
    public static void method3246() {
        ParamComposition.ParamDefinition_cached.clear();
    }

    @ObfuscatedName("ld")
    @ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "1677454139")
    static final void method3225(int var0, int var1, boolean var2) {
        if (Client.currentClanChannels[var0] != null) {
            if ((var1 >= 0) && (var1 < Client.currentClanChannels[var0].method2982())) {
                ClanChannelMember var3 = ((ClanChannelMember) (Client.currentClanChannels[var0].members.get(var1)));
                PacketBufferNode var4 = class135.getPacketBufferNode(ClientPacket.field2880, Client.packetWriter.isaacCipher);
                var4.packetBuffer.writeByte(4 + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var3.username.getName()));
                var4.packetBuffer.writeByte(var0);
                var4.packetBuffer.writeShort(var1);
                var4.packetBuffer.writeBoolean(var2);
                var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
                Client.packetWriter.addNode(var4);
            }
        }
    }
}