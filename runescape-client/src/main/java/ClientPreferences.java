import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ce")
@Implements("ClientPreferences")
public class ClientPreferences {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1005751115
   )
   @Export("ClientPreferences_optionCount")
   static int ClientPreferences_optionCount = 10;
   @ObfuscatedName("c")
   @Export("roofsHidden")
   boolean roofsHidden;
   @ObfuscatedName("x")
   @Export("hideUsername")
   boolean hideUsername = false;
   @ObfuscatedName("h")
   @Export("titleMusicDisabled")
   boolean titleMusicDisabled;
   @ObfuscatedName("j")
   @Export("displayFps")
   boolean displayFps = false;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1431338983
   )
   int field1246;
   @ObfuscatedName("d")
   @Export("brightness")
   double brightness = 0.8;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 358361133
   )
   @Export("musicVolume")
   int musicVolume = 127;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1349772247
   )
   @Export("soundEffectsVolume")
   int soundEffectsVolume = 127;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1070223507
   )
   @Export("areaSoundEffectsVolume")
   int areaSoundEffectsVolume = 127;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -264461083
   )
   int field1249 = -1;
   @ObfuscatedName("p")
   @Export("rememberedUsername")
   String rememberedUsername = null;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1315476699
   )
   @Export("windowMode")
   int windowMode = 1;
   @ObfuscatedName("o")
   @Export("parameters")
   LinkedHashMap parameters = new LinkedHashMap();

   ClientPreferences() {
      this.method2376(true);
   }

   @ObfuscatedSignature(
      descriptor = "(Lqr;)V"
   )
   ClientPreferences(Buffer var1) {
      if (var1 != null && var1.array != null) {
         int var2 = var1.readUnsignedByte();
         if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
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
               this.field1249 = var1.readUnsignedByte();
            }

            if (var2 > 8) {
               this.displayFps = var1.readUnsignedByte() == 1;
            }

            if (var2 > 9) {
               this.field1246 = var1.readInt();
            }
         } else {
            this.method2376(true);
         }
      } else {
         this.method2376(true);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "127"
   )
   void method2376(boolean var1) {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Lqr;",
      garbageValue = "-121"
   )
   @Export("toBuffer")
   Buffer toBuffer() {
      Buffer var1 = new Buffer(100);
      var1.writeByte(ClientPreferences_optionCount);
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
      var1.writeByte(this.field1249);
      var1.writeByte(this.displayFps ? 1 : 0);
      var1.writeInt(this.field1246);
      return var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-14"
   )
   void method2378(boolean var1) {
      this.roofsHidden = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2135615375"
   )
   boolean method2452() {
      return this.roofsHidden;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "846549147"
   )
   void method2430(boolean var1) {
      this.hideUsername = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1401725851"
   )
   boolean method2381() {
      return this.hideUsername;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1347587891"
   )
   void method2382(boolean var1) {
      this.titleMusicDisabled = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1832425119"
   )
   boolean method2383() {
      return this.titleMusicDisabled;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1070053753"
   )
   void method2384(boolean var1) {
      this.displayFps = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "125"
   )
   void method2434() {
      this.method2384(!this.displayFps);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-72"
   )
   boolean method2386() {
      return this.displayFps;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2066217756"
   )
   void method2387(int var1) {
      this.field1246 = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-58"
   )
   int method2441() {
      return this.field1246;
   }

   @ObfuscatedName("o")
   void method2389(double var1) {
      this.brightness = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)D",
      garbageValue = "362060040"
   )
   double method2392() {
      return this.brightness;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1795867144"
   )
   void method2390(int var1) {
      this.musicVolume = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-66"
   )
   int method2391() {
      return this.musicVolume;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1159214815"
   )
   @Export("updateSoundEffectVolume")
   void updateSoundEffectVolume(int var1) {
      this.soundEffectsVolume = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-14621432"
   )
   int method2427() {
      return this.soundEffectsVolume;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1149761993"
   )
   void method2394(int var1) {
      this.areaSoundEffectsVolume = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "112"
   )
   int method2411() {
      return this.areaSoundEffectsVolume;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1394488385"
   )
   void method2385(String var1) {
      this.rememberedUsername = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/lang/String;",
      garbageValue = "4134"
   )
   String method2397() {
      return this.rememberedUsername;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-19"
   )
   void method2398(int var1) {
      this.field1249 = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "72"
   )
   int method2472() {
      return this.field1249;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "568981163"
   )
   void method2453(int var1) {
      this.windowMode = var1;
      class149.savePreferences();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2131481267"
   )
   int method2401() {
      return this.windowMode;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "1848789338"
   )
   static int method2471(int var0, Script var1, boolean var2) {
      Widget var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTEXT) {
         Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.text;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollHeight;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelZoom;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleX;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleZ;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleY;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTRANS) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.transparencyTop;
         return 1;
      } else if (var0 == 2610) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.transparencyBot;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.color;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.color2;
         return 1;
      } else if (var0 == 2613) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         class295 var4;
         if (var0 == 2617) {
            var4 = var3.method6153();
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3399 : 0;
         }

         if (var0 == 2618) {
            var4 = var3.method6153();
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3401 : 0;
            return 1;
         } else {
            class300 var7;
            if (var0 == 2619) {
               var7 = var3.method6076();
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5816().method6880() : "";
               return 1;
            } else if (var0 == 2620) {
               var4 = var3.method6153();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3400 : 0;
               return 1;
            } else if (var0 == 2621) {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5826() : 0;
               return 1;
            } else if (var0 == 2622) {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5827() : 0;
               return 1;
            } else if (var0 == 2623) {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5828() : 0;
               return 1;
            } else if (var0 == 2624) {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null && var7.method5800() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5817().method7116() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var7 = var3.method6076();
                  int var5 = var7 != null ? var7.method5898() : 0;
                  int var6 = var7 != null ? var7.method5821() : 0;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 2628) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5821() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method6030() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5829() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5954() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5832() : 0;
                  return 1;
               } else {
                  class28 var8;
                  if (var0 == 2633) {
                     var8 = var3.method6078();
                     Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = var8 != null ? var8.method408(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var8 = var3.method6078();
                     Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = var8 != null ? var8.method409((char)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null && var7.method5819() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "-480256974"
   )
   static final void method2470(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = var6 - 334;
      if (var8 < 0) {
         var8 = 0;
      } else if (var8 > 100) {
         var8 = 100;
      }

      int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
      int var7 = var5 * var9 / 256;
      var8 = 2048 - var3 & 2047;
      var9 = 2048 - var4 & 2047;
      int var10 = 0;
      int var11 = 0;
      int var12 = var7;
      int var13;
      int var14;
      int var15;
      if (var8 != 0) {
         var13 = Rasterizer3D.Rasterizer3D_sine[var8];
         var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
         var15 = var14 * var11 - var13 * var7 >> 16;
         var12 = var13 * var11 + var7 * var14 >> 16;
         var11 = var15;
      }

      if (var9 != 0) {
         var13 = Rasterizer3D.Rasterizer3D_sine[var9];
         var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
         var15 = var14 * var10 + var13 * var12 >> 16;
         var12 = var12 * var14 - var13 * var10 >> 16;
         var10 = var15;
      }

      if (Client.isCameraLocked) {
         SceneTilePaint.field2696 = var0 - var10;
         class103.field1344 = var1 - var11;
         class295.field3402 = var2 - var12;
         Widget.field3636 = var3;
         class31.field171 = var4;
      } else {
         TextureProvider.cameraX = var0 - var10;
         class31.cameraY = var1 - var11;
         class313.cameraZ = var2 - var12;
         class408.cameraPitch = var3;
         WorldMapSection1.cameraYaw = var4;
      }

      if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class31.oculusOrbFocalPointX >> 7 != class296.localPlayer.x >> 7 || PendingSpawn.oculusOrbFocalPointY >> 7 != class296.localPlayer.y >> 7)) {
         var13 = class296.localPlayer.plane;
         var14 = KeyHandler.baseX * 64 + (class31.oculusOrbFocalPointX >> 7);
         var15 = class158.baseY * 64 + (PendingSpawn.oculusOrbFocalPointY >> 7);
         class143.method3054(var14, var15, var13, true);
      }

   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-968494208"
   )
   @Export("drawScrollBar")
   static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
      WorldMap.scrollBarSprites[0].drawAt(var0, var1);
      WorldMap.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field714);
      int var5 = var3 * (var3 - 32) / var4;
      if (var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field568);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field570);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field570);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field570);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field570);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field569);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field569);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field569);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field569);
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      descriptor = "([Lkn;II)V",
      garbageValue = "-583948704"
   )
   @Export("runComponentCloseListeners")
   static final void runComponentCloseListeners(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if (var3 != null) {
            if (var3.type == 0) {
               if (var3.children != null) {
                  runComponentCloseListeners(var3.children, var1);
               }

               InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
               if (var4 != null) {
                  WallDecoration.runIntfCloseListeners(var4.group, var1);
               }
            }

            ScriptEvent var5;
            if (var1 == 0 && var3.onDialogAbort != null) {
               var5 = new ScriptEvent();
               var5.widget = var3;
               var5.args = var3.onDialogAbort;
               ServerPacket.runScriptEvent(var5);
            }

            if (var1 == 1 && var3.onSubChange != null) {
               if (var3.childIndex >= 0) {
                  Widget var6 = class281.getWidget(var3.id);
                  if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
                     continue;
                  }
               }

               var5 = new ScriptEvent();
               var5.widget = var3;
               var5.args = var3.onSubChange;
               ServerPacket.runScriptEvent(var5);
            }
         }
      }

   }
}
