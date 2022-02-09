import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("nn")
public class class369 {
    @ObfuscatedName("c")
    float field4226;

    @ObfuscatedName("l")
    float field4225;

    @ObfuscatedName("s")
    float field4227;

    static {
        new class369(0.0F, 0.0F, 0.0F);
        new class369(1.0F, 1.0F, 1.0F);
        new class369(1.0F, 0.0F, 0.0F);
        new class369(0.0F, 1.0F, 0.0F);
        new class369(0.0F, 0.0F, 1.0F);
        DefaultsGroup.method6589(100);
    }

    class369(float var1, float var2, float var3) {
        this.field4226 = var1;
        this.field4225 = var2;
        this.field4227 = var3;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)F", garbageValue = "86")
    final float method6638() {
        return ((float) (Math.sqrt(((double) (((this.field4227 * this.field4227) + (this.field4226 * this.field4226)) + (this.field4225 * this.field4225))))));
    }

    public String toString() {
        return (((this.field4226 + ", ") + this.field4225) + ", ") + this.field4227;
    }
}