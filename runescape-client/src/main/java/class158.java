import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class158 extends class136 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -3634695712178554237L
   )
   long field1812;
   @ObfuscatedName("e")
   String field1808;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class158(class139 var1) {
      this.this$0 = var1;
      this.field1812 = -1L;
      this.field1808 = null;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1812 = var1.readLong();
      }

      this.field1808 = var1.readStringCp1252NullTerminatedOrNull();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3174(this.field1812, this.field1808);
   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "120"
   )
   static final void method3335(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      }

      if (var0 > 383) {
         var0 = 383;
      }

      if (class97.cameraPitch < var0) {
         class97.cameraPitch = (var0 - class97.cameraPitch) * LoginScreenAnimation.field1283 / 1000 + class97.cameraPitch + class415.field4647;
         if (class97.cameraPitch > var0) {
            class97.cameraPitch = var0;
         }
      }

      if (class97.cameraPitch > var0) {
         class97.cameraPitch -= (class97.cameraPitch - var0) * LoginScreenAnimation.field1283 / 1000 + class415.field4647;
         if (class97.cameraPitch < var0) {
            class97.cameraPitch = var0;
         }
      }

      int var2 = var1 - class128.cameraYaw;
      if (var2 > 1024) {
         var2 -= 2048;
      }

      if (var2 < -1024) {
         var2 += 2048;
      }

      if (var2 > 0) {
         class128.cameraYaw = class128.cameraYaw + class415.field4647 + var2 * LoginScreenAnimation.field1283 / 1000;
         class128.cameraYaw &= 2047;
      }

      if (var2 < 0) {
         class128.cameraYaw -= -var2 * LoginScreenAnimation.field1283 / 1000 + class415.field4647;
         class128.cameraYaw &= 2047;
      }

      int var3 = var1 - class128.cameraYaw;
      if (var3 > 1024) {
         var3 -= 2048;
      }

      if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
         class128.cameraYaw = var1;
      }

   }
}
