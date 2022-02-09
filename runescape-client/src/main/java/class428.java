import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
@ObfuscatedName("po")
public class class428 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 281606451)
    public final int field4576;

    @ObfuscatedName("l")
    public Object field4575;

    public class428(int var1) {
        this.field4576 = var1;
    }

    public class428(int var1, Object var2) {
        this.field4576 = var1;
        this.field4575 = var2;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object var1) {
        if (!(var1 instanceof class428)) {
            return false;
        } else {
            class428 var2 = ((class428) (var1));
            if ((var2.field4575 == null) && (this.field4575 != null)) {
                return false;
            } else if ((this.field4575 == null) && (var2.field4575 != null)) {
                return false;
            } else {
                return (var2.field4576 == this.field4576) && var2.field4575.equals(this.field4575);
            }
        }
    }
}