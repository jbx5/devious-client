import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("gz")
@Implements("VertexNormal")
public class VertexNormal {
    @ObfuscatedName("cu")
    @ObfuscatedSignature(descriptor = "[Lpg;")
    @Export("worldSelectArrows")
    static IndexedSprite[] worldSelectArrows;

    @ObfuscatedName("ft")
    @ObfuscatedGetter(intValue = 1283636305)
    static int field2534;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1628753811)
    @Export("x")
    int x;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 121040327)
    @Export("y")
    int y;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1962176809)
    @Export("z")
    int z;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1634225463)
    @Export("magnitude")
    int magnitude;

    VertexNormal() {
    }

    @ObfuscatedSignature(descriptor = "(Lgz;)V")
    VertexNormal(VertexNormal var1) {
        this.x = var1.x;
        this.y = var1.y;
        this.z = var1.z;
        this.magnitude = var1.magnitude;
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "32")
    @Export("Messages_getLastChatID")
    static int Messages_getLastChatID(int var0) {
        Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
        if (var1 == null) {
            return -1;
        } else {
            return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.previousDual)).count;
        }
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "426410975")
    public static void method4265() {
        Widget.Widget_cachedSprites.clear();
        Widget.Widget_cachedModels.clear();
        Widget.Widget_cachedFonts.clear();
        Widget.Widget_cachedSpriteMasks.clear();
    }

    @ObfuscatedName("kr")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2102981058")
    static final void method4267() {
        PacketBufferNode var0 = class135.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
        Client.packetWriter.addNode(var0);
        Interpreter.field848 = true;
        for (InterfaceParent var1 = ((InterfaceParent) (Client.interfaceParents.first())); var1 != null; var1 = ((InterfaceParent) (Client.interfaceParents.next()))) {
            if ((var1.type == 0) || (var1.type == 3)) {
                class127.closeInterface(var1, true);
            }
        }
        if (Client.meslayerContinueWidget != null) {
            class112.invalidateWidget(Client.meslayerContinueWidget);
            Client.meslayerContinueWidget = null;
        }
        Interpreter.field848 = false;
    }
}