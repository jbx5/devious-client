import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dk")
public class class129 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(longValue = 8663139797518624471L)
    long field1538;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1174888179)
    int field1530;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Llt;")
    IterableNodeDeque field1531;

    @ObfuscatedSignature(descriptor = "(Lpi;)V")
    public class129(Buffer var1) {
        this.field1530 = -1;
        this.field1531 = new IterableNodeDeque();
        this.method2777(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "1524635602")
    void method2777(Buffer var1) {
        this.field1538 = var1.readLong();
        this.field1530 = var1.readInt();
        for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
            Object var3;
            if (var2 == 3) {
                var3 = new class148(this);
            } else if (var2 == 1) {
                var3 = new class124(this);
            } else if (var2 == 13) {
                var3 = new class141(this);
            } else if (var2 == 4) {
                var3 = new class133(this);
            } else if (var2 == 6) {
                var3 = new class140(this);
            } else if (var2 == 5) {
                var3 = new class125(this);
            } else if (var2 == 2) {
                var3 = new class130(this);
            } else if (var2 == 7) {
                var3 = new class123(this);
            } else if (var2 == 14) {
                var3 = new class127(this);
            } else if (var2 == 8) {
                var3 = new class144(this);
            } else if (var2 == 9) {
                var3 = new class150(this);
            } else if (var2 == 10) {
                var3 = new class136(this);
            } else if (var2 == 11) {
                var3 = new class131(this);
            } else if (var2 == 12) {
                var3 = new class135(this);
            } else {
                if (var2 != 15) {
                    throw new RuntimeException("");
                }
                var3 = new class145(this);
            }
            ((class126) (var3)).vmethod3019(var1);
            this.field1531.addFirst(((Node) (var3)));
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "1848526667")
    public void method2775(ClanSettings var1) {
        if ((this.field1538 == var1.field1588) && (this.field1530 == var1.field1589)) {
            for (class126 var2 = ((class126) (this.field1531.last())); var2 != null; var2 = ((class126) (this.field1531.previous()))) {
                var2.vmethod3020(var1);
            }
            ++var1.field1589;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;I)V", garbageValue = "-1439723306")
    public static void method2774(AbstractArchive var0) {
        InvDefinition.InvDefinition_archive = var0;
    }
}