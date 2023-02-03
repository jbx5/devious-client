import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("SoundCache")
public class SoundCache {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("soundEffectIndex")
   AbstractArchive soundEffectIndex;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("musicSampleIndex")
   AbstractArchive musicSampleIndex;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("musicSamples")
   NodeHashTable musicSamples = new NodeHashTable(256);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("rawSounds")
   NodeHashTable rawSounds = new NodeHashTable(256);

   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;)V"
   )
   public SoundCache(AbstractArchive var1, AbstractArchive var2) {
      this.soundEffectIndex = var1;
      this.musicSampleIndex = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II[IB)Lav;",
      garbageValue = "14"
   )
   @Export("getSoundEffect0")
   RawSound getSoundEffect0(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      RawSound var7 = (RawSound)this.rawSounds.get(var5);
      if (var7 != null) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
         if (var8 == null) {
            return null;
         } else {
            var7 = var8.toRawSound();
            this.rawSounds.put(var7, var5);
            if (var3 != null) {
               var3[0] -= var7.samples.length;
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II[II)Lav;",
      garbageValue = "-1578715416"
   )
   @Export("getMusicSample0")
   RawSound getMusicSample0(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      RawSound var7 = (RawSound)this.rawSounds.get(var5);
      if (var7 != null) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
         if (var8 == null) {
            var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
            if (var8 == null) {
               return null;
            }

            this.musicSamples.put(var8, var5);
         }

         var7 = var8.toRawSound(var3);
         if (var7 == null) {
            return null;
         } else {
            var8.remove();
            this.rawSounds.put(var7, var5);
            return var7;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I[II)Lav;",
      garbageValue = "-2120561438"
   )
   @Export("getSoundEffect")
   public RawSound getSoundEffect(int var1, int[] var2) {
      if (this.soundEffectIndex.getGroupCount() == 1) {
         return this.getSoundEffect0(0, var1, var2);
      } else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
         return this.getSoundEffect0(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I[II)Lav;",
      garbageValue = "-1244571189"
   )
   @Export("getMusicSample")
   public RawSound getMusicSample(int var1, int[] var2) {
      if (this.musicSampleIndex.getGroupCount() == 1) {
         return this.getMusicSample0(0, var1, var2);
      } else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
         return this.getMusicSample0(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "106"
   )
   public static int method871(int var0) {
      return class288.field3340[var0];
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-22"
   )
   @Export("runWidgetOnLoadListener")
   static void runWidgetOnLoadListener(int var0) {
      if (var0 != -1) {
         if (class153.loadInterface(var0)) {
            Widget[] var1 = WorldMapLabel.Widget_interfaceComponents[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Widget var3 = var1[var2];
               if (var3.onLoad != null) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.onLoad;
                  ItemLayer.runScript(var4, 5000000, 0);
               }
            }

         }
      }
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      descriptor = "(Lge;IIII)V",
      garbageValue = "1281233177"
   )
   static void method868(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && PacketWriter.clientPreferences.method2499() != 0) {
         if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
            class461.method8491(var0.soundEffects[var1], var2, var3);
         }
      }
   }

   @ObfuscatedName("lh")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   static final void method869() {
      PacketBufferNode var0 = Renderable.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
      Client.packetWriter.addNode(var0);
      Interpreter.field866 = true;

      for(InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
         if (var1.type == 0 || var1.type == 3) {
            class10.closeInterface(var1, true);
         }
      }

      if (Client.meslayerContinueWidget != null) {
         LoginScreenAnimation.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      Interpreter.field866 = false;
   }

   @ObfuscatedName("le")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1985115844"
   )
   static final void method861() {
      Client.field694 = Client.cycleCntr;
      VarbitComposition.field2116 = true;
   }
}
