import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("StructComposition")
public class StructComposition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("StructDefinition_archive")
   public static AbstractArchive StructDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("StructDefinition_cached")
   public static EvictingDualNodeHashTable StructDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   @Export("params")
   IterableNodeHashTable params;

   StructComposition() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-35"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "-50"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "-458084373"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 249) {
         this.params = FaceNormal.readStringIntParameters(var1, this.params);
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1059246046"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return Language.method6584(this.params, var1, var2);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-348365462"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return FriendLoginUpdate.method7304(this.params, var1, var2);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "473934492"
   )
   public static float method3677(int var0) {
      var0 &= 16383;
      return (float)(6.283185307179586 * (double)((float)var0 / 16384.0F));
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-268428904"
   )
   public static void method3676() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4122 != 0) {
            ArchiveDiskActionHandler.field4122 = 1;

            try {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
            } catch (InterruptedException var3) {
            }
         }

      }
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-969804644"
   )
   static int method3661(int var0) {
      return var0 * 3 + 600;
   }
}
