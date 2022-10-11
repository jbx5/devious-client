import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ArchiveLoader")
public class ArchiveLoader {
   @ObfuscatedName("p")
   public static short[][] field1016;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive")
   final Archive archive;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1490058667
   )
   @Export("groupCount")
   final int groupCount;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1809836531
   )
   @Export("loadedCount")
   int loadedCount = 0;

   @ObfuscatedSignature(
      descriptor = "(Llx;Ljava/lang/String;)V"
   )
   ArchiveLoader(Archive var1, String var2) {
      this.archive = var1;
      this.groupCount = var1.getGroupCount();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-847453577"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      this.loadedCount = 0;

      for(int var1 = 0; var1 < this.groupCount; ++var1) {
         if (!this.archive.method6298(var1) || this.archive.method6304(var1)) {
            ++this.loadedCount;
         }
      }

      return this.loadedCount >= this.groupCount;
   }
}
