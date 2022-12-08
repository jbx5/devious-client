import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("ClientPreferences")
public class ClientPreferences {
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive8")
   static Archive archive8;
   @ObfuscatedName("m")
   @Export("roofsHidden")
   boolean roofsHidden;
   @ObfuscatedName("q")
   @Export("hideUsername")
   boolean hideUsername = false;
   @ObfuscatedName("f")
   @Export("titleMusicDisabled")
   boolean titleMusicDisabled;
   @ObfuscatedName("r")
   @Export("displayFps")
   boolean displayFps = false;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 150827165
   )
   int field1296;
   @ObfuscatedName("b")
   @Export("brightness")
   double brightness = 0.8;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -631517997
   )
   @Export("musicVolume")
   int musicVolume = 127;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1737283137
   )
   @Export("soundEffectsVolume")
   int soundEffectsVolume = 127;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1250836455
   )
   @Export("areaSoundEffectsVolume")
   int areaSoundEffectsVolume = 127;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1676041029
   )
   int field1300 = -1;
   @ObfuscatedName("n")
   @Export("rememberedUsername")
   String rememberedUsername = null;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -628738235
   )
   @Export("windowMode")
   int windowMode = 1;
   @ObfuscatedName("a")
   @Export("parameters")
   final Map parameters = new LinkedHashMap();

   ClientPreferences() {
      this.method2409(true);
   }

   @ObfuscatedSignature(
      descriptor = "(Lqy;)V"
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
               this.field1300 = var1.readUnsignedByte();
            }

            if (var2 > 8) {
               this.displayFps = var1.readUnsignedByte() == 1;
            }

            if (var2 > 9) {
               this.field1296 = var1.readInt();
            }
         } else {
            this.method2409(true);
         }
      } else {
         this.method2409(true);
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "1"
   )
   void method2409(boolean var1) {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Lqy;",
      garbageValue = "-1732648006"
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
      var1.writeByte((int)(this.brightness * 100.0));
      var1.writeByte(this.musicVolume);
      var1.writeByte(this.soundEffectsVolume);
      var1.writeByte(this.areaSoundEffectsVolume);
      var1.writeByte(this.field1300);
      var1.writeByte(this.displayFps ? 1 : 0);
      var1.writeInt(this.field1296);
      return var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "533129640"
   )
   void method2486(boolean var1) {
      this.roofsHidden = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "105464922"
   )
   boolean method2412() {
      return this.roofsHidden;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "64"
   )
   void method2461(boolean var1) {
      this.hideUsername = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1900607558"
   )
   boolean method2413() {
      return this.hideUsername;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "7"
   )
   void method2448(boolean var1) {
      this.titleMusicDisabled = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "39"
   )
   boolean method2428() {
      return this.titleMusicDisabled;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "8323"
   )
   void method2470(boolean var1) {
      this.displayFps = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "141048333"
   )
   void method2433() {
      this.method2470(!this.displayFps);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1316033707"
   )
   boolean method2419() {
      return this.displayFps;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "54"
   )
   void method2420(int var1) {
      this.field1296 = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1786491107"
   )
   int method2421() {
      return this.field1296;
   }

   @ObfuscatedName("k")
   void method2475(double var1) {
      this.brightness = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)D",
      garbageValue = "2073863373"
   )
   double method2422() {
      return this.brightness;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "18863"
   )
   void method2414(int var1) {
      this.musicVolume = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-5026"
   )
   int method2425() {
      return this.musicVolume;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-25"
   )
   @Export("updateSoundEffectVolume")
   void updateSoundEffectVolume(int var1) {
      this.soundEffectsVolume = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1444608091"
   )
   int method2426() {
      return this.soundEffectsVolume;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-315220076"
   )
   void method2427(int var1) {
      this.areaSoundEffectsVolume = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1615345308"
   )
   int method2506() {
      return this.areaSoundEffectsVolume;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1040224572"
   )
   void method2429(String var1) {
      this.rememberedUsername = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-10"
   )
   String method2430() {
      return this.rememberedUsername;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1027292403"
   )
   void method2431(int var1) {
      this.field1300 = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1999692147"
   )
   int method2424() {
      return this.field1300;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-9009"
   )
   void method2460(int var1) {
      this.windowMode = var1;
      Tile.savePreferences();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1455962060"
   )
   int method2434() {
      return this.windowMode;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "8447783"
   )
   void method2435(String var1, int var2) {
      int var3 = this.method2438(var1);
      if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
         Iterator var4 = this.parameters.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.parameters.put(var3, var2);
      Tile.savePreferences();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-2059825929"
   )
   boolean method2436(String var1) {
      int var2 = this.method2438(var1);
      return this.parameters.containsKey(var2);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-2095892809"
   )
   int method2437(String var1) {
      int var2 = this.method2438(var1);
      return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "41"
   )
   int method2438(String var1) {
      String var3 = var1.toLowerCase();
      int var4 = var3.length();
      int var5 = 0;

      for(int var6 = 0; var6 < var4; ++var6) {
         var5 = (var5 << 5) - var5 + var3.charAt(var6);
      }

      return var5;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1700481860"
   )
   @Export("ItemContainer_getCount")
   static int ItemContainer_getCount(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
      }
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      descriptor = "(Lct;II)V",
      garbageValue = "-935643958"
   )
   static final void method2513(Actor var0, int var1) {
      ScriptFrame.worldToScreen(var0.x, var0.y, var1);
   }
}
