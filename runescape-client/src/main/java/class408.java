import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ol")
class class408 implements Iterator {
    @ObfuscatedName("gz")
    @ObfuscatedSignature(descriptor = "Llv;")
    @Export("fontBold12")
    static Font fontBold12;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 966614097)
    int field4480;

    @ObfuscatedSignature(descriptor = "Lop;")
    final class409 this$0;

    @ObfuscatedSignature(descriptor = "(Lop;)V")
    class408(class409 var1) {
        this.this$0 = var1;
    }

    public boolean hasNext() {
        return this.field4480 < this.this$0.method6782();
    }

    public Object next() {
        int var1 = (++this.field4480) - 1;
        class377 var2 = ((class377) (this.this$0.field4482.get(((long) (var1)))));
        return var2 != null ? var2 : this.this$0.method7212(var1);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "27")
    @Export("isWorldMapEvent")
    public static boolean isWorldMapEvent(int var0) {
        return (((((((var0 == 10) || (var0 == 11)) || (var0 == 12)) || (var0 == 13)) || (var0 == 14)) || (var0 == 15)) || (var0 == 16)) || (var0 == 17);
    }
}