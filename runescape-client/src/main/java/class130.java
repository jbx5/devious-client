import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class130 extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1966668885
   )
   int field1607;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "[[Ldu;"
   )
   public class125[][] field1604 = null;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "[[Ldu;"
   )
   class125[][] field1605 = null;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lhn;"
   )
   public Skeleton field1603;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1549136257
   )
   int field1609 = 0;
   @ObfuscatedName("q")
   boolean field1606;

   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;IZ)V",
      garbageValue = "0"
   )
   public class130(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      this.field1607 = var3;
      byte[] var5 = var1.takeFile(this.field1607 >> 16 & '\uffff', this.field1607 & '\uffff');
      Buffer var6 = new Buffer(var5);
      int var7 = var6.readUnsignedByte();
      int var8 = var6.readUnsignedShort();
      byte[] var9 = var2.getFile(var8, 0);
      this.field1603 = new Skeleton(var8, var9);
      this.method3004(var6, var7);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IS)V",
      garbageValue = "-5453"
   )
   void method3004(Buffer var1, int var2) {
      var1.readUnsignedShort();
      var1.readUnsignedShort();
      this.field1609 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedShort();
      this.field1605 = new class125[this.field1603.method4422().method4400()][];
      this.field1604 = new class125[this.field1603.method4426()][];

      for(int var4 = 0; var4 < var3; ++var4) {
         class126 var5 = class343.method6662(var1.readUnsignedByte());
         int var6 = var1.readShortSmart();
         class127 var7 = class34.method490(var1.readUnsignedByte());
         class125 var8 = new class125();
         var8.method2943(var1, var2);
         int var9 = var5.method2974();
         class125[][] var10;
         if (var5 == class126.field1563) {
            var10 = this.field1605;
         } else {
            var10 = this.field1604;
         }

         if (var10[var6] == null) {
            var10[var6] = new class125[var9];
         }

         var10[var6][var7.method2989()] = var8;
         if (var5 == class126.field1566) {
            this.field1606 = true;
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "854058965"
   )
   public int method3021() {
      return this.field1609;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-98"
   )
   public boolean method3005() {
      return this.field1606;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ILdt;III)V",
      garbageValue = "2132738190"
   )
   public void method3003(int var1, class123 var2, int var3, int var4) {
      class410 var5 = class326.method6395();
      this.method3007(var5, var3, var2, var1);
      this.method3009(var5, var3, var2, var1);
      this.method3008(var5, var3, var2, var1);
      var2.method2907(var5);
      var5.method7795();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Loj;ILdt;II)V",
      garbageValue = "826275338"
   )
   void method3007(class410 var1, int var2, class123 var3, int var4) {
      float[] var5 = var3.method2909(this.field1609);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1605[var2] != null) {
         class125 var9 = this.field1605[var2][0];
         class125 var10 = this.field1605[var2][1];
         class125 var11 = this.field1605[var2][2];
         if (var9 != null) {
            var6 = var9.method2966(var4);
         }

         if (var10 != null) {
            var7 = var10.method2966(var4);
         }

         if (var11 != null) {
            var8 = var11.method2966(var4);
         }
      }

      class409 var16 = SpotAnimationDefinition.method3751();
      var16.method7758(1.0F, 0.0F, 0.0F, var6);
      class409 var14 = SpotAnimationDefinition.method3751();
      var14.method7758(0.0F, 1.0F, 0.0F, var7);
      class409 var15 = SpotAnimationDefinition.method3751();
      var15.method7758(0.0F, 0.0F, 1.0F, var8);
      class409 var12 = SpotAnimationDefinition.method3751();
      var12.method7760(var15);
      var12.method7760(var16);
      var12.method7760(var14);
      class410 var13 = class326.method6395();
      var13.method7789(var12);
      var1.method7788(var13);
      var16.method7775();
      var14.method7775();
      var15.method7775();
      var12.method7775();
      var13.method7795();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Loj;ILdt;II)V",
      garbageValue = "704346834"
   )
   void method3008(class410 var1, int var2, class123 var3, int var4) {
      float[] var5 = var3.method2910(this.field1609);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1605[var2] != null) {
         class125 var9 = this.field1605[var2][3];
         class125 var10 = this.field1605[var2][4];
         class125 var11 = this.field1605[var2][5];
         if (var9 != null) {
            var6 = var9.method2966(var4);
         }

         if (var10 != null) {
            var7 = var10.method2966(var4);
         }

         if (var11 != null) {
            var8 = var11.method2966(var4);
         }
      }

      var1.field4612[12] = var6;
      var1.field4612[13] = var7;
      var1.field4612[14] = var8;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loj;ILdt;II)V",
      garbageValue = "292297142"
   )
   void method3009(class410 var1, int var2, class123 var3, int var4) {
      float[] var5 = var3.method2911(this.field1609);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1605[var2] != null) {
         class125 var9 = this.field1605[var2][6];
         class125 var10 = this.field1605[var2][7];
         class125 var11 = this.field1605[var2][8];
         if (var9 != null) {
            var6 = var9.method2966(var4);
         }

         if (var10 != null) {
            var7 = var10.method2966(var4);
         }

         if (var11 != null) {
            var8 = var11.method2966(var4);
         }
      }

      class410 var12 = class326.method6395();
      var12.method7786(var6, var7, var8);
      var1.method7788(var12);
      var12.method7795();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lbv;",
      garbageValue = "21"
   )
   @Export("Messages_getByChannelAndID")
   static Message Messages_getByChannelAndID(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var2.getMessage(var1);
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Object;",
      garbageValue = "-1832346450"
   )
   static Object method3031(int var0) {
      return class346.method6683((class456)World.findEnumerated(class456.method8407(), var0));
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1852132705"
   )
   static final void method3029() {
      for(int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
         int var10002 = Client.queuedSoundEffectDelays[var0]--;
         if (Client.queuedSoundEffectDelays[var0] >= -10) {
            SoundEffect var1 = Client.soundEffects[var0];
            if (var1 == null) {
               Object var10000 = null;
               var1 = SoundEffect.readSoundEffect(WorldMapSection0.field2932, Client.soundEffectIds[var0], 0);
               if (var1 == null) {
                  continue;
               }

               int[] var12 = Client.queuedSoundEffectDelays;
               var12[var0] += var1.calculateDelay();
               Client.soundEffects[var0] = var1;
            }

            if (Client.queuedSoundEffectDelays[var0] < 0) {
               int var2;
               if (Client.soundLocations[var0] != 0) {
                  int var3 = (Client.soundLocations[var0] & 255) * 128;
                  int var4 = Client.soundLocations[var0] >> 16 & 255;
                  int var5 = var4 * 128 + 64 - class155.localPlayer.x;
                  if (var5 < 0) {
                     var5 = -var5;
                  }

                  int var6 = Client.soundLocations[var0] >> 8 & 255;
                  int var7 = var6 * 128 + 64 - class155.localPlayer.y;
                  if (var7 < 0) {
                     var7 = -var7;
                  }

                  int var8 = var7 + var5 - 128;
                  if (var8 > var3) {
                     Client.queuedSoundEffectDelays[var0] = -100;
                     continue;
                  }

                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var2 = (var3 - var8) * StructComposition.clientPreferences.method2506() / var3;
               } else {
                  var2 = StructComposition.clientPreferences.method2426();
               }

               if (var2 > 0) {
                  RawSound var9 = var1.toRawSound().resample(DevicePcmPlayerProvider.decimator);
                  RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
                  var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
                  ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var10);
               }

               Client.queuedSoundEffectDelays[var0] = -100;
            }
         } else {
            --Client.soundEffectCount;

            for(int var11 = var0; var11 < Client.soundEffectCount; ++var11) {
               Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1];
               Client.soundEffects[var11] = Client.soundEffects[var11 + 1];
               Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1];
               Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1];
               Client.soundLocations[var11] = Client.soundLocations[var11 + 1];
            }

            --var0;
         }
      }

      if (Client.playingJingle && !class159.method3345()) {
         if (StructComposition.clientPreferences.method2425() != 0 && Client.currentTrackGroupId != -1) {
            class29.method426(class162.archive6, Client.currentTrackGroupId, 0, StructComposition.clientPreferences.method2425(), false);
         }

         Client.playingJingle = false;
      }

   }
}
