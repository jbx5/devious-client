import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ArchiveLoader")
public class ArchiveLoader {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive")
   final Archive archive;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1940986101
   )
   @Export("groupCount")
   final int groupCount;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 2076780085
   )
   @Export("loadedCount")
   int loadedCount = 0;

   @ObfuscatedSignature(
      descriptor = "(Lln;Ljava/lang/String;)V"
   )
   ArchiveLoader(Archive var1, String var2) {
      this.archive = var1;
      this.groupCount = var1.getGroupCount();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "3"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      this.loadedCount = 0;

      for(int var1 = 0; var1 < this.groupCount; ++var1) {
         if (!this.archive.method6448(var1) || this.archive.method6424(var1)) {
            ++this.loadedCount;
         }
      }

      return this.loadedCount >= this.groupCount;
   }

   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      descriptor = "(Lkd;I)Ljava/lang/String;",
      garbageValue = "764446077"
   )
   @Export("Widget_getSpellActionName")
   static String Widget_getSpellActionName(Widget var0) {
      if (PacketWriter.Widget_unpackTargetMask(Clock.getWidgetFlags(var0)) == 0) {
         return null;
      } else {
         return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
      }
   }

   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      descriptor = "([BII)V",
      garbageValue = "1191186738"
   )
   static void method2222(byte[] var0, int var1) {
      if (Client.randomDatData == null) {
         Client.randomDatData = new byte[24];
      }

      class373.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
   }
}
