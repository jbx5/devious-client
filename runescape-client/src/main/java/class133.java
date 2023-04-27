import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class133 extends DualNode {
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1609019153
   )
   static int field1593;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lfj;"
   )
   static ClanSettings field1597;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1156919267
   )
   int field1587;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[[Lek;"
   )
   public class125[][] field1592 = null;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "[[Lek;"
   )
   class125[][] field1589 = null;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lik;"
   )
   public Skeleton field1590;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -744553313
   )
   int field1591 = 0;
   @ObfuscatedName("ab")
   boolean field1598;
   @ObfuscatedName("at")
   Future field1594;
   @ObfuscatedName("aa")
   List field1595;

   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;IZ)V"
   )
   class133(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      this.field1587 = var3;
      byte[] var5 = var1.takeFile(this.field1587 >> 16 & '\uffff', this.field1587 & '\uffff');
      Buffer var6 = new Buffer(var5);
      int var7 = var6.readUnsignedByte();
      int var8 = var6.readUnsignedShort();
      byte[] var9;
      if (var4) {
         var9 = var2.getFile(0, var8);
      } else {
         var9 = var2.getFile(var8, 0);
      }

      this.field1590 = new Skeleton(var8, var9);
      this.field1595 = new ArrayList();
      this.field1594 = class374.field4387.submit(new class132(this, var6, var7));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IB)V",
      garbageValue = "-87"
   )
   void method3135(Buffer var1, int var2) {
      var1.readUnsignedShort();
      var1.readUnsignedShort();
      this.field1591 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedShort();
      this.field1589 = new class125[this.field1590.method4517().method4452()][];
      this.field1592 = new class125[this.field1590.method4516()][];
      class124[] var4 = new class124[var3];

      int var5;
      int var7;
      int var9;
      for(var5 = 0; var5 < var3; ++var5) {
         var7 = var1.readUnsignedByte();
         class126 var14 = (class126)StructComposition.findEnumerated(VarpDefinition.method3655(), var7);
         if (var14 == null) {
            var14 = class126.field1535;
         }

         var9 = var1.readShortSmart();
         class127 var16 = UserComparator9.method2940(var1.readUnsignedByte());
         class125 var17 = new class125();
         var17.method3060(var1, var2);
         var4[var5] = new class124(this, var17, var14, var16, var9);
         int var12 = var14.method3101();
         class125[][] var13;
         if (var14 == class126.field1532) {
            var13 = this.field1589;
         } else {
            var13 = this.field1592;
         }

         if (var13[var9] == null) {
            var13[var9] = new class125[var12];
         }

         if (var14 == class126.field1539) {
            this.field1598 = true;
         }
      }

      var5 = var3 / field1593;
      int var6 = var3 % field1593;
      int var8 = 0;

      for(var9 = 0; var9 < field1593; ++var9) {
         var7 = var8;
         var8 += var5;
         if (var6 > 0) {
            ++var8;
            --var6;
         }

         if (var8 == var7) {
            break;
         }

         this.field1595.add(class374.field4387.submit(new class128(this, var7, var8, var4)));
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-63286081"
   )
   public boolean method3156() {
      if (this.field1594 == null && this.field1595 == null) {
         return true;
      } else {
         if (this.field1594 != null) {
            if (!this.field1594.isDone()) {
               return false;
            }

            this.field1594 = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.field1595.size(); ++var2) {
            if (!((Future)this.field1595.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field1595.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field1595 = null;
            return true;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2042558319"
   )
   public int method3141() {
      return this.field1591;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1713081171"
   )
   public boolean method3136() {
      return this.field1598;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILew;III)V",
      garbageValue = "-434592312"
   )
   public void method3139(int var1, class122 var2, int var3, int var4) {
      class425 var5;
      synchronized(class425.field4665) {
         if (class425.field4667 == 0) {
            var5 = new class425();
         } else {
            class425.field4665[--class425.field4667].method8177();
            var5 = class425.field4665[class425.field4667];
         }
      }

      this.method3160(var5, var3, var2, var1);
      this.method3164(var5, var3, var2, var1);
      this.method3140(var5, var3, var2, var1);
      var2.method3011(var5);
      var5.method8176();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lqj;ILew;II)V",
      garbageValue = "-2042507237"
   )
   void method3160(class425 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method3017(this.field1591);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1589[var2] != null) {
         class125 var9 = this.field1589[var2][0];
         class125 var10 = this.field1589[var2][1];
         class125 var11 = this.field1589[var2][2];
         if (var9 != null) {
            var6 = var9.method3062(var4);
         }

         if (var10 != null) {
            var7 = var10.method3062(var4);
         }

         if (var11 != null) {
            var8 = var11.method3062(var4);
         }
      }

      class424 var17 = class131.method3130();
      var17.method8139(1.0F, 0.0F, 0.0F, var6);
      class424 var18 = class131.method3130();
      var18.method8139(0.0F, 1.0F, 0.0F, var7);
      class424 var19 = class131.method3130();
      var19.method8139(0.0F, 0.0F, 1.0F, var8);
      class424 var12 = class131.method3130();
      var12.method8141(var19);
      var12.method8141(var17);
      var12.method8141(var18);
      class425 var13;
      synchronized(class425.field4665) {
         if (class425.field4667 == 0) {
            var13 = new class425();
         } else {
            class425.field4665[--class425.field4667].method8177();
            var13 = class425.field4665[class425.field4667];
         }
      }

      var13.method8184(var12);
      var1.method8183(var13);
      var17.method8144();
      var18.method8144();
      var19.method8144();
      var12.method8144();
      var13.method8176();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lqj;ILew;II)V",
      garbageValue = "2146059803"
   )
   void method3140(class425 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method3003(this.field1591);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1589[var2] != null) {
         class125 var9 = this.field1589[var2][3];
         class125 var10 = this.field1589[var2][4];
         class125 var11 = this.field1589[var2][5];
         if (var9 != null) {
            var6 = var9.method3062(var4);
         }

         if (var10 != null) {
            var7 = var10.method3062(var4);
         }

         if (var11 != null) {
            var8 = var11.method3062(var4);
         }
      }

      var1.field4670[12] = var6;
      var1.field4670[13] = var7;
      var1.field4670[14] = var8;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lqj;ILew;II)V",
      garbageValue = "-1686943935"
   )
   void method3164(class425 var1, int var2, class122 var3, int var4) {
      float[] var5 = var3.method3004(this.field1591);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1589[var2] != null) {
         class125 var9 = this.field1589[var2][6];
         class125 var10 = this.field1589[var2][7];
         class125 var11 = this.field1589[var2][8];
         if (var9 != null) {
            var6 = var9.method3062(var4);
         }

         if (var10 != null) {
            var7 = var10.method3062(var4);
         }

         if (var11 != null) {
            var8 = var11.method3062(var4);
         }
      }

      class425 var14;
      synchronized(class425.field4665) {
         if (class425.field4667 == 0) {
            var14 = new class425();
         } else {
            class425.field4665[--class425.field4667].method8177();
            var14 = class425.field4665[class425.field4667];
         }
      }

      var14.method8223(var6, var7, var8);
      var1.method8183(var14);
      var14.method8176();
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-121"
   )
   @Export("queueSoundEffect")
   static void queueSoundEffect(int var0, int var1, int var2) {
      if (class20.clientPreferences.method2463() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
         Client.soundEffectIds[Client.soundEffectCount] = var0;
         Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
         Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
         Client.soundEffects[Client.soundEffectCount] = null;
         Client.soundLocations[Client.soundEffectCount] = 0;
         ++Client.soundEffectCount;
      }

   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1741543163"
   )
   static final void method3165(int var0, int var1, int var2) {
      if (class36.cameraX < var0) {
         class36.cameraX = (var0 - class36.cameraX) * class138.field1637 / 1000 + class36.cameraX + KeyHandler.field137;
         if (class36.cameraX > var0) {
            class36.cameraX = var0;
         }
      }

      if (class36.cameraX > var0) {
         class36.cameraX -= (class36.cameraX - var0) * class138.field1637 / 1000 + KeyHandler.field137;
         if (class36.cameraX < var0) {
            class36.cameraX = var0;
         }
      }

      if (class174.cameraY < var1) {
         class174.cameraY = (var1 - class174.cameraY) * class138.field1637 / 1000 + class174.cameraY + KeyHandler.field137;
         if (class174.cameraY > var1) {
            class174.cameraY = var1;
         }
      }

      if (class174.cameraY > var1) {
         class174.cameraY -= (class174.cameraY - var1) * class138.field1637 / 1000 + KeyHandler.field137;
         if (class174.cameraY < var1) {
            class174.cameraY = var1;
         }
      }

      if (class297.cameraZ < var2) {
         class297.cameraZ = (var2 - class297.cameraZ) * class138.field1637 / 1000 + class297.cameraZ + KeyHandler.field137;
         if (class297.cameraZ > var2) {
            class297.cameraZ = var2;
         }
      }

      if (class297.cameraZ > var2) {
         class297.cameraZ -= (class297.cameraZ - var2) * class138.field1637 / 1000 + KeyHandler.field137;
         if (class297.cameraZ < var2) {
            class297.cameraZ = var2;
         }
      }

   }
}
