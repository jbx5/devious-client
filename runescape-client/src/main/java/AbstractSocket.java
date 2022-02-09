import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mg")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
    protected AbstractSocket() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-499949391")
    @Export("close")
    public abstract void close();

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-86")
    @Export("readUnsignedByte")
    public abstract int readUnsignedByte() throws IOException;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2115909346")
    @Export("available")
    public abstract int available() throws IOException;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "67")
    @Export("isAvailable")
    public abstract boolean isAvailable(int var1) throws IOException;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "([BIII)I", garbageValue = "-781316249")
    @Export("read")
    public abstract int read(byte[] var1, int var2, int var3) throws IOException;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "300460862")
    @Export("write")
    public abstract void write(byte[] var1, int var2, int var3) throws IOException;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpc;I)V", garbageValue = "195231876")
    @Export("updatePlayer")
    static final void updatePlayer(PacketBuffer var0) {
        var0.importIndex();
        int var1 = Client.localPlayerIndex;
        Player var2 = WorldMapSprite.localPlayer = Client.players[var1] = new Player();
        var2.index = var1;
        int var3 = var0.readBits(30);
        byte var4 = ((byte) (var3 >> 28));
        int var5 = (var3 >> 14) & 16383;
        int var6 = var3 & 16383;
        var2.pathX[0] = var5 - Canvas.baseX;
        var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
        var2.pathY[0] = var6 - class118.baseY;
        var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
        SoundSystem.Client_plane = var2.plane = var4;
        if (Players.field1278[var1] != null) {
            var2.read(Players.field1278[var1]);
        }
        Players.Players_count = 0;
        Players.Players_indices[(++Players.Players_count) - 1] = var1;
        Players.field1276[var1] = 0;
        Players.Players_emptyIdxCount = 0;
        for (int var7 = 1; var7 < 2048; ++var7) {
            if (var7 != var1) {
                int var8 = var0.readBits(18);
                int var9 = var8 >> 16;
                int var10 = (var8 >> 8) & 597;
                int var11 = var8 & 597;
                Players.Players_regions[var7] = ((var10 << 14) + var11) + (var9 << 28);
                Players.Players_orientations[var7] = 0;
                Players.Players_targetIndices[var7] = -1;
                Players.Players_emptyIndices[(++Players.Players_emptyIdxCount) - 1] = var7;
                Players.field1276[var7] = 0;
            }
        }
        var0.exportIndex();
    }
}