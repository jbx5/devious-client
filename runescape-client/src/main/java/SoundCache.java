import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("SoundCache")
public class SoundCache {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -494220155
   )
   public static int field337;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("soundEffectIndex")
   AbstractArchive soundEffectIndex;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("musicSampleIndex")
   AbstractArchive musicSampleIndex;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("musicSamples")
   NodeHashTable musicSamples = new NodeHashTable(256);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("rawSounds")
   NodeHashTable rawSounds = new NodeHashTable(256);

   @ObfuscatedSignature(
      descriptor = "(Llg;Llg;)V"
   )
   public SoundCache(AbstractArchive var1, AbstractArchive var2) {
      this.soundEffectIndex = var1;
      this.musicSampleIndex = var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II[II)Lam;",
      garbageValue = "1144008549"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II[IB)Lam;",
      garbageValue = "8"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I[II)Lam;",
      garbageValue = "1063762449"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I[II)Lam;",
      garbageValue = "1305792027"
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-141317251"
   )
   static void method878() {
      Iterator var0 = Messages.Messages_hashTable.iterator();

      while(var0.hasNext()) {
         Message var1 = (Message)var0.next();
         var1.clearIsFromIgnored();
      }

   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1956654550"
   )
   static final void method874(boolean var0) {
      if (var0) {
         Client.field528 = Login.field900 ? class131.field1564 : class131.field1561;
      } else {
         LinkedHashMap var1 = BufferedSink.clientPreferences.parameters;
         String var3 = Login.Login_username;
         int var4 = var3.length();
         int var5 = 0;

         for(int var6 = 0; var6 < var4; ++var6) {
            var5 = (var5 << 5) - var5 + var3.charAt(var6);
         }

         Client.field528 = var1.containsKey(var5) ? class131.field1560 : class131.field1559;
      }

   }
}
