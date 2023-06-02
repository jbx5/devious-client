import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kz")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
   @ObfuscatedName("at")
   @Export("ref")
   SoftReference ref;

   SoftWrapper(Object var1, int var2) {
      super(var2);
      this.ref = new SoftReference(var1);
   }

   @ObfuscatedName("at")
   @Export("get")
   Object get() {
      return this.ref.get();
   }

   @ObfuscatedName("an")
   @Export("isSoft")
   boolean isSoft() {
      return true;
   }
}
