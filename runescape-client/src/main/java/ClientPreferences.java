import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("ClientPreferences")
public class ClientPreferences {
   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive9")
   static Archive archive9;
   @ObfuscatedName("an")
   @Export("roofsHidden")
   boolean roofsHidden;
   @ObfuscatedName("ao")
   @Export("hideUsername")
   boolean hideUsername = false;
   @ObfuscatedName("av")
   @Export("titleMusicDisabled")
   boolean titleMusicDisabled;
   @ObfuscatedName("aq")
   @Export("displayFps")
   boolean displayFps = false;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 56202733
   )
   int field1254;
   @ObfuscatedName("ar")
   @Export("brightness")
   double brightness = 0.8;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -748755615
   )
   @Export("musicVolume")
   int musicVolume = 127;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1580172555
   )
   @Export("soundEffectsVolume")
   int soundEffectsVolume = 127;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -899530291
   )
   @Export("areaSoundEffectsVolume")
   int areaSoundEffectsVolume = 127;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -485702959
   )
   int field1261 = -1;
   @ObfuscatedName("am")
   @Export("rememberedUsername")
   String rememberedUsername = null;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 909376049
   )
   @Export("windowMode")
   int windowMode = 1;
   @ObfuscatedName("ae")
   @Export("parameters")
   final Map parameters = new LinkedHashMap();

   ClientPreferences() {
      this.method2425(true);
   }

   @ObfuscatedSignature(
      descriptor = "(Lsy;)V"
   )
   ClientPreferences(Buffer var1) {
      if (var1 != null && var1.array != null) {
         int var2 = var1.readUnsignedByte();
         if (var2 >= 0 && var2 <= 10) {
            if (var1.readUnsignedByte() == 1) {
               this.roofsHidden = true;
            }

            if (var2 > 1) {
               this.titleMusicDisabled = var1.readUnsignedByte() == 1;
            }

            if (var2 > 3) {
               this.windowMode = var1.readUnsignedByte();
            }

            if (var2 > 2) {
               int var3 = var1.readUnsignedByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.parameters.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
            }

            if (var2 > 5) {
               this.hideUsername = var1.readBoolean();
            }

            if (var2 > 6) {
               this.brightness = (double)var1.readUnsignedByte() / 100.0;
               this.musicVolume = var1.readUnsignedByte();
               this.soundEffectsVolume = var1.readUnsignedByte();
               this.areaSoundEffectsVolume = var1.readUnsignedByte();
            }

            if (var2 > 7) {
               this.field1261 = var1.readUnsignedByte();
            }

            if (var2 > 8) {
               this.displayFps = var1.readUnsignedByte() == 1;
            }

            if (var2 > 9) {
               this.field1254 = var1.readInt();
            }
         } else {
            this.method2425(true);
         }
      } else {
         this.method2425(true);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1710618"
   )
   void method2425(boolean var1) {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)Lsy;",
      garbageValue = "69"
   )
   @Export("toBuffer")
   Buffer toBuffer() {
      Buffer var1 = new Buffer(417, true);
      var1.writeByte(10);
      var1.writeByte(this.roofsHidden ? 1 : 0);
      var1.writeByte(this.titleMusicDisabled ? 1 : 0);
      var1.writeByte(this.windowMode);
      var1.writeByte(this.parameters.size());
      Iterator var2 = this.parameters.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.writeInt((Integer)var3.getKey());
         var1.writeInt((Integer)var3.getValue());
      }

      var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
      var1.writeBoolean(this.hideUsername);
      var1.writeByte((int)(100.0 * this.brightness));
      var1.writeByte(this.musicVolume);
      var1.writeByte(this.soundEffectsVolume);
      var1.writeByte(this.areaSoundEffectsVolume);
      var1.writeByte(this.field1261);
      var1.writeByte(this.displayFps ? 1 : 0);
      var1.writeInt(this.field1254);
      return var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1391541433"
   )
   void method2432(boolean var1) {
      this.roofsHidden = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1333321648"
   )
   boolean method2458() {
      return this.roofsHidden;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "278116329"
   )
   void method2459(boolean var1) {
      this.hideUsername = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2098142981"
   )
   boolean method2429() {
      return this.hideUsername;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "147492823"
   )
   void method2500(boolean var1) {
      this.titleMusicDisabled = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "846356129"
   )
   boolean method2445() {
      return this.titleMusicDisabled;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-9"
   )
   void method2523(boolean var1) {
      this.displayFps = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   void method2433() {
      this.method2523(!this.displayFps);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2082731266"
   )
   boolean method2426() {
      return this.displayFps;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-6657"
   )
   void method2435(int var1) {
      this.field1254 = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-599544988"
   )
   int method2529() {
      return this.field1254;
   }

   @ObfuscatedName("am")
   void method2522(double var1) {
      this.brightness = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)D",
      garbageValue = "64"
   )
   double method2438() {
      return this.brightness;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   void method2428(int var1) {
      this.musicVolume = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-348477158"
   )
   int method2440() {
      return this.musicVolume;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1816212673"
   )
   @Export("updateSoundEffectVolume")
   void updateSoundEffectVolume(int var1) {
      this.soundEffectsVolume = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1553842749"
   )
   int method2442() {
      return this.soundEffectsVolume;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1358573710"
   )
   void method2443(int var1) {
      this.areaSoundEffectsVolume = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "8"
   )
   int method2463() {
      return this.areaSoundEffectsVolume;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-474744901"
   )
   void method2439(String var1) {
      this.rememberedUsername = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-832983404"
   )
   String method2446() {
      return this.rememberedUsername;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "77"
   )
   void method2447(int var1) {
      this.field1261 = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1119305336"
   )
   int method2448() {
      return this.field1261;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "103"
   )
   void method2510(int var1) {
      this.windowMode = var1;
      class146.savePreferences();
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "87"
   )
   int method2450() {
      return this.windowMode;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)V",
      garbageValue = "106"
   )
   void method2488(String var1, int var2) {
      int var3 = this.method2454(var1);
      if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
         Iterator var4 = this.parameters.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.parameters.put(var3, var2);
      class146.savePreferences();
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-763604251"
   )
   boolean method2452(String var1) {
      int var2 = this.method2454(var1);
      return this.parameters.containsKey(var2);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-1472188766"
   )
   int method2453(String var1) {
      int var2 = this.method2454(var1);
      return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-1940131826"
   )
   int method2454(String var1) {
      String var3 = var1.toLowerCase();
      int var4 = var3.length();
      int var5 = 0;

      for(int var6 = 0; var6 < var4; ++var6) {
         var5 = (var5 << 5) - var5 + var3.charAt(var6);
      }

      return var5;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "2059491791"
   )
   static String method2537(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class366.field4340[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class366.field4340[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class366.field4340[(var6 & 15) << 2 | var7 >>> 6]).append(class366.field4340[var7 & 63]);
            } else {
               var3.append(class366.field4340[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class366.field4340[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }
}
