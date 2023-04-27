import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class157 extends class139 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("ObjectDefinition_modelsArchive")
   static AbstractArchive ObjectDefinition_modelsArchive;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1897105841
   )
   int field1760;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 772555143
   )
   int field1763;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class157(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      this.field1760 = var1.readInt();
      this.field1763 = var1.readInt();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.method3315(this.field1760, this.field1763);
   }
}
