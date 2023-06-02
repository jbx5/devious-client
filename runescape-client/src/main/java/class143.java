import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class143 extends class142 {
   @ObfuscatedName("bs")
   @Export("Widget_loadedInterfaces")
   public static boolean[] Widget_loadedInterfaces;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 53035505
   )
   int field1629;
   @ObfuscatedName("an")
   boolean field1625;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class143(class145 var1) {
      this.this$0 = var1;
      this.field1629 = -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1629 = var1.readUnsignedShort();
      this.field1625 = var1.readUnsignedByte() == 1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3214(this.field1629, this.field1625);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "790907813"
   )
   public static void method3134() {
      VarpDefinition.VarpDefinition_cached.clear();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "60"
   )
   static final void method3132(String var0) {
      ParamComposition.method3837("Please remove " + var0 + " from your ignore list first");
   }

   @ObfuscatedName("no")
   @ObfuscatedSignature(
      descriptor = "(IB)Ltb;",
      garbageValue = "-2"
   )
   static class494 method3126(int var0) {
      class494 var1 = (class494)Client.DBTableMasterIndex_cache.get((long)var0);
      if (var1 == null) {
         var1 = new class494(Messages.field1377, var0);
      }

      return var1;
   }
}
