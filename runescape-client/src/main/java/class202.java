import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public enum class202 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lgo;"
   )
   field2287((byte)-1),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lgo;"
   )
   field2281((byte)0),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lgo;"
   )
   field2282((byte)1),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lgo;"
   )
   field2284((byte)2);

   @ObfuscatedName("uf")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   @Export("platformInfo")
   static PlatformInfo platformInfo;
   @ObfuscatedName("h")
   public byte field2285;

   class202(byte var3) {
      this.field2285 = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field2285;
   }
}
