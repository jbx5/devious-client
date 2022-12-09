import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jd")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
   @ObfuscatedName("e")
   @Export("size")
   final int size;

   Wrapper(int var1) {
      this.size = var1;
   }

   @ObfuscatedName("h")
   @Export("get")
   abstract Object get();

   @ObfuscatedName("e")
   @Export("isSoft")
   abstract boolean isSoft();
}
