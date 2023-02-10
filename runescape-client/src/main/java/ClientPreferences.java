import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ClientPreferences")
public class ClientPreferences {
   @ObfuscatedName("z")
   @Export("roofsHidden")
   boolean roofsHidden;
   @ObfuscatedName("j")
   @Export("hideUsername")
   boolean hideUsername = false;
   @ObfuscatedName("i")
   @Export("titleMusicDisabled")
   boolean titleMusicDisabled;
   @ObfuscatedName("n")
   @Export("displayFps")
   boolean displayFps = false;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -757807693
   )
   int field1270;
   @ObfuscatedName("k")
   @Export("brightness")
   double brightness = 0.8;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1582995675
   )
   @Export("musicVolume")
   int musicVolume = 127;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -759122883
   )
   @Export("soundEffectsVolume")
   int soundEffectsVolume = 127;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1069704695
   )
   @Export("areaSoundEffectsVolume")
   int areaSoundEffectsVolume = 127;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -211175145
   )
   int field1275 = -1;
   @ObfuscatedName("t")
   @Export("rememberedUsername")
   String rememberedUsername = null;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1652253159
   )
   @Export("windowMode")
   int windowMode = 1;
   @ObfuscatedName("p")
   @Export("parameters")
   final Map parameters = new LinkedHashMap();

   ClientPreferences() {
      this.method2480(true);
   }

   @ObfuscatedSignature(
      descriptor = "(Lrd;)V"
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
               this.field1275 = var1.readUnsignedByte();
            }

            if (var2 > 8) {
               this.displayFps = var1.readUnsignedByte() == 1;
            }

            if (var2 > 9) {
               this.field1270 = var1.readInt();
            }
         } else {
            this.method2480(true);
         }
      } else {
         this.method2480(true);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "54"
   )
   void method2480(boolean var1) {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Lrd;",
      garbageValue = "1661663667"
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
      var1.writeByte(this.field1275);
      var1.writeByte(this.displayFps ? 1 : 0);
      var1.writeInt(this.field1270);
      return var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-109"
   )
   void method2551(boolean var1) {
      this.roofsHidden = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "180"
   )
   boolean method2572() {
      return this.roofsHidden;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "2"
   )
   void method2483(boolean var1) {
      this.hideUsername = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "8123"
   )
   boolean method2484() {
      return this.hideUsername;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-642291381"
   )
   void method2563(boolean var1) {
      this.titleMusicDisabled = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1585419909"
   )
   boolean method2570() {
      return this.titleMusicDisabled;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "810617878"
   )
   void method2485(boolean var1) {
      this.displayFps = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "915076830"
   )
   void method2488() {
      this.method2485(!this.displayFps);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "2"
   )
   boolean method2489() {
      return this.displayFps;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-8"
   )
   void method2490(int var1) {
      this.field1270 = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2141806502"
   )
   int method2491() {
      return this.field1270;
   }

   @ObfuscatedName("h")
   void method2583(double var1) {
      this.brightness = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(B)D",
      garbageValue = "76"
   )
   double method2557() {
      return this.brightness;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "8"
   )
   void method2533(int var1) {
      this.musicVolume = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-348918421"
   )
   int method2495() {
      return this.musicVolume;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "107"
   )
   @Export("updateSoundEffectVolume")
   void updateSoundEffectVolume(int var1) {
      this.soundEffectsVolume = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1825265297"
   )
   int method2497() {
      return this.soundEffectsVolume;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1384124032"
   )
   void method2481(int var1) {
      this.areaSoundEffectsVolume = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1799077602"
   )
   int method2499() {
      return this.areaSoundEffectsVolume;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-83522118"
   )
   void method2500(String var1) {
      this.rememberedUsername = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-919916182"
   )
   String method2545() {
      return this.rememberedUsername;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1162088376"
   )
   void method2502(int var1) {
      this.field1275 = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   int method2503() {
      return this.field1275;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "724225707"
   )
   void method2504(int var1) {
      this.windowMode = var1;
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1675025735"
   )
   int method2505() {
      return this.windowMode;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-1508652053"
   )
   void method2589(String var1, int var2) {
      int var3 = this.method2509(var1);
      if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
         Iterator var4 = this.parameters.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.parameters.put(var3, var2);
      SoundSystem.savePreferences();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-1879605728"
   )
   boolean method2507(String var1) {
      int var2 = this.method2509(var1);
      return this.parameters.containsKey(var2);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-2142036926"
   )
   int method2508(String var1) {
      int var2 = this.method2509(var1);
      return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "14"
   )
   int method2509(String var1) {
      return GrandExchangeOfferAgeComparator.method6684(var1.toLowerCase());
   }
}
