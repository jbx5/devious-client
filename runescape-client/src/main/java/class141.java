import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class141 extends class142 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -779488639
   )
   int field1621;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class141(class145 var1) {
      this.this$0 = var1;
      this.field1621 = -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1621 = var1.readUnsignedShort();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3208(this.field1621);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2061871347"
   )
   public static void method3119() {
      NPCComposition.NpcDefinition_cached.clear();
      NPCComposition.NpcDefinition_cachedModels.clear();
   }
}
