import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public final class class384 {
   @ObfuscatedName("h")
   final Comparator field4495;
   @ObfuscatedName("e")
   final Map field4489;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   final class366 field4493;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   final class366 field4491;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = 8393668599906735065L
   )
   final long field4492;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lns;"
   )
   final class382 field4490;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -97881531
   )
   final int field4494;

   @ObfuscatedSignature(
      descriptor = "(JILns;)V"
   )
   class384(long var1, int var3, class382 var4) {
      this.field4495 = new class383(this);
      this.field4492 = var1;
      this.field4494 = var3;
      this.field4490 = var4;
      if (this.field4494 == -1) {
         this.field4489 = new HashMap(64);
         this.field4493 = new class366(64, this.field4495);
         this.field4491 = null;
      } else {
         if (this.field4490 == null) {
            throw new IllegalArgumentException("");
         }

         this.field4489 = new HashMap(this.field4494);
         this.field4493 = new class366(this.field4494, this.field4495);
         this.field4491 = new class366(this.field4494);
      }

   }

   @ObfuscatedSignature(
      descriptor = "(ILns;)V"
   )
   public class384(int var1, class382 var2) {
      this(-1L, var1, var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1534234812"
   )
   boolean method7372() {
      return this.field4494 != -1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "-646919436"
   )
   public Object method7386(Object var1) {
      synchronized(this) {
         if (this.field4492 != -1L) {
            this.method7390();
         }

         class385 var3 = (class385)this.field4489.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.method7375(var3, false);
            return var3.field4498;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "-1936546868"
   )
   public Object method7374(Object var1, Object var2) {
      synchronized(this) {
         if (this.field4492 != -1L) {
            this.method7390();
         }

         class385 var4 = (class385)this.field4489.get(var1);
         if (var4 != null) {
            Object var8 = var4.field4498;
            var4.field4498 = var2;
            this.method7375(var4, false);
            return var8;
         } else {
            class385 var5;
            if (this.method7372() && this.field4489.size() == this.field4494) {
               var5 = (class385)this.field4491.remove();
               this.field4489.remove(var5.field4497);
               this.field4493.remove(var5);
            }

            var5 = new class385(var2, var1);
            this.field4489.put(var1, var5);
            this.method7375(var5, true);
            return null;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lnz;ZI)V",
      garbageValue = "377209156"
   )
   void method7375(class385 var1, boolean var2) {
      if (!var2) {
         this.field4493.remove(var1);
         if (this.method7372() && !this.field4491.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field4496 = System.currentTimeMillis();
      if (this.method7372()) {
         switch (this.field4490.field4482) {
            case 0:
               var1.field4499 = var1.field4496;
               break;
            case 1:
               ++var1.field4499;
         }

         this.field4491.add(var1);
      }

      this.field4493.add(var1);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "219225117"
   )
   void method7390() {
      if (this.field4492 == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - this.field4492;

         while(!this.field4493.isEmpty()) {
            class385 var3 = (class385)this.field4493.peek();
            if (var3.field4496 >= var1) {
               return;
            }

            this.field4489.remove(var3.field4497);
            this.field4493.remove(var3);
            if (this.method7372()) {
               this.field4491.remove(var3);
            }
         }

      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "549271999"
   )
   public void method7387() {
      synchronized(this) {
         this.field4489.clear();
         this.field4493.clear();
         if (this.method7372()) {
            this.field4491.clear();
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-720383995"
   )
   static void method7371() {
      Tiles.Tiles_underlays = null;
      class490.Tiles_overlays = null;
      Tiles.Tiles_shapes = null;
      class358.field4344 = null;
      class159.field1816 = null;
      Canvas.Tiles_underlays = null;
      Tiles.field1030 = null;
      Tiles.Tiles_hue = null;
      PcmPlayer.Tiles_saturation = null;
      Tiles.Tiles_lightness = null;
      NPC.Tiles_hueMultiplier = null;
      MenuAction.field905 = null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1932572710"
   )
   public static void method7370(int var0) {
      class286.musicPlayerStatus = 1;
      class304.musicTrackArchive = null;
      class109.musicTrackGroupId = -1;
      class286.musicTrackFileId = -1;
      class467.musicTrackVolume = 0;
      class145.musicTrackBoolean = false;
      class286.pcmSampleLength = var0;
   }
}
